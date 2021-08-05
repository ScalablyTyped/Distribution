package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotExtended extends StObject {
  
  /**
    * A list of conflicting revisions. Only set if explicitly requested (e.g. using a field mask or a request flag), or if the RPC guarantees that this field is set. The conflicting
    * revisions are sorted chronologically by their server creation time (oldest first). If there are too many conflicting revisions to return all of them in a single request this will
    * only contain the first batch. In such case, the presented conflicting revisions must be resolved first in order to fetch the next batch.
    */
  var conflictingRevisions: js.UndefOr[js.Array[SnapshotRevision]] = js.undefined
  
  /** An indicator whether the snapshot has any conflicting revisions or not. Always set. */
  var hasConflictingRevisions: js.UndefOr[Boolean] = js.undefined
  
  /** The current head revision (the canonical revision as understood by the server). */
  var headRevision: js.UndefOr[SnapshotRevision] = js.undefined
  
  /** An identifier of the snapshot,developer-specified. */
  var name: js.UndefOr[String] = js.undefined
}
object SnapshotExtended {
  
  inline def apply(): SnapshotExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotExtended]
  }
  
  extension [Self <: SnapshotExtended](x: Self) {
    
    inline def setConflictingRevisions(value: js.Array[SnapshotRevision]): Self = StObject.set(x, "conflictingRevisions", value.asInstanceOf[js.Any])
    
    inline def setConflictingRevisionsUndefined: Self = StObject.set(x, "conflictingRevisions", js.undefined)
    
    inline def setConflictingRevisionsVarargs(value: SnapshotRevision*): Self = StObject.set(x, "conflictingRevisions", js.Array(value :_*))
    
    inline def setHasConflictingRevisions(value: Boolean): Self = StObject.set(x, "hasConflictingRevisions", value.asInstanceOf[js.Any])
    
    inline def setHasConflictingRevisionsUndefined: Self = StObject.set(x, "hasConflictingRevisions", js.undefined)
    
    inline def setHeadRevision(value: SnapshotRevision): Self = StObject.set(x, "headRevision", value.asInstanceOf[js.Any])
    
    inline def setHeadRevisionUndefined: Self = StObject.set(x, "headRevision", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

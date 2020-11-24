package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotExtended extends js.Object {
  
  /**
    * A list of conflicting revisions. Only set if explicitly requested (e.g. using a field mask or a request flag), or if the RPC guarantees that this field is set. The conflicting
    * revisions are sorted chronologically by their server creation time (oldest first). If there are too many conflicting revisions to return all of them in a single request this will
    * only contain the first batch. In such case, the presented conflicting revisions must be resolved first in order to fetch the next batch.
    */
  var conflictingRevisions: js.UndefOr[js.Array[SnapshotRevision]] = js.native
  
  /** An indicator whether the snapshot has any conflicting revisions or not. Always set. */
  var hasConflictingRevisions: js.UndefOr[Boolean] = js.native
  
  /** The current head revision (the canonical revision as understood by the server). */
  var headRevision: js.UndefOr[SnapshotRevision] = js.native
  
  /** An identifier of the snapshot,developer-specified. */
  var name: js.UndefOr[String] = js.native
}
object SnapshotExtended {
  
  @scala.inline
  def apply(): SnapshotExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotExtended]
  }
  
  @scala.inline
  implicit class SnapshotExtendedOps[Self <: SnapshotExtended] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConflictingRevisionsVarargs(value: SnapshotRevision*): Self = this.set("conflictingRevisions", js.Array(value :_*))
    
    @scala.inline
    def setConflictingRevisions(value: js.Array[SnapshotRevision]): Self = this.set("conflictingRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictingRevisions: Self = this.set("conflictingRevisions", js.undefined)
    
    @scala.inline
    def setHasConflictingRevisions(value: Boolean): Self = this.set("hasConflictingRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasConflictingRevisions: Self = this.set("hasConflictingRevisions", js.undefined)
    
    @scala.inline
    def setHeadRevision(value: SnapshotRevision): Self = this.set("headRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadRevision: Self = this.set("headRevision", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

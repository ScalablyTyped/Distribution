package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveSnapshotHeadResponse extends StObject {
  
  /** The state of the snapshot. */
  var snapshot: js.UndefOr[SnapshotExtended] = js.undefined
}
object ResolveSnapshotHeadResponse {
  
  inline def apply(): ResolveSnapshotHeadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveSnapshotHeadResponse]
  }
  
  extension [Self <: ResolveSnapshotHeadResponse](x: Self) {
    
    inline def setSnapshot(value: SnapshotExtended): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}

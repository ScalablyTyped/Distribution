package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveSnapshotHeadResponse extends StObject {
  
  /** The state of the snapshot. */
  var snapshot: js.UndefOr[SnapshotExtended] = js.undefined
}
object ResolveSnapshotHeadResponse {
  
  @scala.inline
  def apply(): ResolveSnapshotHeadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveSnapshotHeadResponse]
  }
  
  @scala.inline
  implicit class ResolveSnapshotHeadResponseMutableBuilder[Self <: ResolveSnapshotHeadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: SnapshotExtended): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}

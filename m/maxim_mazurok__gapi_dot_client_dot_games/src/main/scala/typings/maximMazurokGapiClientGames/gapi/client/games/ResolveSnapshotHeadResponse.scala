package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveSnapshotHeadResponse extends js.Object {
  
  /** The state of the snapshot. */
  var snapshot: js.UndefOr[SnapshotExtended] = js.native
}
object ResolveSnapshotHeadResponse {
  
  @scala.inline
  def apply(): ResolveSnapshotHeadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveSnapshotHeadResponse]
  }
  
  @scala.inline
  implicit class ResolveSnapshotHeadResponseOps[Self <: ResolveSnapshotHeadResponse] (val x: Self) extends AnyVal {
    
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
    def setSnapshot(value: SnapshotExtended): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
  }
}

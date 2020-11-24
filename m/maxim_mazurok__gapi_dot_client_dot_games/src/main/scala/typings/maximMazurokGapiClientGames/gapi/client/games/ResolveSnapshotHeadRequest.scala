package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveSnapshotHeadRequest extends js.Object {
  
  /**
    * Required. The automatic resolution policy. All conflicts are resolved in chronological order, starting from the/ least recent. If the comparison metric is equal for the tentative
    * head and the conflict, the head wins.
    */
  var resolutionPolicy: js.UndefOr[String] = js.native
}
object ResolveSnapshotHeadRequest {
  
  @scala.inline
  def apply(): ResolveSnapshotHeadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveSnapshotHeadRequest]
  }
  
  @scala.inline
  implicit class ResolveSnapshotHeadRequestOps[Self <: ResolveSnapshotHeadRequest] (val x: Self) extends AnyVal {
    
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
    def setResolutionPolicy(value: String): Self = this.set("resolutionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionPolicy: Self = this.set("resolutionPolicy", js.undefined)
  }
}

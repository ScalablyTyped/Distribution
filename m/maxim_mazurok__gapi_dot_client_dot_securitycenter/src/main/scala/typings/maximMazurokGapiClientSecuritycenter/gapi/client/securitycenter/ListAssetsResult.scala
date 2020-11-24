package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssetsResult extends js.Object {
  
  /** Asset matching the search request. */
  var asset: js.UndefOr[Asset] = js.native
  
  /** State change of the asset between the points in time. */
  var stateChange: js.UndefOr[String] = js.native
}
object ListAssetsResult {
  
  @scala.inline
  def apply(): ListAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsResult]
  }
  
  @scala.inline
  implicit class ListAssetsResultOps[Self <: ListAssetsResult] (val x: Self) extends AnyVal {
    
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
    def setAsset(value: Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    
    @scala.inline
    def setStateChange(value: String): Self = this.set("stateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChange: Self = this.set("stateChange", js.undefined)
  }
}

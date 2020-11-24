package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAnalyticsRequest extends js.Object {
  
  /**
    * Optional. The ID of the Google Analytics property associated with the specified `FirebaseProject`. - If not set, then the Google Analytics property that is currently associated with
    * the specified `FirebaseProject` is removed. - If set, and the specified `FirebaseProject` is currently associated with a *different* Google Analytics property, then the response is
    * a `412 Precondition Failed` error.
    */
  var analyticsPropertyId: js.UndefOr[String] = js.native
}
object RemoveAnalyticsRequest {
  
  @scala.inline
  def apply(): RemoveAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveAnalyticsRequest]
  }
  
  @scala.inline
  implicit class RemoveAnalyticsRequestOps[Self <: RemoveAnalyticsRequest] (val x: Self) extends AnyVal {
    
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
    def setAnalyticsPropertyId(value: String): Self = this.set("analyticsPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsPropertyId: Self = this.set("analyticsPropertyId", js.undefined)
  }
}

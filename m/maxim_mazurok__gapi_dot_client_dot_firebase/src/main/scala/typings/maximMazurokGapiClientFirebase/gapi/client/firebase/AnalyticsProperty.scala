package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsProperty extends js.Object {
  
  /** The display name of the Google Analytics property associated with the specified `FirebaseProject`. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The globally unique, Google-assigned identifier of the Google Analytics property associated with the specified `FirebaseProject`. If you called
    * [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) to link the `FirebaseProject` with a Google Analytics account, the value in this `id` field is the same as the ID
    * of the property either specified or provisioned with that call to `AddGoogleAnalytics`.
    */
  var id: js.UndefOr[String] = js.native
}
object AnalyticsProperty {
  
  @scala.inline
  def apply(): AnalyticsProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsProperty]
  }
  
  @scala.inline
  implicit class AnalyticsPropertyOps[Self <: AnalyticsProperty] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}

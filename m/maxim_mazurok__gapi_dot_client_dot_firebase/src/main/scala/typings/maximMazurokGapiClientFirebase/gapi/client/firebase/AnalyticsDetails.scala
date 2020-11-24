package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsDetails extends js.Object {
  
  /** The Analytics Property object associated with the specified `FirebaseProject`. This object contains the details of the Google Analytics property associated with the Project. */
  var analyticsProperty: js.UndefOr[AnalyticsProperty] = js.native
  
  /**
    * - For `AndroidApps` and `IosApps`: a map of `app` to `streamId` for each Firebase App in the specified `FirebaseProject`. Each `app` and `streamId` appears only once. - For
    * `WebApps`: a map of `app` to `streamId` and `measurementId` for each `WebApp` in the specified `FirebaseProject`. Each `app`, `streamId`, and `measurementId` appears only once.
    */
  var streamMappings: js.UndefOr[js.Array[StreamMapping]] = js.native
}
object AnalyticsDetails {
  
  @scala.inline
  def apply(): AnalyticsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsDetails]
  }
  
  @scala.inline
  implicit class AnalyticsDetailsOps[Self <: AnalyticsDetails] (val x: Self) extends AnyVal {
    
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
    def setAnalyticsProperty(value: AnalyticsProperty): Self = this.set("analyticsProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsProperty: Self = this.set("analyticsProperty", js.undefined)
    
    @scala.inline
    def setStreamMappingsVarargs(value: StreamMapping*): Self = this.set("streamMappings", js.Array(value :_*))
    
    @scala.inline
    def setStreamMappings(value: js.Array[StreamMapping]): Self = this.set("streamMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamMappings: Self = this.set("streamMappings", js.undefined)
  }
}

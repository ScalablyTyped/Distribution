package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsProperty extends StObject {
  
  /** The display name of the Google Analytics property associated with the specified `FirebaseProject`. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The globally unique, Google-assigned identifier of the Google Analytics property associated with the specified `FirebaseProject`. If you called
    * [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) to link the `FirebaseProject` with a Google Analytics account, the value in this `id` field is the same as the ID
    * of the property either specified or provisioned with that call to `AddGoogleAnalytics`.
    */
  var id: js.UndefOr[String] = js.undefined
}
object AnalyticsProperty {
  
  @scala.inline
  def apply(): AnalyticsProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsProperty]
  }
  
  @scala.inline
  implicit class AnalyticsPropertyMutableBuilder[Self <: AnalyticsProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}

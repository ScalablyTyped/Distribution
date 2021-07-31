package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  /** Application name displayed on OAuth consent screen. */
  var applicationTitle: js.UndefOr[String] = js.undefined
  
  /** Output only. Identifier of the brand. NOTE: GCP project number achieves the same brand identification purpose as only one brand per project can be created. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether the brand is only intended for usage inside the G Suite organization only. */
  var orgInternalOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Support email displayed on the OAuth consent screen. */
  var supportEmail: js.UndefOr[String] = js.undefined
}
object Brand {
  
  @scala.inline
  def apply(): Brand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit class BrandMutableBuilder[Self <: Brand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationTitle(value: String): Self = StObject.set(x, "applicationTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationTitleUndefined: Self = StObject.set(x, "applicationTitle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrgInternalOnly(value: Boolean): Self = StObject.set(x, "orgInternalOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgInternalOnlyUndefined: Self = StObject.set(x, "orgInternalOnly", js.undefined)
    
    @scala.inline
    def setSupportEmail(value: String): Self = StObject.set(x, "supportEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportEmailUndefined: Self = StObject.set(x, "supportEmail", js.undefined)
  }
}

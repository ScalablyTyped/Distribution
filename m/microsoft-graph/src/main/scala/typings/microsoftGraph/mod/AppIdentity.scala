package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppIdentity extends StObject {
  
  // Refers to the Unique GUID representing Application Id in the Azure Active Directory.
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  // Refers to the Application Name displayed in the Azure Portal.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Refers to the Unique GUID indicating Service Principal Id in Azure Active Directory for the corresponding App.
  var servicePrincipalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Refers to the Service Principal Name is the Application name in the tenant.
  var servicePrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object AppIdentity {
  
  @scala.inline
  def apply(): AppIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppIdentity]
  }
  
  @scala.inline
  implicit class AppIdentityMutableBuilder[Self <: AppIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setServicePrincipalId(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalIdNull: Self = StObject.set(x, "servicePrincipalId", null)
    
    @scala.inline
    def setServicePrincipalIdUndefined: Self = StObject.set(x, "servicePrincipalId", js.undefined)
    
    @scala.inline
    def setServicePrincipalName(value: NullableOption[String]): Self = StObject.set(x, "servicePrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalNameNull: Self = StObject.set(x, "servicePrincipalName", null)
    
    @scala.inline
    def setServicePrincipalNameUndefined: Self = StObject.set(x, "servicePrincipalName", js.undefined)
  }
}

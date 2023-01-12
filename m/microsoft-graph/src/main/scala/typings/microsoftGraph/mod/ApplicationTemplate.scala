package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationTemplate
  extends StObject
     with Entity {
  
  /**
    * The list of categories for the application. Supported values can be: Collaboration, Business Management, Consumer,
    * Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human
    * resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications,
    * Tools, Travel, and Web design &amp; hosting.
    */
  var categories: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // A description of the application.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the application.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The home page URL of the application.
  var homePageUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The URL to get the logo for this application.
  var logoUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the publisher for this application.
  var publisher: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of provisioning modes supported by this application. The only valid value is sync.
  var supportedProvisioningTypes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and
    * notSupported.
    */
  var supportedSingleSignOnModes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object ApplicationTemplate {
  
  inline def apply(): ApplicationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationTemplate] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHomePageUrl(value: NullableOption[String]): Self = StObject.set(x, "homePageUrl", value.asInstanceOf[js.Any])
    
    inline def setHomePageUrlNull: Self = StObject.set(x, "homePageUrl", null)
    
    inline def setHomePageUrlUndefined: Self = StObject.set(x, "homePageUrl", js.undefined)
    
    inline def setLogoUrl(value: NullableOption[String]): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoUrlNull: Self = StObject.set(x, "logoUrl", null)
    
    inline def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    inline def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setSupportedProvisioningTypes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "supportedProvisioningTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedProvisioningTypesNull: Self = StObject.set(x, "supportedProvisioningTypes", null)
    
    inline def setSupportedProvisioningTypesUndefined: Self = StObject.set(x, "supportedProvisioningTypes", js.undefined)
    
    inline def setSupportedProvisioningTypesVarargs(value: String*): Self = StObject.set(x, "supportedProvisioningTypes", js.Array(value*))
    
    inline def setSupportedSingleSignOnModes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "supportedSingleSignOnModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedSingleSignOnModesNull: Self = StObject.set(x, "supportedSingleSignOnModes", null)
    
    inline def setSupportedSingleSignOnModesUndefined: Self = StObject.set(x, "supportedSingleSignOnModes", js.undefined)
    
    inline def setSupportedSingleSignOnModesVarargs(value: String*): Self = StObject.set(x, "supportedSingleSignOnModes", js.Array(value*))
  }
}

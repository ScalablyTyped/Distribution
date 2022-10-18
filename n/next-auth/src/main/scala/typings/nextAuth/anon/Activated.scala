package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activated extends StObject {
  
  var activated: js.UndefOr[Boolean] = js.undefined
  
  var active_flag: js.UndefOr[Boolean] = js.undefined
  
  var company_country: js.UndefOr[String] = js.undefined
  
  var company_domain: js.UndefOr[String] = js.undefined
  
  var company_id: js.UndefOr[Double] = js.undefined
  
  var company_industry: js.UndefOr[String] = js.undefined
  
  var company_name: js.UndefOr[String] = js.undefined
  
  var created: js.UndefOr[js.Date] = js.undefined
  
  var default_currency: js.UndefOr[String] = js.undefined
  
  var email: String
  
  var has_created_company: js.UndefOr[Boolean] = js.undefined
  
  var icon_url: js.UndefOr[String] = js.undefined
  
  var id: Double
  
  var is_admin: js.UndefOr[Double] = js.undefined
  
  var is_you: js.UndefOr[Boolean] = js.undefined
  
  var lang: js.UndefOr[Double] = js.undefined
  
  var language: js.UndefOr[Countrycode] = js.undefined
  
  var last_login: js.UndefOr[js.Date] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var modified: js.UndefOr[js.Date] = js.undefined
  
  var name: String
  
  var phone: js.UndefOr[String] = js.undefined
  
  var role_id: js.UndefOr[Double] = js.undefined
  
  var signup_flow_variation: js.UndefOr[String] = js.undefined
  
  var timezone_name: js.UndefOr[String] = js.undefined
  
  var timezone_offset: js.UndefOr[String] = js.undefined
}
object Activated {
  
  inline def apply(email: String, id: Double, name: String): Activated = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activated]
  }
  
  extension [Self <: Activated](x: Self) {
    
    inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    inline def setActive_flag(value: Boolean): Self = StObject.set(x, "active_flag", value.asInstanceOf[js.Any])
    
    inline def setActive_flagUndefined: Self = StObject.set(x, "active_flag", js.undefined)
    
    inline def setCompany_country(value: String): Self = StObject.set(x, "company_country", value.asInstanceOf[js.Any])
    
    inline def setCompany_countryUndefined: Self = StObject.set(x, "company_country", js.undefined)
    
    inline def setCompany_domain(value: String): Self = StObject.set(x, "company_domain", value.asInstanceOf[js.Any])
    
    inline def setCompany_domainUndefined: Self = StObject.set(x, "company_domain", js.undefined)
    
    inline def setCompany_id(value: Double): Self = StObject.set(x, "company_id", value.asInstanceOf[js.Any])
    
    inline def setCompany_idUndefined: Self = StObject.set(x, "company_id", js.undefined)
    
    inline def setCompany_industry(value: String): Self = StObject.set(x, "company_industry", value.asInstanceOf[js.Any])
    
    inline def setCompany_industryUndefined: Self = StObject.set(x, "company_industry", js.undefined)
    
    inline def setCompany_name(value: String): Self = StObject.set(x, "company_name", value.asInstanceOf[js.Any])
    
    inline def setCompany_nameUndefined: Self = StObject.set(x, "company_name", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDefault_currency(value: String): Self = StObject.set(x, "default_currency", value.asInstanceOf[js.Any])
    
    inline def setDefault_currencyUndefined: Self = StObject.set(x, "default_currency", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setHas_created_company(value: Boolean): Self = StObject.set(x, "has_created_company", value.asInstanceOf[js.Any])
    
    inline def setHas_created_companyUndefined: Self = StObject.set(x, "has_created_company", js.undefined)
    
    inline def setIcon_url(value: String): Self = StObject.set(x, "icon_url", value.asInstanceOf[js.Any])
    
    inline def setIcon_urlUndefined: Self = StObject.set(x, "icon_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_admin(value: Double): Self = StObject.set(x, "is_admin", value.asInstanceOf[js.Any])
    
    inline def setIs_adminUndefined: Self = StObject.set(x, "is_admin", js.undefined)
    
    inline def setIs_you(value: Boolean): Self = StObject.set(x, "is_you", value.asInstanceOf[js.Any])
    
    inline def setIs_youUndefined: Self = StObject.set(x, "is_you", js.undefined)
    
    inline def setLang(value: Double): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLanguage(value: Countrycode): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLast_login(value: js.Date): Self = StObject.set(x, "last_login", value.asInstanceOf[js.Any])
    
    inline def setLast_loginUndefined: Self = StObject.set(x, "last_login", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setModified(value: js.Date): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setRole_id(value: Double): Self = StObject.set(x, "role_id", value.asInstanceOf[js.Any])
    
    inline def setRole_idUndefined: Self = StObject.set(x, "role_id", js.undefined)
    
    inline def setSignup_flow_variation(value: String): Self = StObject.set(x, "signup_flow_variation", value.asInstanceOf[js.Any])
    
    inline def setSignup_flow_variationUndefined: Self = StObject.set(x, "signup_flow_variation", js.undefined)
    
    inline def setTimezone_name(value: String): Self = StObject.set(x, "timezone_name", value.asInstanceOf[js.Any])
    
    inline def setTimezone_nameUndefined: Self = StObject.set(x, "timezone_name", js.undefined)
    
    inline def setTimezone_offset(value: String): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
    
    inline def setTimezone_offsetUndefined: Self = StObject.set(x, "timezone_offset", js.undefined)
  }
}

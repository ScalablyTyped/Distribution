package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.Addressenabled
import typings.onfidoSdkUi.anon.Country
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionData extends StObject {
  
  var address: js.UndefOr[Country] = js.undefined
  
  var country_residence: js.UndefOr[String] = js.undefined
  
  var dob: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var first_name: js.UndefOr[String] = js.undefined
  
  def getPersonalData(): Record[String, Any]
  @JSName("getPersonalData")
  var getPersonalData_Original: GetPersonalDataFunc
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var profile_data_selection: js.UndefOr[Addressenabled] = js.undefined
  
  var ssn_enabled: js.UndefOr[Boolean] = js.undefined
}
object StepOptionData {
  
  inline def apply(getPersonalData: () => Record[String, Any]): StepOptionData = {
    val __obj = js.Dynamic.literal(getPersonalData = js.Any.fromFunction0(getPersonalData))
    __obj.asInstanceOf[StepOptionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepOptionData] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Country): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCountry_residence(value: String): Self = StObject.set(x, "country_residence", value.asInstanceOf[js.Any])
    
    inline def setCountry_residenceUndefined: Self = StObject.set(x, "country_residence", js.undefined)
    
    inline def setDob(value: String): Self = StObject.set(x, "dob", value.asInstanceOf[js.Any])
    
    inline def setDobUndefined: Self = StObject.set(x, "dob", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setGetPersonalData(value: () => Record[String, Any]): Self = StObject.set(x, "getPersonalData", js.Any.fromFunction0(value))
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setProfile_data_selection(value: Addressenabled): Self = StObject.set(x, "profile_data_selection", value.asInstanceOf[js.Any])
    
    inline def setProfile_data_selectionUndefined: Self = StObject.set(x, "profile_data_selection", js.undefined)
    
    inline def setSsn_enabled(value: Boolean): Self = StObject.set(x, "ssn_enabled", value.asInstanceOf[js.Any])
    
    inline def setSsn_enabledUndefined: Self = StObject.set(x, "ssn_enabled", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phone extends StObject {
  
  var language: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The phone number.
  var number: js.UndefOr[NullableOption[String]] = js.undefined
  
  var region: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of phone number. The possible values are: home, business, mobile, other, assistant, homeFax, businessFax,
    * otherFax, pager, radio.
    */
  var `type`: js.UndefOr[NullableOption[PhoneType]] = js.undefined
}
object Phone {
  
  inline def apply(): Phone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: NullableOption[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNumber(value: NullableOption[String]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setRegion(value: NullableOption[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setType(value: NullableOption[PhoneType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

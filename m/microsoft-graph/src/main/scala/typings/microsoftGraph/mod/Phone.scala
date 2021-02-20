package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phone extends StObject {
  
  var language: js.UndefOr[NullableOption[String]] = js.native
  
  // The phone number.
  var number: js.UndefOr[NullableOption[String]] = js.native
  
  var region: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The type of phone number. The possible values are: home, business, mobile, other, assistant, homeFax, businessFax,
    * otherFax, pager, radio.
    */
  var `type`: js.UndefOr[NullableOption[PhoneType]] = js.native
}
object Phone {
  
  @scala.inline
  def apply(): Phone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phone]
  }
  
  @scala.inline
  implicit class PhoneMutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: NullableOption[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageNull: Self = StObject.set(x, "language", null)
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setNumber(value: NullableOption[String]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberNull: Self = StObject.set(x, "number", null)
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setRegion(value: NullableOption[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNull: Self = StObject.set(x, "region", null)
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[PhoneType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

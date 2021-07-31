package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAddress extends StObject {
  
  // The email address of the person or entity.
  var address: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the person or entity.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object EmailAddress {
  
  @scala.inline
  def apply(): EmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailAddress]
  }
  
  @scala.inline
  implicit class EmailAddressMutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var alternate_full_name: String
  
  var full_name: String
  
  var given_name: String
  
  var middle_name: String
  
  var prefix: String
  
  var suffix: String
  
  var surname: String
}
object Name {
  
  inline def apply(
    alternate_full_name: String,
    full_name: String,
    given_name: String,
    middle_name: String,
    prefix: String,
    suffix: String,
    surname: String
  ): Name = {
    val __obj = js.Dynamic.literal(alternate_full_name = alternate_full_name.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], middle_name = middle_name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], surname = surname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setAlternate_full_name(value: String): Self = StObject.set(x, "alternate_full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
    
    inline def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
  }
}

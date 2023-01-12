package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Givenname extends StObject {
  
  /** When the party is a person, the party's given, or first, name. */
  var given_name: String
  
  /**
    * When the party is a person, the party's surname or family name.
    * Also known as the last name. Required when the party is a person.
    * Use also to store multiple surnames including the matronymic, or mother's, surname.
    */
  var surname: String
}
object Givenname {
  
  inline def apply(given_name: String, surname: String): Givenname = {
    val __obj = js.Dynamic.literal(given_name = given_name.asInstanceOf[js.Any], surname = surname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Givenname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Givenname] (val x: Self) extends AnyVal {
    
    inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
    
    inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
  }
}

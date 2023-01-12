package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretnameString extends StObject {
  
  /** The name of the secret. */
  var secret_name: String
}
object SecretnameString {
  
  inline def apply(secret_name: String): SecretnameString = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecretnameString] (val x: Self) extends AnyVal {
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}

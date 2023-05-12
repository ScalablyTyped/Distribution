package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `652` extends StObject {
  
  var secret_name: String
}
object `652` {
  
  inline def apply(secret_name: String): `652` = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`652`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `652`] (val x: Self) extends AnyVal {
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}

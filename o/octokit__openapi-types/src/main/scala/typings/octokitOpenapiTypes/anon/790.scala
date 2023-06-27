package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `790` extends StObject {
  
  var secret_name: String
}
object `790` {
  
  inline def apply(secret_name: String): `790` = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`790`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `790`] (val x: Self) extends AnyVal {
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}

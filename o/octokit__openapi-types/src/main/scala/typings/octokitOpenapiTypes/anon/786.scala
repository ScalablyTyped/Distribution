package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `786` extends StObject {
  
  var username: String
}
object `786` {
  
  inline def apply(username: String): `786` = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[`786`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `786`] (val x: Self) extends AnyVal {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}

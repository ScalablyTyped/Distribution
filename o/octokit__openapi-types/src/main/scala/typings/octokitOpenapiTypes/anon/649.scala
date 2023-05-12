package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `649` extends StObject {
  
  var username: String
}
object `649` {
  
  inline def apply(username: String): `649` = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[`649`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `649`] (val x: Self) extends AnyVal {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}

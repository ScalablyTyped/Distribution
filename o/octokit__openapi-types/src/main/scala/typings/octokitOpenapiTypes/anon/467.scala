package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `467` extends StObject {
  
  var identifier: String
}
object `467` {
  
  inline def apply(identifier: String): `467` = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[`467`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `467`] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}

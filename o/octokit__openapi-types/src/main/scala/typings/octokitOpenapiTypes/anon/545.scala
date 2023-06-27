package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `545` extends StObject {
  
  var identifier: String
}
object `545` {
  
  inline def apply(identifier: String): `545` = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[`545`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `545`] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}

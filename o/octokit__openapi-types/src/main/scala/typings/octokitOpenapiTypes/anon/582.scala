package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `582` extends StObject {
  
  var path: OwnerRefRepo
}
object `582` {
  
  inline def apply(path: OwnerRefRepo): `582` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`582`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `582`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `570` extends StObject {
  
  var path: EnvironmentnameString
}
object `570` {
  
  inline def apply(path: EnvironmentnameString): `570` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`570`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `570`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

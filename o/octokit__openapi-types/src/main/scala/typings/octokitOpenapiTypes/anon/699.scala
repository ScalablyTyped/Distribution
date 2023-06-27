package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `699` extends StObject {
  
  var path: OwnerRefRepo
}
object `699` {
  
  inline def apply(path: OwnerRefRepo): `699` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`699`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `699`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

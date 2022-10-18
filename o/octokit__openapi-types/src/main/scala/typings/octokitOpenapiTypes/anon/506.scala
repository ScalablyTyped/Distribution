package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `506` extends StObject {
  
  var path: OwnerRefRepo
}
object `506` {
  
  inline def apply(path: OwnerRefRepo): `506` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`506`]
  }
  
  extension [Self <: `506`](x: Self) {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `476` extends StObject {
  
  var path: PathRepo
}
object `476` {
  
  inline def apply(path: PathRepo): `476` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`476`]
  }
  
  extension [Self <: `476`](x: Self) {
    
    inline def setPath(value: PathRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

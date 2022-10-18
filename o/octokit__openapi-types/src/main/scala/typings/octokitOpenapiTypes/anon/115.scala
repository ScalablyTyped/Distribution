package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  var path: OwnerPath
}
object `115` {
  
  inline def apply(path: OwnerPath): `115` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`115`]
  }
  
  extension [Self <: `115`](x: Self) {
    
    inline def setPath(value: OwnerPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

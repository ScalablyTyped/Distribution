package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80` extends StObject {
  
  var path: Runid
}
object `80` {
  
  inline def apply(path: Runid): `80` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`80`]
  }
  
  extension [Self <: `80`](x: Self) {
    
    inline def setPath(value: Runid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  var path: Runid
}
object `181` {
  
  inline def apply(path: Runid): `181` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`181`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `181`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Runid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

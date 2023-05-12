package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  var path: OwnerPath
}
object `222` {
  
  inline def apply(path: OwnerPath): `222` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`222`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `222`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

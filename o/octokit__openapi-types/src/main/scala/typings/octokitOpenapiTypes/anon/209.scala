package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `209` extends StObject {
  
  var path: OwnerPath
}
object `209` {
  
  inline def apply(path: OwnerPath): `209` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`209`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `209`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

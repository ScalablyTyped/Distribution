package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `262` extends StObject {
  
  var path: OwnerPath
}
object `262` {
  
  inline def apply(path: OwnerPath): `262` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`262`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `262`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `292` extends StObject {
  
  var path: OwnerRef
}
object `292` {
  
  inline def apply(path: OwnerRef): `292` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`292`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `292`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRef): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

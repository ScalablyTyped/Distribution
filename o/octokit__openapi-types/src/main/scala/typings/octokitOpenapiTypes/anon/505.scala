package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `505` extends StObject {
  
  var path: OwnerPathRepo
}
object `505` {
  
  inline def apply(path: OwnerPathRepo): `505` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`505`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `505`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerPathRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

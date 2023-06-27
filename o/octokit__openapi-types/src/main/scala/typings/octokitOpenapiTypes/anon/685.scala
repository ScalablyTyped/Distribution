package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `685` extends StObject {
  
  var path: OwnerPathRepo
}
object `685` {
  
  inline def apply(path: OwnerPathRepo): `685` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`685`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `685`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerPathRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

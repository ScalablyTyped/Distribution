package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `365` extends StObject {
  
  var path: EnvironmentnameRepositoryid
}
object `365` {
  
  inline def apply(path: EnvironmentnameRepositoryid): `365` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`365`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `365`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

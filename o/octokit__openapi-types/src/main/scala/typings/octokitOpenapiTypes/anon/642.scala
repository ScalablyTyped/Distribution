package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `642` extends StObject {
  
  var path: EnvironmentnameStringRepositoryidNumber
}
object `642` {
  
  inline def apply(path: EnvironmentnameStringRepositoryidNumber): `642` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`642`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `642`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameStringRepositoryidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

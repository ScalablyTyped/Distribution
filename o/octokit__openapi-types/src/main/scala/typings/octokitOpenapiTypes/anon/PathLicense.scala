package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathLicense extends StObject {
  
  var path: License
}
object PathLicense {
  
  inline def apply(path: License): PathLicense = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathLicense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathLicense] (val x: Self) extends AnyVal {
    
    inline def setPath(value: License): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

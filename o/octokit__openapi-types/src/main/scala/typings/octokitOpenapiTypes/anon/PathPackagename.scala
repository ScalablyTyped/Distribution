package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagename extends StObject {
  
  var path: Packagename
}
object PathPackagename {
  
  inline def apply(path: Packagename): PathPackagename = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagename]
  }
  
  extension [Self <: PathPackagename](x: Self) {
    
    inline def setPath(value: Packagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

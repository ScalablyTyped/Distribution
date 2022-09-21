package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenamePackagetype extends StObject {
  
  var path: PackagenamePackagetype
}
object PathPackagenamePackagetype {
  
  inline def apply(path: PackagenamePackagetype): PathPackagenamePackagetype = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenamePackagetype]
  }
  
  extension [Self <: PathPackagenamePackagetype](x: Self) {
    
    inline def setPath(value: PackagenamePackagetype): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

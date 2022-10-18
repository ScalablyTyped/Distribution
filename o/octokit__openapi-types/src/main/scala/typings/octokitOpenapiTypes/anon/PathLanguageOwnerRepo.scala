package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathLanguageOwnerRepo extends StObject {
  
  var path: LanguageOwnerRepo
}
object PathLanguageOwnerRepo {
  
  inline def apply(path: LanguageOwnerRepo): PathLanguageOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathLanguageOwnerRepo]
  }
  
  extension [Self <: PathLanguageOwnerRepo](x: Self) {
    
    inline def setPath(value: LanguageOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

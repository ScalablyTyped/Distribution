package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathLanguage extends StObject {
  
  var path: Language
}
object PathLanguage {
  
  inline def apply(path: Language): PathLanguage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathLanguage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Language): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

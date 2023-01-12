package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathLanguageOwner extends StObject {
  
  var path: LanguageOwner
}
object PathLanguageOwner {
  
  inline def apply(path: LanguageOwner): PathLanguageOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathLanguageOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathLanguageOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: LanguageOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

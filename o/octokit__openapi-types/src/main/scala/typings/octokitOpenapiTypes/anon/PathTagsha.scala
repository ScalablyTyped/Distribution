package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTagsha extends StObject {
  
  var path: Tagsha
}
object PathTagsha {
  
  inline def apply(path: Tagsha): PathTagsha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTagsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTagsha] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Tagsha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

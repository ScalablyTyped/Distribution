package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTag extends StObject {
  
  var path: Tag
}
object PathTag {
  
  inline def apply(path: Tag): PathTag = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTag] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Tag): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

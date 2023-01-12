package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidString extends StObject {
  
  var path: GistidString
}
object PathGistidString {
  
  inline def apply(path: GistidString): PathGistidString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathGistidString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: GistidString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidShaString extends StObject {
  
  var path: GistidShaString
}
object PathGistidShaString {
  
  inline def apply(path: GistidShaString): PathGistidShaString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidShaString]
  }
  
  extension [Self <: PathGistidShaString](x: Self) {
    
    inline def setPath(value: GistidShaString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

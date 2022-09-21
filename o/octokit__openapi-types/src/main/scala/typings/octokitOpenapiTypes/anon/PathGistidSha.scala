package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidSha extends StObject {
  
  var path: GistidSha
}
object PathGistidSha {
  
  inline def apply(path: GistidSha): PathGistidSha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidSha]
  }
  
  extension [Self <: PathGistidSha](x: Self) {
    
    inline def setPath(value: GistidSha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

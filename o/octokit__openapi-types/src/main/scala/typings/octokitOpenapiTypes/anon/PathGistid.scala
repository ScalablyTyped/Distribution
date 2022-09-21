package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistid extends StObject {
  
  var path: Gistid
}
object PathGistid {
  
  inline def apply(path: Gistid): PathGistid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistid]
  }
  
  extension [Self <: PathGistid](x: Self) {
    
    inline def setPath(value: Gistid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

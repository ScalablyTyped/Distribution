package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagetypeUsername extends StObject {
  
  var path: PackagetypeUsername
}
object PathPackagetypeUsername {
  
  inline def apply(path: PackagetypeUsername): PathPackagetypeUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagetypeUsername]
  }
  
  extension [Self <: PathPackagetypeUsername](x: Self) {
    
    inline def setPath(value: PackagetypeUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

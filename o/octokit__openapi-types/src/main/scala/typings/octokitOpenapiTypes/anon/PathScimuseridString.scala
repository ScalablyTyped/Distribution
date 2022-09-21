package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathScimuseridString extends StObject {
  
  var path: ScimuseridString
}
object PathScimuseridString {
  
  inline def apply(path: ScimuseridString): PathScimuseridString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathScimuseridString]
  }
  
  extension [Self <: PathScimuseridString](x: Self) {
    
    inline def setPath(value: ScimuseridString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAuthorid extends StObject {
  
  var path: Authorid
}
object PathAuthorid {
  
  inline def apply(path: Authorid): PathAuthorid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAuthorid]
  }
  
  extension [Self <: PathAuthorid](x: Self) {
    
    inline def setPath(value: Authorid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

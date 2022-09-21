package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunnerid extends StObject {
  
  var path: Runnerid
}
object PathRunnerid {
  
  inline def apply(path: Runnerid): PathRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunnerid]
  }
  
  extension [Self <: PathRunnerid](x: Self) {
    
    inline def setPath(value: Runnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

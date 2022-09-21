package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathThreadid extends StObject {
  
  var path: Threadid
}
object PathThreadid {
  
  inline def apply(path: Threadid): PathThreadid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathThreadid]
  }
  
  extension [Self <: PathThreadid](x: Self) {
    
    inline def setPath(value: Threadid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

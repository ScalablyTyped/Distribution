package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathClientid extends StObject {
  
  var path: Clientid
}
object PathClientid {
  
  inline def apply(path: Clientid): PathClientid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathClientid]
  }
  
  extension [Self <: PathClientid](x: Self) {
    
    inline def setPath(value: Clientid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

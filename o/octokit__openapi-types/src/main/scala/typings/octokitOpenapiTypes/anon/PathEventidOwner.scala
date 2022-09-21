package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEventidOwner extends StObject {
  
  var path: EventidOwner
}
object PathEventidOwner {
  
  inline def apply(path: EventidOwner): PathEventidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEventidOwner]
  }
  
  extension [Self <: PathEventidOwner](x: Self) {
    
    inline def setPath(value: EventidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

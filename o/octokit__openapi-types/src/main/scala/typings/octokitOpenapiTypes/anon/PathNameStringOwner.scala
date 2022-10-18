package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameStringOwner extends StObject {
  
  var path: NameStringOwner
}
object PathNameStringOwner {
  
  inline def apply(path: NameStringOwner): PathNameStringOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameStringOwner]
  }
  
  extension [Self <: PathNameStringOwner](x: Self) {
    
    inline def setPath(value: NameStringOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

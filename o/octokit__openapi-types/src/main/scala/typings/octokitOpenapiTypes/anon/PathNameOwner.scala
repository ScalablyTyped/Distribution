package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameOwner extends StObject {
  
  var path: NameOwner
}
object PathNameOwner {
  
  inline def apply(path: NameOwner): PathNameOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameOwner]
  }
  
  extension [Self <: PathNameOwner](x: Self) {
    
    inline def setPath(value: NameOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

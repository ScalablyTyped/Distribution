package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCacheidOwner extends StObject {
  
  var path: CacheidOwner
}
object PathCacheidOwner {
  
  inline def apply(path: CacheidOwner): PathCacheidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCacheidOwner]
  }
  
  extension [Self <: PathCacheidOwner](x: Self) {
    
    inline def setPath(value: CacheidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathJobidOwner extends StObject {
  
  var path: JobidOwner
}
object PathJobidOwner {
  
  inline def apply(path: JobidOwner): PathJobidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathJobidOwner]
  }
  
  extension [Self <: PathJobidOwner](x: Self) {
    
    inline def setPath(value: JobidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackageversionid extends StObject {
  
  var path: Packageversionid
}
object PathPackageversionid {
  
  inline def apply(path: Packageversionid): PathPackageversionid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackageversionid]
  }
  
  extension [Self <: PathPackageversionid](x: Self) {
    
    inline def setPath(value: Packageversionid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

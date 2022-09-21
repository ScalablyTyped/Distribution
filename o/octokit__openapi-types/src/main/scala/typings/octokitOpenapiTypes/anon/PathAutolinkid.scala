package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAutolinkid extends StObject {
  
  var path: Autolinkid
}
object PathAutolinkid {
  
  inline def apply(path: Autolinkid): PathAutolinkid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAutolinkid]
  }
  
  extension [Self <: PathAutolinkid](x: Self) {
    
    inline def setPath(value: Autolinkid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterprise extends StObject {
  
  var path: Enterprise
}
object PathEnterprise {
  
  inline def apply(path: Enterprise): PathEnterprise = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterprise]
  }
  
  extension [Self <: PathEnterprise](x: Self) {
    
    inline def setPath(value: Enterprise): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTemplateowner extends StObject {
  
  var path: Templateowner
}
object PathTemplateowner {
  
  inline def apply(path: Templateowner): PathTemplateowner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTemplateowner]
  }
  
  extension [Self <: PathTemplateowner](x: Self) {
    
    inline def setPath(value: Templateowner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

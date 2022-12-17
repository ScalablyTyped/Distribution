package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberNumber extends StObject {
  
  var path: DiscussionnumberNumber
}
object PathDiscussionnumberNumber {
  
  inline def apply(path: DiscussionnumberNumber): PathDiscussionnumberNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberNumber]
  }
  
  extension [Self <: PathDiscussionnumberNumber](x: Self) {
    
    inline def setPath(value: DiscussionnumberNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

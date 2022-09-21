package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunneridNumber extends StObject {
  
  var path: RunneridNumber
}
object PathRunneridNumber {
  
  inline def apply(path: RunneridNumber): PathRunneridNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunneridNumber]
  }
  
  extension [Self <: PathRunneridNumber](x: Self) {
    
    inline def setPath(value: RunneridNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

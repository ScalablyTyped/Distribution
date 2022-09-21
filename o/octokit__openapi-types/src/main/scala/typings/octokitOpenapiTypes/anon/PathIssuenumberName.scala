package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberName extends StObject {
  
  var path: IssuenumberName
}
object PathIssuenumberName {
  
  inline def apply(path: IssuenumberName): PathIssuenumberName = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberName]
  }
  
  extension [Self <: PathIssuenumberName](x: Self) {
    
    inline def setPath(value: IssuenumberName): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

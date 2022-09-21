package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSecretname extends StObject {
  
  var path: Secretname
}
object PathSecretname {
  
  inline def apply(path: Secretname): PathSecretname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSecretname]
  }
  
  extension [Self <: PathSecretname](x: Self) {
    
    inline def setPath(value: Secretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

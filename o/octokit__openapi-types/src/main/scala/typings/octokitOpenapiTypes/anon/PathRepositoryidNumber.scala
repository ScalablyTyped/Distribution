package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepositoryidNumber extends StObject {
  
  var path: RepositoryidNumber
}
object PathRepositoryidNumber {
  
  inline def apply(path: RepositoryidNumber): PathRepositoryidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepositoryidNumber]
  }
  
  extension [Self <: PathRepositoryidNumber](x: Self) {
    
    inline def setPath(value: RepositoryidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

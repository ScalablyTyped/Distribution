package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameOrg extends StObject {
  
  var path: NameOrg
}
object PathNameOrg {
  
  inline def apply(path: NameOrg): PathNameOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameOrg]
  }
  
  extension [Self <: PathNameOrg](x: Self) {
    
    inline def setPath(value: NameOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

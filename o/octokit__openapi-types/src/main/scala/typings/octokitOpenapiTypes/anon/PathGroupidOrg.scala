package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGroupidOrg extends StObject {
  
  var path: GroupidOrg
}
object PathGroupidOrg {
  
  inline def apply(path: GroupidOrg): PathGroupidOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGroupidOrg]
  }
  
  extension [Self <: PathGroupidOrg](x: Self) {
    
    inline def setPath(value: GroupidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

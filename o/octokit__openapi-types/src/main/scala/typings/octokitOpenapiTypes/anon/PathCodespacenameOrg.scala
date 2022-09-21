package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCodespacenameOrg extends StObject {
  
  var path: CodespacenameOrg
}
object PathCodespacenameOrg {
  
  inline def apply(path: CodespacenameOrg): PathCodespacenameOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCodespacenameOrg]
  }
  
  extension [Self <: PathCodespacenameOrg](x: Self) {
    
    inline def setPath(value: CodespacenameOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

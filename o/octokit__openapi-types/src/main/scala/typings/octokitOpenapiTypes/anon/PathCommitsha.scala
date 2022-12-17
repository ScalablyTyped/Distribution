package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitsha extends StObject {
  
  var path: Commitsha
}
object PathCommitsha {
  
  inline def apply(path: Commitsha): PathCommitsha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitsha]
  }
  
  extension [Self <: PathCommitsha](x: Self) {
    
    inline def setPath(value: Commitsha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

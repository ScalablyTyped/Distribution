package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReleaseid extends StObject {
  
  var path: Releaseid
}
object PathReleaseid {
  
  inline def apply(path: Releaseid): PathReleaseid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReleaseid]
  }
  
  extension [Self <: PathReleaseid](x: Self) {
    
    inline def setPath(value: Releaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

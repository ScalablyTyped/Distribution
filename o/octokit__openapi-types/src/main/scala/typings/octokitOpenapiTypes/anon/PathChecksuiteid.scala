package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathChecksuiteid extends StObject {
  
  var path: Checksuiteid
}
object PathChecksuiteid {
  
  inline def apply(path: Checksuiteid): PathChecksuiteid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathChecksuiteid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathChecksuiteid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Checksuiteid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

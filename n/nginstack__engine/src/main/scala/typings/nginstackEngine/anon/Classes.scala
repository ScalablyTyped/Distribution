package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes extends StObject {
  
  var classes: Any
  
  var vfs: Any
}
object Classes {
  
  inline def apply(classes: Any, vfs: Any): Classes = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], vfs = vfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  
  extension [Self <: Classes](x: Self) {
    
    inline def setClasses(value: Any): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setVfs(value: Any): Self = StObject.set(x, "vfs", value.asInstanceOf[js.Any])
  }
}

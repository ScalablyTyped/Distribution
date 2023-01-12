package typings.nginstackEngine.anon

import typings.nginstackEngine.libClassdefClassDefManagerMod.DataSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classes extends StObject {
  
  var classes: DataSet
  
  var vfs: DataSet
}
object Classes {
  
  inline def apply(classes: DataSet, vfs: DataSet): Classes = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], vfs = vfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: DataSet): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setVfs(value: DataSet): Self = StObject.set(x, "vfs", value.asInstanceOf[js.Any])
  }
}

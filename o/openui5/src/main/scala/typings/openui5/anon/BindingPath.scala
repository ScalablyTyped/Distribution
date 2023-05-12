package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingPath extends StObject {
  
  var bindingPath: ModelName
}
object BindingPath {
  
  inline def apply(bindingPath: ModelName): BindingPath = {
    val __obj = js.Dynamic.literal(bindingPath = bindingPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingPath] (val x: Self) extends AnyVal {
    
    inline def setBindingPath(value: ModelName): Self = StObject.set(x, "bindingPath", value.asInstanceOf[js.Any])
  }
}

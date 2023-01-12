package typings.powerbiVisualsTools.mod.extensibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualConstructorOptions extends StObject {
  
  /** The loaded module, if any, defined by the IVisualPlugin.module. */
  var module: js.UndefOr[Any] = js.undefined
}
object VisualConstructorOptions {
  
  inline def apply(): VisualConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setModule(value: Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
  }
}

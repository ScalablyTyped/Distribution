package typings.powerbiVisualsTools.mod.extensibility

import typings.powerbiVisualsTools.mod.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVisualPluginOptions extends StObject {
  
  var transform: js.UndefOr[IVisualDataViewTransform] = js.undefined
}
object IVisualPluginOptions {
  
  inline def apply(): IVisualPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVisualPluginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVisualPluginOptions] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: /* dataview */ js.Array[DataView] => Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}

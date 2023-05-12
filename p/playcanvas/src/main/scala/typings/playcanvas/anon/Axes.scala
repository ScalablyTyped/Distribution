package typings.playcanvas.anon

import typings.playcanvas.playcanvasStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axes extends StObject {
  
  var axes: js.Array[String]
  
  var buttons: js.Array[String]
  
  var mapping: js.UndefOr[custom] = js.undefined
  
  var synthesizedButtons: js.UndefOr[js.Object] = js.undefined
}
object Axes {
  
  inline def apply(axes: js.Array[String], buttons: js.Array[String]): Axes = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Axes] (val x: Self) extends AnyVal {
    
    inline def setAxes(value: js.Array[String]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesVarargs(value: String*): Self = StObject.set(x, "axes", js.Array(value*))
    
    inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setMapping(value: custom): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setSynthesizedButtons(value: js.Object): Self = StObject.set(x, "synthesizedButtons", value.asInstanceOf[js.Any])
    
    inline def setSynthesizedButtonsUndefined: Self = StObject.set(x, "synthesizedButtons", js.undefined)
  }
}

package typings.openseadragon.anon

import typings.openseadragon.mod.Button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttons extends StObject {
  
  var buttons: js.Array[Button]
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
}
object Buttons {
  
  @scala.inline
  def apply(buttons: js.Array[Button]): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  
  @scala.inline
  implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}

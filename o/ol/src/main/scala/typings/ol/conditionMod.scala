package typings.ol

import typings.ol.mapBrowserEventMod.default
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/events/condition", JSImport.Namespace)
@js.native
object conditionMod extends js.Object {
  
  def all(var_args: Condition*): Condition = js.native
  
  def altKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def altShiftKeysOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def always(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def click(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def doubleClick(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def focus(event: default[UIEvent]): Boolean = js.native
  
  def focusWithTabindex(event: default[UIEvent]): Boolean = js.native
  
  def mouseActionButton(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def mouseOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def never(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def noModifierKeys(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def penOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def platformModifierKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def pointerMove(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def primaryAction(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def shiftKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def singleClick(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def targetNotEditable(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  def touchOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  type Condition = js.ThisFunction1[/* this */ js.Any, /* p0 */ default[UIEvent], Boolean]
}

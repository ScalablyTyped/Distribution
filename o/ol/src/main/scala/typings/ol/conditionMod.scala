package typings.ol

import typings.ol.mapBrowserEventMod.default
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionMod {
  
  @JSImport("ol/events/condition", "all")
  @js.native
  def all(var_args: Condition*): Condition = js.native
  
  @JSImport("ol/events/condition", "altKeyOnly")
  @js.native
  def altKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "altShiftKeysOnly")
  @js.native
  def altShiftKeysOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "always")
  @js.native
  def always(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "click")
  @js.native
  def click(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "doubleClick")
  @js.native
  def doubleClick(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "focus")
  @js.native
  def focus(event: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "focusWithTabindex")
  @js.native
  def focusWithTabindex(event: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "mouseActionButton")
  @js.native
  def mouseActionButton(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "mouseOnly")
  @js.native
  def mouseOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "never")
  @js.native
  def never(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "noModifierKeys")
  @js.native
  def noModifierKeys(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "penOnly")
  @js.native
  def penOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "platformModifierKeyOnly")
  @js.native
  def platformModifierKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "pointerMove")
  @js.native
  def pointerMove(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "primaryAction")
  @js.native
  def primaryAction(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "shiftKeyOnly")
  @js.native
  def shiftKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "singleClick")
  @js.native
  def singleClick(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "targetNotEditable")
  @js.native
  def targetNotEditable(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  @JSImport("ol/events/condition", "touchOnly")
  @js.native
  def touchOnly(mapBrowserEvent: default[UIEvent]): Boolean = js.native
  
  type Condition = js.ThisFunction1[/* this */ js.Any, /* p0 */ default[UIEvent], Boolean]
}

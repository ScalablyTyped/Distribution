package typings.ol

import typings.ol.mapBrowserEventMod.default
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionMod {
  
  @JSImport("ol/events/condition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def all(var_args: Condition*): Condition = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(var_args.asInstanceOf[js.Any]).asInstanceOf[Condition]
  
  @scala.inline
  def altKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("altKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def altShiftKeysOnly(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("altShiftKeysOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def always(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("always")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def click(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def doubleClick(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleClick")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def focus(event: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def focusWithTabindex(event: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusWithTabindex")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def mouseActionButton(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseActionButton")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def mouseOnly(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def never(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("never")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def noModifierKeys(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noModifierKeys")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def penOnly(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("penOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def platformModifierKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("platformModifierKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def pointerMove(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerMove")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def primaryAction(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryAction")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def shiftKeyOnly(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def singleClick(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("singleClick")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def targetNotEditable(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("targetNotEditable")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def touchOnly(mapBrowserEvent: default[UIEvent]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("touchOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Condition = js.ThisFunction1[/* this */ js.Any, /* p0 */ default[UIEvent], Boolean]
}

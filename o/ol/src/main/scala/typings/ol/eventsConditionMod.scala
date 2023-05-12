package typings.ol

import typings.ol.mapBrowserEventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsConditionMod {
  
  @JSImport("ol/events/condition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(args: Condition*): Condition = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Condition]
  
  inline def altKeyOnly(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("altKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def altShiftKeysOnly(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("altShiftKeysOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("ol/events/condition", "always")
  @js.native
  val always: js.Function0[Boolean] = js.native
  
  inline def click(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def doubleClick(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleClick")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def focus(event: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def focusWithTabindex(event: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusWithTabindex")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mouseActionButton(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseActionButton")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mouseOnly(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("ol/events/condition", "never")
  @js.native
  val never: js.Function0[Boolean] = js.native
  
  inline def noModifierKeys(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noModifierKeys")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def penOnly(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("penOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def platformModifierKeyOnly(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("platformModifierKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pointerMove(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerMove")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def primaryAction(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryAction")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shiftKeyOnly(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftKeyOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def singleClick(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("singleClick")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def targetNotEditable(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("targetNotEditable")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def touchOnly(mapBrowserEvent: default[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("touchOnly")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Condition = js.ThisFunction1[/* this */ Any, /* arg1 */ default[Any], Boolean]
}

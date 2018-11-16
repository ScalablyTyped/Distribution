package typings
package preactLib.preactMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSXNs {
  type AnimationEventHandler = EventHandler[stdLib.AnimationEvent]
  type ClipboardEventHandler = EventHandler[stdLib.ClipboardEvent]
  type CompositionEventHandler = EventHandler[stdLib.CompositionEvent]
  type DragEventHandler = EventHandler[stdLib.DragEvent]
  type Element = preactLib.preactMod.preactNs.VNode[js.Any]
  type ElementClass = preactLib.preactMod.preactNs.Component[js.Any, js.Any]
  type EventHandler[E /* <: stdLib.Event */] = js.Function1[/* event */ E, scala.Unit]
  type FocusEventHandler = EventHandler[stdLib.FocusEvent]
  type GenericEventHandler = EventHandler[stdLib.Event]
  type KeyboardEventHandler = EventHandler[stdLib.KeyboardEvent]
  type MouseEventHandler = EventHandler[stdLib.MouseEvent]
  type PointerEventHandler = EventHandler[stdLib.PointerEvent]
  type TouchEventHandler = EventHandler[stdLib.TouchEvent]
  type TransitionEventHandler = EventHandler[stdLib.TransitionEvent]
  type UIEventHandler = EventHandler[stdLib.UIEvent]
  type WheelEventHandler = EventHandler[stdLib.WheelEvent]
}

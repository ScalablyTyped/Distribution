package typings.preact.preactMod

import typings.preact.preactMod.Component
import typings.preact.preactMod.Defaultize
import typings.preact.preactMod.VNode
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSXNs {
  type AnimationEventHandler = EventHandler[AnimationEvent]
  type ClipboardEventHandler = EventHandler[ClipboardEvent]
  type CompositionEventHandler = EventHandler[CompositionEvent]
  type DragEventHandler = EventHandler[DragEvent]
  type Element = VNode[js.Any]
  type ElementClass = Component[js.Any, js.Any]
  type EventHandler[E /* <: Event */] = js.Function1[/* event */ E, Unit]
  type FocusEventHandler = EventHandler[FocusEvent]
  type GenericEventHandler = EventHandler[Event]
  type KeyboardEventHandler = EventHandler[KeyboardEvent]
  type LibraryManagedAttributes[Component, Props] = Props | (Defaultize[Props, js.Any])
  type MouseEventHandler = EventHandler[MouseEvent]
  type PointerEventHandler = EventHandler[PointerEvent]
  type TouchEventHandler = EventHandler[TouchEvent]
  type TransitionEventHandler = EventHandler[TransitionEvent]
  type UIEventHandler = EventHandler[UIEvent]
  type WheelEventHandler = EventHandler[WheelEvent]
}

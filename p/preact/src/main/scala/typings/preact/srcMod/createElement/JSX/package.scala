package typings.preact.srcMod.createElement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  import typings.preact.srcJsxMod.Defaultize
  import typings.preact.srcMod.Component
  import typings.preact.srcMod.VNode
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

  type AnimationEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[AnimationEvent]
  type ClipboardEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[ClipboardEvent]
  type CompositionEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[CompositionEvent]
  type DragEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[DragEvent]
  type Element = VNode[js.Any]
  type ElementClass = Component[js.Any, js.Any]
  type EventHandler[E /* <: Event */] = js.Function1[/* event */ E, Unit]
  type FocusEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[FocusEvent]
  type GenericEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[Event]
  type KeyboardEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[KeyboardEvent]
  type LibraryManagedAttributes[Component, Props] = Props | (Defaultize[Props, js.Any])
  type MouseEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[MouseEvent]
  type PointerEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[PointerEvent]
  type TouchEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[TouchEvent]
  type TransitionEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[TransitionEvent]
  type UIEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[UIEvent]
  type WheelEventHandler = typings.preact.srcJsxMod.JSXInternal.EventHandler[WheelEvent]
}

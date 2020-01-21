package typings.preact.mod.createElement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  type AnimationEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedAnimationEvent[Target]]
  type ClipboardEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedClipboardEvent[Target]]
  type CompositionEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedCompositionEvent[Target]]
  type DragEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedDragEvent[Target]]
  type Element = typings.preact.mod.VNode[js.Any]
  type ElementClass = typings.preact.mod.Component[js.Any, js.Any]
  type EventHandler[E /* <: typings.preact.jsxMod.JSXInternal.TargetedEvent[typings.std.EventTarget, typings.std.Event_] */] = js.ThisFunction1[
    /* import warning: importer.ImportType#apply Failed type conversion: E['currentTarget'] */ /* this */ js.Any, 
    /* event */ E, 
    scala.Unit
  ]
  type FocusEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedFocusEvent[Target]]
  type GenericEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.Event_]]
  type KeyboardEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedKeyboardEvent[Target]]
  type LibraryManagedAttributes[Component, Props] = Props | (typings.preact.jsxMod.Defaultize[Props, js.Any])
  type MouseEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedMouseEvent[Target]]
  type PointerEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedPointerEvent[Target]]
  type TargetedAnimationEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.AnimationEvent]
  type TargetedClipboardEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.ClipboardEvent]
  type TargetedCompositionEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.CompositionEvent]
  type TargetedDragEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.DragEvent]
  type TargetedEvent[Target /* <: typings.std.EventTarget */, TypedEvent /* <: typings.std.Event_ */] = (typings.std.Omit[TypedEvent, typings.preact.preactStrings.currentTarget]) with typings.preact.AnonCurrentTarget[Target]
  type TargetedFocusEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.FocusEvent]
  type TargetedKeyboardEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.KeyboardEvent]
  type TargetedMouseEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.MouseEvent]
  type TargetedPointerEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.PointerEvent]
  type TargetedTouchEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.TouchEvent]
  type TargetedTransitionEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.TransitionEvent]
  type TargetedUIEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.UIEvent]
  type TargetedWheelEvent[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.TargetedEvent[Target, typings.std.WheelEvent]
  type TouchEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedTouchEvent[Target]]
  type TransitionEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedTransitionEvent[Target]]
  type UIEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedUIEvent[Target]]
  type WheelEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedWheelEvent[Target]]
}

package typings.preact.mod.h

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
  type EventHandler[E /* <: typings.preact.TargetedEventEventTargetE */] = js.ThisFunction1[
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
  type TargetedEvent[Target /* <: typings.std.EventTarget */, TypedEvent /* <: typings.std.Event_ */] = (typings.std.Omit[TypedEvent, typings.preact.preactStrings.currentTarget]) with typings.preact.AnonCurrentTarget[Target]
  type TouchEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedTouchEvent[Target]]
  type TransitionEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedTransitionEvent[Target]]
  type UIEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedUIEvent[Target]]
  type WheelEventHandler[Target /* <: typings.std.EventTarget */] = typings.preact.jsxMod.JSXInternal.EventHandler[typings.preact.jsxMod.JSXInternal.TargetedWheelEvent[Target]]
}

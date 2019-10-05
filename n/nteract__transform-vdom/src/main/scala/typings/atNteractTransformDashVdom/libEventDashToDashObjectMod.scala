package typings.atNteractTransformDashVdom

import typings.atNteractTransformDashVdom.libEventDashToDashObjectMod.SerializedEvent
import typings.react.Event
import typings.react.NativeMouseEvent
import typings.react.reactMod.AnimationEvent
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.CompositionEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.PointerEvent
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TransitionEvent
import typings.react.reactMod.UIEvent
import typings.react.reactMod.WheelEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom/lib/event-to-object", JSImport.Namespace)
@js.native
object libEventDashToDashObjectMod extends js.Object {
  def serializeEvent[T](event: SyntheticEvent[T, Event]): SerializedEvent[T] = js.native
  type SerializedEvent[T] = (Partial[
    AnimationEvent[T] | ChangeEvent[T] | ClipboardEvent[T] | CompositionEvent[T] | KeyboardEvent[T] | (MouseEvent[T, NativeMouseEvent]) | PointerEvent[T] | TouchEvent[T] | TransitionEvent[T] | UIEvent[T] | WheelEvent[T]
  ]) | js.Object
}


package typings.nteractTransformVdom

import typings.react.mod.AnimationEvent
import typings.react.mod.ChangeEvent
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.std.Event
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventToObjectMod {
  
  @JSImport("@nteract/transform-vdom/lib/event-to-object", "serializeEvent")
  @js.native
  def serializeEvent[T](event: SyntheticEvent[T, Event]): SerializedEvent[T] = js.native
  
  type SerializedEvent[T] = (Partial[
    AnimationEvent[T] | ChangeEvent[T] | ClipboardEvent[T] | CompositionEvent[T] | KeyboardEvent[T] | (MouseEvent[T, NativeMouseEvent]) | PointerEvent[T] | TouchEvent[T] | TransitionEvent[T] | (UIEvent[T, NativeUIEvent]) | WheelEvent[T]
  ]) | js.Object
}

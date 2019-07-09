package typings
package atNteractTransformDashVdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEventDashToDashObjectMod {
  type SerializedEvent[T] = (stdLib.Partial[
    reactLib.reactMod.AnimationEvent[T] | reactLib.reactMod.ChangeEvent[T] | reactLib.reactMod.ClipboardEvent[T] | reactLib.reactMod.CompositionEvent[T] | reactLib.reactMod.KeyboardEvent[T] | (reactLib.reactMod.MouseEvent[T, reactLib.NativeMouseEvent]) | reactLib.reactMod.PointerEvent[T] | reactLib.reactMod.TouchEvent[T] | reactLib.reactMod.TransitionEvent[T] | reactLib.reactMod.UIEvent[T] | reactLib.reactMod.WheelEvent[T]
  ]) | js.Object
}

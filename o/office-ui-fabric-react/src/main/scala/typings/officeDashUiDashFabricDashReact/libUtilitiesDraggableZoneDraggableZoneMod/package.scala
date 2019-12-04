package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilitiesDraggableZoneDraggableZoneMod {
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.NativeMouseEvent
  import typings.react.reactMod.TouchEvent
  import typings.std.Event

  type MouseTouchEvent[T] = (MouseEvent[T, NativeMouseEvent]) with TouchEvent[T] with Event
}

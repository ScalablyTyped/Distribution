package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object playcanvas {
  import typings.std.MouseEvent
  import typings.std.Touch
  import typings.std.TouchEvent
  import typings.std.VRDisplay
  import typings.std.VRDisplayCapabilities

  type BrowserMouseEvent = MouseEvent
  type BrowserTouch = Touch
  type BrowserTouchEvent = TouchEvent
  type NativeVRDisplay = VRDisplay
  type NativeVRDisplayCapabilities = VRDisplayCapabilities
}

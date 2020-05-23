package typings.officeUiFabricReact.positioningPositioningMod

import typings.std.DOMRect
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Window with typings for experimental features regarding Dual Screen devices.
  */
@js.native
trait IWindowWithSegments extends Window {
  var getWindowSegments: js.UndefOr[js.Function0[js.Array[DOMRect]]] = js.native
}


package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationOptions extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.undefined
  var gamepads: js.UndefOr[GamePads] = js.undefined
  var graphicsDeviceOptions: js.UndefOr[js.Object] = js.undefined
  var keyboard: js.UndefOr[Keyboard] = js.undefined
  var mouse: js.UndefOr[Mouse] = js.undefined
  var scriptPrefix: js.UndefOr[String] = js.undefined
  var touch: js.UndefOr[TouchDevice] = js.undefined
}

object ApplicationOptions {
  @scala.inline
  def apply(
    assetPrefix: String = null,
    gamepads: GamePads = null,
    graphicsDeviceOptions: js.Object = null,
    keyboard: Keyboard = null,
    mouse: Mouse = null,
    scriptPrefix: String = null,
    touch: TouchDevice = null
  ): ApplicationOptions = {
    val __obj = js.Dynamic.literal()
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix)
    if (gamepads != null) __obj.updateDynamic("gamepads")(gamepads)
    if (graphicsDeviceOptions != null) __obj.updateDynamic("graphicsDeviceOptions")(graphicsDeviceOptions)
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard)
    if (mouse != null) __obj.updateDynamic("mouse")(mouse)
    if (scriptPrefix != null) __obj.updateDynamic("scriptPrefix")(scriptPrefix)
    if (touch != null) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[ApplicationOptions]
  }
}


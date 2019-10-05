package typings.playcanvas

import typings.playcanvas.pc.ElementInput
import typings.playcanvas.pc.GamePads
import typings.playcanvas.pc.Keyboard
import typings.playcanvas.pc.Mouse
import typings.playcanvas.pc.TouchDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetPrefix extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.undefined
  var elementInput: js.UndefOr[ElementInput] = js.undefined
  var gamepads: js.UndefOr[GamePads] = js.undefined
  var graphicsDeviceOptions: js.UndefOr[js.Any] = js.undefined
  var keyboard: js.UndefOr[Keyboard] = js.undefined
  var mouse: js.UndefOr[Mouse] = js.undefined
  var scriptPrefix: js.UndefOr[String] = js.undefined
  var scriptsOrder: js.UndefOr[js.Array[String]] = js.undefined
  var touch: js.UndefOr[TouchDevice] = js.undefined
}

object Anon_AssetPrefix {
  @scala.inline
  def apply(
    assetPrefix: String = null,
    elementInput: ElementInput = null,
    gamepads: GamePads = null,
    graphicsDeviceOptions: js.Any = null,
    keyboard: Keyboard = null,
    mouse: Mouse = null,
    scriptPrefix: String = null,
    scriptsOrder: js.Array[String] = null,
    touch: TouchDevice = null
  ): Anon_AssetPrefix = {
    val __obj = js.Dynamic.literal()
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix)
    if (elementInput != null) __obj.updateDynamic("elementInput")(elementInput)
    if (gamepads != null) __obj.updateDynamic("gamepads")(gamepads)
    if (graphicsDeviceOptions != null) __obj.updateDynamic("graphicsDeviceOptions")(graphicsDeviceOptions)
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard)
    if (mouse != null) __obj.updateDynamic("mouse")(mouse)
    if (scriptPrefix != null) __obj.updateDynamic("scriptPrefix")(scriptPrefix)
    if (scriptsOrder != null) __obj.updateDynamic("scriptsOrder")(scriptsOrder)
    if (touch != null) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[Anon_AssetPrefix]
  }
}


package typings.openlayers.openlayersMod.control

import typings.openlayers.openlayersMod.olx.control.FullScreenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Provides a button that when clicked fills up the full screen with the map.
  * The full screen source element is by default the element containing the map viewport unless
  * overriden by providing the `source` option. In which case, the dom
  * element introduced using this parameter will be displayed in full screen.
  *
  * When in full screen mode, a close button is shown to exit full screen mode.
  * The [Fullscreen API](http://www.w3.org/TR/fullscreen/) is used to
  * toggle the map in full screen mode.
  *
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "control.FullScreen")
@js.native
/**
  * @classdesc
  * Provides a button that when clicked fills up the full screen with the map.
  * The full screen source element is by default the element containing the map viewport unless
  * overriden by providing the `source` option. In which case, the dom
  * element introduced using this parameter will be displayed in full screen.
  *
  * When in full screen mode, a close button is shown to exit full screen mode.
  * The [Fullscreen API](http://www.w3.org/TR/fullscreen/) is used to
  * toggle the map in full screen mode.
  *
  *
  * @param opt_options Options.
  * @api stable
  */
class FullScreen () extends Control {
  def this(opt_options: FullScreenOptions) = this()
}


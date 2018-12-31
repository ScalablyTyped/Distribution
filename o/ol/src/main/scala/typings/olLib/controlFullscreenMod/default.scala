package typings
package olLib.controlFullscreenMod

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
@JSImport("ol/control/fullscreen", JSImport.Default)
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
class default ()
  extends openlayersLib.openlayersMod.controlNs.FullScreen {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.FullScreenOptions) = this()
}


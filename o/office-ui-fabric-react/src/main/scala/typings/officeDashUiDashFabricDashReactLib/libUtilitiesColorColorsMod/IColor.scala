package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor
  extends IRGB
     with IHSV {
  /** Hex string for the color (excluding alpha component), *not* prefixed with #. */
  var hex: java.lang.String
  /** CSS color string. If a hex value, it must be prefixed with #. */
  var str: java.lang.String
}


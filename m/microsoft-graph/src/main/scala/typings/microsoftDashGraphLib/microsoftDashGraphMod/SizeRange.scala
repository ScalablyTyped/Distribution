package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeRange extends js.Object {
  /** The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply. */
  var maximumSize: js.UndefOr[scala.Double] = js.undefined
  /** The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply. */
  var minimumSize: js.UndefOr[scala.Double] = js.undefined
}

object SizeRange {
  @scala.inline
  def apply(maximumSize: scala.Int | scala.Double = null, minimumSize: scala.Int | scala.Double = null): SizeRange = {
    val __obj = js.Dynamic.literal()
    if (maximumSize != null) __obj.updateDynamic("maximumSize")(maximumSize.asInstanceOf[js.Any])
    if (minimumSize != null) __obj.updateDynamic("minimumSize")(minimumSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeRange]
  }
}


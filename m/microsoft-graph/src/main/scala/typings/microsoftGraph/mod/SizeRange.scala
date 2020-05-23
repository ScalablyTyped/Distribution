package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeRange extends js.Object {
  // The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var maximumSize: js.UndefOr[Double] = js.undefined
  // The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var minimumSize: js.UndefOr[Double] = js.undefined
}

object SizeRange {
  @scala.inline
  def apply(maximumSize: js.UndefOr[Double] = js.undefined, minimumSize: js.UndefOr[Double] = js.undefined): SizeRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximumSize)) __obj.updateDynamic("maximumSize")(maximumSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSize)) __obj.updateDynamic("minimumSize")(minimumSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeRange]
  }
}


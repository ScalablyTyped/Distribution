package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmphtml extends js.Object {
  var amphtml: js.UndefOr[Boolean] = js.undefined
  var hasAmp: js.UndefOr[Boolean] = js.undefined
}

object AnonAmphtml {
  @scala.inline
  def apply(amphtml: js.UndefOr[Boolean] = js.undefined, hasAmp: js.UndefOr[Boolean] = js.undefined): AnonAmphtml = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amphtml)) __obj.updateDynamic("amphtml")(amphtml.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAmp)) __obj.updateDynamic("hasAmp")(hasAmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmphtml]
  }
}


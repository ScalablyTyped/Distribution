package typings.nodeIpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamily extends js.Object {
  /**
    * Default: false
    */
  var family: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    */
  var hints: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    */
  var localAddress: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    */
  var localPort: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    */
  var lookup: js.UndefOr[Boolean] = js.undefined
}

object AnonFamily {
  @scala.inline
  def apply(
    family: js.UndefOr[Boolean] = js.undefined,
    hints: js.UndefOr[Boolean] = js.undefined,
    localAddress: js.UndefOr[Boolean] = js.undefined,
    localPort: js.UndefOr[Boolean] = js.undefined,
    lookup: js.UndefOr[Boolean] = js.undefined
  ): AnonFamily = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(localAddress)) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (!js.isUndefined(lookup)) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamily]
  }
}


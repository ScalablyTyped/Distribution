package typings.nodeIpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Family extends js.Object {
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

object Family {
  @scala.inline
  def apply(
    family: js.UndefOr[Boolean] = js.undefined,
    hints: js.UndefOr[Boolean] = js.undefined,
    localAddress: js.UndefOr[Boolean] = js.undefined,
    localPort: js.UndefOr[Boolean] = js.undefined,
    lookup: js.UndefOr[Boolean] = js.undefined
  ): Family = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localAddress)) __obj.updateDynamic("localAddress")(localAddress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lookup)) __obj.updateDynamic("lookup")(lookup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
}


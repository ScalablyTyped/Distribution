package typings.nodeDashIpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Family extends js.Object {
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

object Anon_Family {
  @scala.inline
  def apply(
    family: js.UndefOr[Boolean] = js.undefined,
    hints: js.UndefOr[Boolean] = js.undefined,
    localAddress: js.UndefOr[Boolean] = js.undefined,
    localPort: js.UndefOr[Boolean] = js.undefined,
    lookup: js.UndefOr[Boolean] = js.undefined
  ): Anon_Family = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(localAddress)) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (!js.isUndefined(lookup)) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Family]
  }
}


package typings
package nodeDashIpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Family extends js.Object {
  /**
    * Default: false
    */
  var family: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    */
  var hints: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    */
  var localAddress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    */
  var localPort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    */
  var lookup: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Family {
  @scala.inline
  def apply(
    family: js.UndefOr[scala.Boolean] = js.undefined,
    hints: js.UndefOr[scala.Boolean] = js.undefined,
    localAddress: js.UndefOr[scala.Boolean] = js.undefined,
    localPort: js.UndefOr[scala.Boolean] = js.undefined,
    lookup: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Family = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family)
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints)
    if (!js.isUndefined(localAddress)) __obj.updateDynamic("localAddress")(localAddress)
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort)
    if (!js.isUndefined(lookup)) __obj.updateDynamic("lookup")(lookup)
    __obj.asInstanceOf[Anon_Family]
  }
}


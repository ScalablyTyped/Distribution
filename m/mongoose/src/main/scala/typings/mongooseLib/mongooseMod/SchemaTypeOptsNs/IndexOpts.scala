package typings
package mongooseLib.mongooseMod.SchemaTypeOptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexOpts extends js.Object {
  var background: js.UndefOr[scala.Boolean] = js.undefined
  var expires: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var sparse: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object IndexOpts {
  @scala.inline
  def apply(
    background: js.UndefOr[scala.Boolean] = js.undefined,
    expires: scala.Double | java.lang.String = null,
    sparse: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): IndexOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[IndexOpts]
  }
}


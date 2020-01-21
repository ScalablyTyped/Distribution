package typings.mongoose.mod.SchemaTypeOpts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexOpts extends js.Object {
  var background: js.UndefOr[Boolean] = js.undefined
  var expires: js.UndefOr[Double | String] = js.undefined
  var sparse: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object IndexOpts {
  @scala.inline
  def apply(
    background: js.UndefOr[Boolean] = js.undefined,
    expires: Double | String = null,
    sparse: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): IndexOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexOpts]
  }
}


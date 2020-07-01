package typings.mongoose.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaTimestampsConfig extends js.Object {
  var createdAt: js.UndefOr[Boolean | String] = js.undefined
  var currentTime: js.UndefOr[js.Function0[Date | Double]] = js.undefined
  var updatedAt: js.UndefOr[Boolean | String] = js.undefined
}

object SchemaTimestampsConfig {
  @scala.inline
  def apply(
    createdAt: Boolean | String = null,
    currentTime: () => Date | Double = null,
    updatedAt: Boolean | String = null
  ): SchemaTimestampsConfig = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(js.Any.fromFunction0(currentTime))
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimestampsConfig]
  }
}


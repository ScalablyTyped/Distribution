package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaTimestampsConfig extends js.Object {
  var createdAt: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var updatedAt: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object SchemaTimestampsConfig {
  @scala.inline
  def apply(
    createdAt: scala.Boolean | java.lang.String = null,
    updatedAt: scala.Boolean | java.lang.String = null
  ): SchemaTimestampsConfig = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimestampsConfig]
  }
}


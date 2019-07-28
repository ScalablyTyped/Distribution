package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMaterializedViewOptions extends js.Object {
  var columns: js.UndefOr[String | js.Array[String]] = js.undefined
  var data: js.UndefOr[Boolean] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
  var storageParameters: js.Object
  var tablespace: js.UndefOr[String] = js.undefined
}

object CreateMaterializedViewOptions {
  @scala.inline
  def apply(
    storageParameters: js.Object,
    columns: String | js.Array[String] = null,
    data: js.UndefOr[Boolean] = js.undefined,
    ifNotExists: js.UndefOr[Boolean] = js.undefined,
    tablespace: String = null
  ): CreateMaterializedViewOptions = {
    val __obj = js.Dynamic.literal(storageParameters = storageParameters)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    if (tablespace != null) __obj.updateDynamic("tablespace")(tablespace)
    __obj.asInstanceOf[CreateMaterializedViewOptions]
  }
}


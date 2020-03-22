package typings.nodePgMigrate.viewsMaterializedTypesMod

import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMaterializedViewOptions extends IfNotExistsOption {
  var columns: js.UndefOr[String | js.Array[String]] = js.undefined
  var data: js.UndefOr[Boolean] = js.undefined
  var storageParameters: js.UndefOr[StorageParameters] = js.undefined
  var tablespace: js.UndefOr[String] = js.undefined
}

object CreateMaterializedViewOptions {
  @scala.inline
  def apply(
    columns: String | js.Array[String] = null,
    data: js.UndefOr[Boolean] = js.undefined,
    ifNotExists: js.UndefOr[Boolean] = js.undefined,
    storageParameters: StorageParameters = null,
    tablespace: String = null
  ): CreateMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.asInstanceOf[js.Any])
    if (storageParameters != null) __obj.updateDynamic("storageParameters")(storageParameters.asInstanceOf[js.Any])
    if (tablespace != null) __obj.updateDynamic("tablespace")(tablespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMaterializedViewOptions]
  }
}


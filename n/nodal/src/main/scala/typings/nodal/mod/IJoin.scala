package typings.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJoin extends js.Object {
  var cachedModel: js.UndefOr[Model] = js.undefined
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  var columnsObject: js.UndefOr[js.Object] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var joinAlias: js.UndefOr[String] = js.undefined
  var joinColumn: js.UndefOr[String] = js.undefined
  var joinTable: String
  var key: js.UndefOr[String] = js.undefined
  var multiFilter: js.UndefOr[js.Any] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var orderBy: js.UndefOr[js.Any] = js.undefined
  var prevAlias: js.UndefOr[String] = js.undefined
  var prevColumn: js.UndefOr[String] = js.undefined
  var prevTable: String
}

object IJoin {
  @scala.inline
  def apply(
    joinTable: String,
    prevTable: String,
    cachedModel: Model = null,
    columns: js.Array[String] = null,
    columnsObject: js.Object = null,
    count: js.UndefOr[Double] = js.undefined,
    joinAlias: String = null,
    joinColumn: String = null,
    key: String = null,
    multiFilter: js.Any = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offset: js.UndefOr[Double] = js.undefined,
    orderBy: js.Any = null,
    prevAlias: String = null,
    prevColumn: String = null
  ): IJoin = {
    val __obj = js.Dynamic.literal(joinTable = joinTable.asInstanceOf[js.Any], prevTable = prevTable.asInstanceOf[js.Any])
    if (cachedModel != null) __obj.updateDynamic("cachedModel")(cachedModel.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (columnsObject != null) __obj.updateDynamic("columnsObject")(columnsObject.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (joinAlias != null) __obj.updateDynamic("joinAlias")(joinAlias.asInstanceOf[js.Any])
    if (joinColumn != null) __obj.updateDynamic("joinColumn")(joinColumn.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (multiFilter != null) __obj.updateDynamic("multiFilter")(multiFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (prevAlias != null) __obj.updateDynamic("prevAlias")(prevAlias.asInstanceOf[js.Any])
    if (prevColumn != null) __obj.updateDynamic("prevColumn")(prevColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJoin]
  }
}


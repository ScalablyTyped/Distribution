package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJoin extends js.Object {
  var cachedModel: js.UndefOr[Model] = js.undefined
  var columns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var columnsObject: js.UndefOr[js.Object] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var joinAlias: js.UndefOr[java.lang.String] = js.undefined
  var joinColumn: js.UndefOr[java.lang.String] = js.undefined
  var joinTable: java.lang.String
  var key: js.UndefOr[java.lang.String] = js.undefined
  var multiFilter: js.UndefOr[js.Any] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var orderBy: js.UndefOr[js.Any] = js.undefined
  var prevAlias: js.UndefOr[java.lang.String] = js.undefined
  var prevColumn: js.UndefOr[java.lang.String] = js.undefined
  var prevTable: java.lang.String
}

object IJoin {
  @scala.inline
  def apply(
    joinTable: java.lang.String,
    prevTable: java.lang.String,
    cachedModel: Model = null,
    columns: js.Array[java.lang.String] = null,
    columnsObject: js.Object = null,
    count: scala.Int | scala.Double = null,
    joinAlias: java.lang.String = null,
    joinColumn: java.lang.String = null,
    key: java.lang.String = null,
    multiFilter: js.Any = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    orderBy: js.Any = null,
    prevAlias: java.lang.String = null,
    prevColumn: java.lang.String = null
  ): IJoin = {
    val __obj = js.Dynamic.literal(joinTable = joinTable, prevTable = prevTable)
    if (cachedModel != null) __obj.updateDynamic("cachedModel")(cachedModel)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (columnsObject != null) __obj.updateDynamic("columnsObject")(columnsObject)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (joinAlias != null) __obj.updateDynamic("joinAlias")(joinAlias)
    if (joinColumn != null) __obj.updateDynamic("joinColumn")(joinColumn)
    if (key != null) __obj.updateDynamic("key")(key)
    if (multiFilter != null) __obj.updateDynamic("multiFilter")(multiFilter)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (prevAlias != null) __obj.updateDynamic("prevAlias")(prevAlias)
    if (prevColumn != null) __obj.updateDynamic("prevColumn")(prevColumn)
    __obj.asInstanceOf[IJoin]
  }
}


package typings.nodeSql2

import typings.nodeSql2.nodeSql2Strings.`no action`
import typings.nodeSql2.nodeSql2Strings.`set default`
import typings.nodeSql2.nodeSql2Strings.`set null`
import typings.nodeSql2.nodeSql2Strings.cascade
import typings.nodeSql2.nodeSql2Strings.restrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCascadeColumns[Row] extends js.Object {
  var columns: js.Array[String]
  var onDelete: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.undefined
  var onUpdate: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.undefined
  var refColumns: js.Array[String]
  var table: String
}

object AnonCascadeColumns {
  @scala.inline
  def apply[Row](
    columns: js.Array[String],
    refColumns: js.Array[String],
    table: String,
    onDelete: restrict | cascade | (`no action`) | (`set null`) | (`set default`) = null,
    onUpdate: restrict | cascade | (`no action`) | (`set null`) | (`set default`) = null
  ): AnonCascadeColumns[Row] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], refColumns = refColumns.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCascadeColumns[Row]]
  }
}


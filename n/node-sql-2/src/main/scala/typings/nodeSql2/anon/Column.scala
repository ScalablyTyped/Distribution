package typings.nodeSql2.anon

import typings.nodeSql2.nodeSql2Strings.`no action`
import typings.nodeSql2.nodeSql2Strings.`set default`
import typings.nodeSql2.nodeSql2Strings.`set null`
import typings.nodeSql2.nodeSql2Strings.cascade
import typings.nodeSql2.nodeSql2Strings.restrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: String
  var onDelete: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.undefined
  var onUpdate: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.undefined
  var table: String
}

object Column {
  @scala.inline
  def apply(
    column: String,
    table: String,
    onDelete: restrict | cascade | (`no action`) | (`set null`) | (`set default`) = null,
    onUpdate: restrict | cascade | (`no action`) | (`set null`) | (`set default`) = null
  ): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}


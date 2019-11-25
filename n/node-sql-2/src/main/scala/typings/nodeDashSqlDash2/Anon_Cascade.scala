package typings.nodeDashSqlDash2

import typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.`no action`
import typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.`set default`
import typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.`set null`
import typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.cascade
import typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.restrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cascade extends js.Object {
  var column: String
  var onDelete: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.undefined
  var onUpdate: js.UndefOr[restrict | cascade | (`no action`) | (`set null`) | (`set default`)] = js.undefined
  var table: String
}

object Anon_Cascade {
  @scala.inline
  def apply(
    column: String,
    table: String,
    onDelete: restrict | cascade | (`no action`) | (`set null`) | (`set default`) = null,
    onUpdate: restrict | cascade | (`no action`) | (`set null`) | (`set default`) = null
  ): Anon_Cascade = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cascade]
  }
}


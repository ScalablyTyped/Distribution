package typings.mssql.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBulkOptions extends js.Object {
  /** Honors constraints during bulk load, using T-SQL CHECK_CONSTRAINTS. (default: false) */
  var checkConstraints: js.UndefOr[Boolean] = js.undefined
  /** Honors insert triggers during bulk load, using the T-SQL FIRE_TRIGGERS. (default: false) */
  var fireTriggers: js.UndefOr[Boolean] = js.undefined
  /** Honors null value passed, ignores the default values set on table, using T-SQL KEEP_NULLS. (default: false) */
  var keepNulls: js.UndefOr[Boolean] = js.undefined
  /** Places a bulk update(BU) lock on table while performing bulk load, using T-SQL TABLOCK. (default: false) */
  var tableLock: js.UndefOr[Boolean] = js.undefined
}

object IBulkOptions {
  @scala.inline
  def apply(
    checkConstraints: js.UndefOr[Boolean] = js.undefined,
    fireTriggers: js.UndefOr[Boolean] = js.undefined,
    keepNulls: js.UndefOr[Boolean] = js.undefined,
    tableLock: js.UndefOr[Boolean] = js.undefined
  ): IBulkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkConstraints)) __obj.updateDynamic("checkConstraints")(checkConstraints)
    if (!js.isUndefined(fireTriggers)) __obj.updateDynamic("fireTriggers")(fireTriggers)
    if (!js.isUndefined(keepNulls)) __obj.updateDynamic("keepNulls")(keepNulls)
    if (!js.isUndefined(tableLock)) __obj.updateDynamic("tableLock")(tableLock)
    __obj.asInstanceOf[IBulkOptions]
  }
}


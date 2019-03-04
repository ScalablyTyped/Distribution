package typings
package nodeDashSqlDash2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CascadeColumns[Row] extends js.Object {
  var columns: js.Array[java.lang.String]
  var onDelete: js.UndefOr[
    nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.restrict | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.cascade | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`no action`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set null`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set default`)
  ] = js.undefined
  var onUpdate: js.UndefOr[
    nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.restrict | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.cascade | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`no action`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set null`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set default`)
  ] = js.undefined
  var refColumns: js.Array[java.lang.String]
  var table: java.lang.String
}

object Anon_CascadeColumns {
  @scala.inline
  def apply[Row](
    columns: js.Array[java.lang.String],
    refColumns: js.Array[java.lang.String],
    table: java.lang.String,
    onDelete: nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.restrict | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.cascade | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`no action`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set null`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set default`) = null,
    onUpdate: nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.restrict | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.cascade | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`no action`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set null`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set default`) = null
  ): Anon_CascadeColumns[Row] = {
    val __obj = js.Dynamic.literal(columns = columns, refColumns = refColumns, table = table)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CascadeColumns[Row]]
  }
}


package typings
package nodeDashSqlDash2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cascade extends js.Object {
  var column: java.lang.String
  var onDelete: js.UndefOr[
    nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.restrict | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.cascade | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`no action`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set null`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set default`)
  ] = js.undefined
  var onUpdate: js.UndefOr[
    nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.restrict | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.cascade | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`no action`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set null`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set default`)
  ] = js.undefined
  var table: java.lang.String
}

object Anon_Cascade {
  @scala.inline
  def apply(
    column: java.lang.String,
    table: java.lang.String,
    onDelete: nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.restrict | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.cascade | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`no action`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set null`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set default`) = null,
    onUpdate: nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.restrict | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.cascade | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`no action`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set null`) | (nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.`set default`) = null
  ): Anon_Cascade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("table")(table)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cascade]
  }
}


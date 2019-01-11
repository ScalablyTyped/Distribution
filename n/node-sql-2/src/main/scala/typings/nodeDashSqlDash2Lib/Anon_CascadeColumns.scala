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


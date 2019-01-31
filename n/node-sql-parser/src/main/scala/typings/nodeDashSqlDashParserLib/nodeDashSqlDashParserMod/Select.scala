package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select extends js.Object {
  var columns: js.Array[_] | nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.`*`
  var distinct: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.DISTINCT | scala.Null
  var from: (js.Array[From | Dual]) | scala.Null
  var groupby: js.Array[ColumnRef] | scala.Null
  var having: js.Array[_] | scala.Null
  var limit: js.Array[Limit] | scala.Null
  var options: js.Array[_] | scala.Null
  var orderby: js.Array[OrderBy] | scala.Null
  var `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.select
  var where: js.Any
  var `with`: With | scala.Null
}


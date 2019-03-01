package typings
package nodeDashMysqlDashWrapperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawRules extends js.Object {
  var begin: java.lang.String
  var end: java.lang.String
  var groupBy: java.lang.String
  var limit: scala.Double
  var limitEnd: scala.Double
   // limit = limitStart  =0 and limitEnd = limit.
  var limitStart: scala.Double
  var orderBy: java.lang.String
  var orderByDesc: java.lang.String
  var table: java.lang.String
}

object RawRules {
  @scala.inline
  def apply(
    begin: java.lang.String,
    end: java.lang.String,
    groupBy: java.lang.String,
    limit: scala.Double,
    limitEnd: scala.Double,
    limitStart: scala.Double,
    orderBy: java.lang.String,
    orderByDesc: java.lang.String,
    table: java.lang.String
  ): RawRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("begin")(begin)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("groupBy")(groupBy)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("limitEnd")(limitEnd)
    __obj.updateDynamic("limitStart")(limitStart)
    __obj.updateDynamic("orderBy")(orderBy)
    __obj.updateDynamic("orderByDesc")(orderByDesc)
    __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[RawRules]
  }
}


package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawRules extends js.Object {
  var begin: String
  var end: String
  var groupBy: String
  var limit: Double
  var limitEnd: Double
   // limit = limitStart  =0 and limitEnd = limit.
  var limitStart: Double
  var orderBy: String
  var orderByDesc: String
  var table: String
}

object RawRules {
  @scala.inline
  def apply(
    begin: String,
    end: String,
    groupBy: String,
    limit: Double,
    limitEnd: Double,
    limitStart: Double,
    orderBy: String,
    orderByDesc: String,
    table: String
  ): RawRules = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], limitEnd = limitEnd.asInstanceOf[js.Any], limitStart = limitStart.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderByDesc = orderByDesc.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RawRules]
  }
}


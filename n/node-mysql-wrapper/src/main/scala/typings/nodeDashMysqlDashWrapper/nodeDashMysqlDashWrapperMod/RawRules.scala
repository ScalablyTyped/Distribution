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
    val __obj = js.Dynamic.literal(begin = begin, end = end, groupBy = groupBy, limit = limit, limitEnd = limitEnd, limitStart = limitStart, orderBy = orderBy, orderByDesc = orderByDesc, table = table)
  
    __obj.asInstanceOf[RawRules]
  }
}


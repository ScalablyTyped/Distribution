package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICriteriaParts extends js.Object {
  var noDatabaseProperties: js.Array[String]
  var rawCriteriaObject: js.Any
  var tables: js.Array[TableToSearchPart]
  var whereClause: String
  def selectFromClause[T](_table: Table[T]): String
}

object ICriteriaParts {
  @scala.inline
  def apply(
    noDatabaseProperties: js.Array[String],
    rawCriteriaObject: js.Any,
    selectFromClause: Table[js.Any] => String,
    tables: js.Array[TableToSearchPart],
    whereClause: String
  ): ICriteriaParts = {
    val __obj = js.Dynamic.literal(noDatabaseProperties = noDatabaseProperties, rawCriteriaObject = rawCriteriaObject, selectFromClause = js.Any.fromFunction1(selectFromClause), tables = tables, whereClause = whereClause)
  
    __obj.asInstanceOf[ICriteriaParts]
  }
}


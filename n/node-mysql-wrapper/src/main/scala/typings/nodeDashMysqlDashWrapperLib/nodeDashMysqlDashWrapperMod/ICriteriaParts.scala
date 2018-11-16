package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICriteriaParts extends js.Object {
  var noDatabaseProperties: js.Array[java.lang.String]
  var rawCriteriaObject: js.Any
  var tables: js.Array[nodeDashMysqlDashWrapperLib.TableToSearchPart]
  var whereClause: java.lang.String
  def selectFromClause[T](_table: Table[T]): java.lang.String
}


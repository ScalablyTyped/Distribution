package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "CriteriaParts")
@js.native
class CriteriaParts protected () extends ICriteriaParts {
  def this(rawCriteriaObject: js.Any, tables: js.Array[nodeDashMysqlDashWrapperLib.TableToSearchPart], noDatabaseProperties: js.Array[java.lang.String], whereClause: java.lang.String) = this()
  /* CompleteClass */
  override var noDatabaseProperties: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override var rawCriteriaObject: js.Any = js.native
  /* CompleteClass */
  override var tables: js.Array[nodeDashMysqlDashWrapperLib.TableToSearchPart] = js.native
  /* CompleteClass */
  override var whereClause: java.lang.String = js.native
  /* CompleteClass */
  override def selectFromClause[T](_table: Table[T]): java.lang.String = js.native
}


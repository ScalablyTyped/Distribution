package typings.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "CriteriaParts")
@js.native
class CriteriaParts protected () extends ICriteriaParts {
  def this(
    rawCriteriaObject: js.Any,
    tables: js.Array[TableToSearchPart],
    noDatabaseProperties: js.Array[String],
    whereClause: String
  ) = this()
  /* CompleteClass */
  override var noDatabaseProperties: js.Array[String] = js.native
  /* CompleteClass */
  override var rawCriteriaObject: js.Any = js.native
  /* CompleteClass */
  override var tables: js.Array[TableToSearchPart] = js.native
  /* CompleteClass */
  override var whereClause: String = js.native
  /* CompleteClass */
  override def selectFromClause[T](_table: Table[T]): String = js.native
}


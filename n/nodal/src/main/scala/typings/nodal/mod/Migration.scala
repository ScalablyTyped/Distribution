package typings.nodal.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "Migration")
@js.native
class Migration protected () extends js.Object {
  def this(db: Database) = this()
  var db: js.Any = js.native
  var id: js.Any = js.native
  var schema: js.Any = js.native
  def addColumn(table: String, column: String, `type`: DataType, properties: IColumnProperties): js.Any = js.native
  def addForeignKey(table: String, referenceTable: String): js.Any = js.native
  def alterColumn(table: String, column: String, `type`: DataType, properties: IColumnProperties): js.Any = js.native
  def createIndex(table: String, column: String, `type`: DataType): js.Any = js.native
  def createTable(table: String, arrFieldData: js.Array[js.Object], modelName: String): js.Any = js.native
  def down(): js.Array[String] = js.native
  def dropColumn(table: String, column: String): js.Any = js.native
  def dropForeignKey(table: String, referenceTable: String): js.Any = js.native
  def dropIndex(table: String, column: String): js.Any = js.native
  def dropTable(table: String): js.Any = js.native
  def executeDown(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def executeDown(callback: js.Function1[/* err */ Error, Unit], prevId: String): Unit = js.native
  def executeUp(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def renameColumn(table: String, column: String, newColumn: String): js.Any = js.native
  def renameTable(table: String, newTableName: String, renameModel: String, newModelName: String): js.Any = js.native
  def up(): js.Array[String] = js.native
}


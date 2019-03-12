package typings
package nodalLib.nodalMod

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
  def addColumn(table: java.lang.String, column: java.lang.String, `type`: DataType, properties: IColumnProperties): js.Any = js.native
  def addForeignKey(table: java.lang.String, referenceTable: java.lang.String): js.Any = js.native
  def alterColumn(table: java.lang.String, column: java.lang.String, `type`: DataType, properties: IColumnProperties): js.Any = js.native
  def createIndex(table: java.lang.String, column: java.lang.String, `type`: DataType): js.Any = js.native
  def createTable(table: java.lang.String, arrFieldData: js.Array[js.Object], modelName: java.lang.String): js.Any = js.native
  def down(): js.Array[java.lang.String] = js.native
  def dropColumn(table: java.lang.String, column: java.lang.String): js.Any = js.native
  def dropForeignKey(table: java.lang.String, referenceTable: java.lang.String): js.Any = js.native
  def dropIndex(table: java.lang.String, column: java.lang.String): js.Any = js.native
  def dropTable(table: java.lang.String): js.Any = js.native
  def executeDown(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def executeDown(callback: js.Function1[/* err */ stdLib.Error, scala.Unit], prevId: java.lang.String): scala.Unit = js.native
  def executeUp(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def renameColumn(table: java.lang.String, column: java.lang.String, newColumn: java.lang.String): js.Any = js.native
  def renameTable(
    table: java.lang.String,
    newTableName: java.lang.String,
    renameModel: java.lang.String,
    newModelName: java.lang.String
  ): js.Any = js.native
  def up(): js.Array[java.lang.String] = js.native
}


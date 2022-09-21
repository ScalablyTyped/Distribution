package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "Migration")
@js.native
open class Migration protected () extends StObject {
  def this(db: Database) = this()
  
  def addColumn(table: String, column: String, `type`: DataType, properties: IColumnProperties): Any = js.native
  
  def addForeignKey(table: String, referenceTable: String): Any = js.native
  
  def alterColumn(table: String, column: String, `type`: DataType, properties: IColumnProperties): Any = js.native
  
  def createIndex(table: String, column: String, `type`: DataType): Any = js.native
  
  def createTable(table: String, arrFieldData: js.Array[js.Object], modelName: String): Any = js.native
  
  /* private */ var db: Any = js.native
  
  def down(): js.Array[String] = js.native
  
  def dropColumn(table: String, column: String): Any = js.native
  
  def dropForeignKey(table: String, referenceTable: String): Any = js.native
  
  def dropIndex(table: String, column: String): Any = js.native
  
  def dropTable(table: String): Any = js.native
  
  def executeDown(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def executeDown(callback: js.Function1[/* err */ js.Error, Unit], prevId: String): Unit = js.native
  
  def executeUp(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /* private */ var id: Any = js.native
  
  def renameColumn(table: String, column: String, newColumn: String): Any = js.native
  
  def renameTable(table: String, newTableName: String, renameModel: String, newModelName: String): Any = js.native
  
  /* private */ var schema: Any = js.native
  
  def up(): js.Array[String] = js.native
}

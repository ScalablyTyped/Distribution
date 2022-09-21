package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// helpers.TableName class;
// API: http://vitaly-t.github.io/pg-promise/helpers.TableName.html
@JSImport("pg-promise", "TableName")
@js.native
open class TableName protected () extends StObject {
  def this(table: String) = this()
  def this(table: ITable) = this()
  
  // these are all read-only:
  val name: String = js.native
  
  val schema: String = js.native
  
  val table: String = js.native
}

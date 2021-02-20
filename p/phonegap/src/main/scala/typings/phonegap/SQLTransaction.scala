package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SQLTransaction extends StObject {
  
  def executeSql(sql: String): SQLResultSet = js.native
}
object SQLTransaction {
  
  @scala.inline
  def apply(executeSql: String => SQLResultSet): SQLTransaction = {
    val __obj = js.Dynamic.literal(executeSql = js.Any.fromFunction1(executeSql))
    __obj.asInstanceOf[SQLTransaction]
  }
  
  @scala.inline
  implicit class SQLTransactionMutableBuilder[Self <: SQLTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecuteSql(value: String => SQLResultSet): Self = StObject.set(x, "executeSql", js.Any.fromFunction1(value))
  }
}

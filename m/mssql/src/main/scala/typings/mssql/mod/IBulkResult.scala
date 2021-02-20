package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBulkResult extends StObject {
  
  var rowsAffected: Double = js.native
}
object IBulkResult {
  
  @scala.inline
  def apply(rowsAffected: Double): IBulkResult = {
    val __obj = js.Dynamic.literal(rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBulkResult]
  }
  
  @scala.inline
  implicit class IBulkResultMutableBuilder[Self <: IBulkResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
  }
}

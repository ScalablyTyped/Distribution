package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAnswer extends StObject {
  
  var affectedRows: Double = js.native
  
  var table: String = js.native
}
object DeleteAnswer {
  
  @scala.inline
  def apply(affectedRows: Double, table: String): DeleteAnswer = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnswer]
  }
  
  @scala.inline
  implicit class DeleteAnswerMutableBuilder[Self <: DeleteAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}

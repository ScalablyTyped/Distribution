package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultBase extends StObject {
  
  var command: String = js.native
  
  var fields: js.Array[FieldDef] = js.native
  
  var oid: Double = js.native
  
  var rowCount: Double = js.native
}
object QueryResultBase {
  
  @scala.inline
  def apply(command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double): QueryResultBase = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultBase]
  }
  
  @scala.inline
  implicit class QueryResultBaseMutableBuilder[Self <: QueryResultBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[FieldDef]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: FieldDef*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setOid(value: Double): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
  }
}

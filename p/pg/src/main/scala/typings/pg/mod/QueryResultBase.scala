package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResultBase extends StObject {
  
  var command: String
  
  var fields: js.Array[FieldDef]
  
  var oid: Double
  
  var rowCount: Double
}
object QueryResultBase {
  
  inline def apply(command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double): QueryResultBase = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryResultBase] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[FieldDef]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldDef*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setOid(value: Double): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
  }
}

package typings.pgPromise.pgSubsetMod

import typings.pgPromise.anon.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResult extends StObject {
  
  var _parsers: js.Array[js.Function]
  
  var _types: Binary
  
  var command: String
  
  var fields: js.Array[IColumn]
  
  // properties below are not available within Native Bindings:
  var rowAsArray: Boolean
  
  var rowCount: Double
  
  var rows: js.Array[Any]
}
object IResult {
  
  inline def apply(
    _parsers: js.Array[js.Function],
    _types: Binary,
    command: String,
    fields: js.Array[IColumn],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[Any]
  ): IResult = {
    val __obj = js.Dynamic.literal(_parsers = _parsers.asInstanceOf[js.Any], _types = _types.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
  
  extension [Self <: IResult](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[IColumn]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: IColumn*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setRowAsArray(value: Boolean): Self = StObject.set(x, "rowAsArray", value.asInstanceOf[js.Any])
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[Any]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Any*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def set_parsers(value: js.Array[js.Function]): Self = StObject.set(x, "_parsers", value.asInstanceOf[js.Any])
    
    inline def set_parsersVarargs(value: js.Function*): Self = StObject.set(x, "_parsers", js.Array(value*))
    
    inline def set_types(value: Binary): Self = StObject.set(x, "_types", value.asInstanceOf[js.Any])
  }
}

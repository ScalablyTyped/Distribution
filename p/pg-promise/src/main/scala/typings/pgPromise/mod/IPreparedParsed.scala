package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPreparedParsed extends StObject {
  
  var binary: Boolean
  
  var name: String
  
  var rowMode: Unit | array
  
  var rows: Double
  
  var text: String
  
  var values: js.Array[js.Any]
}
object IPreparedParsed {
  
  inline def apply(
    binary: Boolean,
    name: String,
    rowMode: Unit | array,
    rows: Double,
    text: String,
    values: js.Array[js.Any]
  ): IPreparedParsed = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowMode = rowMode.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreparedParsed]
  }
  
  extension [Self <: IPreparedParsed](x: Self) {
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRowMode(value: Unit | array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

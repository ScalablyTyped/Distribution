package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreparedParsed extends StObject {
  
  var binary: Boolean = js.native
  
  var name: String = js.native
  
  var rowMode: Unit | array = js.native
  
  var rows: Double = js.native
  
  var text: String = js.native
  
  var values: js.Array[_] = js.native
}
object IPreparedParsed {
  
  @scala.inline
  def apply(
    binary: Boolean,
    name: String,
    rowMode: Unit | array,
    rows: Double,
    text: String,
    values: js.Array[_]
  ): IPreparedParsed = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowMode = rowMode.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreparedParsed]
  }
  
  @scala.inline
  implicit class IPreparedParsedMutableBuilder[Self <: IPreparedParsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowMode(value: Unit | array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

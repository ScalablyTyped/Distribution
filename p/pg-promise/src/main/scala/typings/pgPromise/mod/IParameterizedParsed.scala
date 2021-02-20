package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParameterizedParsed extends StObject {
  
  var binary: Boolean = js.native
  
  var rowMode: Unit | array = js.native
  
  var text: String = js.native
  
  var values: js.Array[_] = js.native
}
object IParameterizedParsed {
  
  @scala.inline
  def apply(binary: Boolean, rowMode: Unit | array, text: String, values: js.Array[_]): IParameterizedParsed = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], rowMode = rowMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParameterizedParsed]
  }
  
  @scala.inline
  implicit class IParameterizedParsedMutableBuilder[Self <: IParameterizedParsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowMode(value: Unit | array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

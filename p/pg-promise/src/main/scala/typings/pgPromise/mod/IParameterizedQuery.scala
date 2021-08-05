package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParameterizedQuery
  extends StObject
     with _QueryParam {
  
  var binary: js.UndefOr[Boolean] = js.undefined
  
  var rowMode: js.UndefOr[Unit | array] = js.undefined
  
  var text: js.UndefOr[String | QueryFile] = js.undefined
  
  var values: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object IParameterizedQuery {
  
  inline def apply(): IParameterizedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParameterizedQuery]
  }
  
  extension [Self <: IParameterizedQuery](x: Self) {
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setRowMode(value: Unit | array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
    
    inline def setRowModeUndefined: Self = StObject.set(x, "rowMode", js.undefined)
    
    inline def setText(value: String | QueryFile): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

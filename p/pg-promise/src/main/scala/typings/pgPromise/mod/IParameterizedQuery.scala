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
  
  @scala.inline
  def apply(): IParameterizedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParameterizedQuery]
  }
  
  @scala.inline
  implicit class IParameterizedQueryMutableBuilder[Self <: IParameterizedQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setRowMode(value: Unit | array): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowModeUndefined: Self = StObject.set(x, "rowMode", js.undefined)
    
    @scala.inline
    def setText(value: String | QueryFile): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

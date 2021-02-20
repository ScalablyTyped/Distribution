package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.RangeValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedItemArrayValues.toJSON()`. */
@js.native
trait NamedItemArrayValuesData extends StObject {
  
  /**
    *
    * Represents the types for each item in the named item array
    *
    * [Api set: ExcelApi 1.7]
    */
  var types: js.UndefOr[js.Array[js.Array[RangeValueType]]] = js.native
  
  /**
    *
    * Represents the values of each item in the named item array.
    *
    * [Api set: ExcelApi 1.7]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}
object NamedItemArrayValuesData {
  
  @scala.inline
  def apply(): NamedItemArrayValuesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemArrayValuesData]
  }
  
  @scala.inline
  implicit class NamedItemArrayValuesDataMutableBuilder[Self <: NamedItemArrayValuesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypes(value: js.Array[js.Array[RangeValueType]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: js.Array[RangeValueType]*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

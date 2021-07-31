package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotTableStyle.toJSON()`. */
trait PivotTableStyleData extends StObject {
  
  /**
    *
    * Gets the name of the PivotTableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies if this PivotTableStyle object is read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object PivotTableStyleData {
  
  @scala.inline
  def apply(): PivotTableStyleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableStyleData]
  }
  
  @scala.inline
  implicit class PivotTableStyleDataMutableBuilder[Self <: PivotTableStyleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}

package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotHierarchy.toJSON()`. */
trait PivotHierarchyData extends StObject {
  
  /**
    * Returns the PivotFields associated with the PivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var fields: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
  
  /**
    * ID of the PivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the PivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
}
object PivotHierarchyData {
  
  inline def apply(): PivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHierarchyData]
  }
  
  extension [Self <: PivotHierarchyData](x: Self) {
    
    inline def setFields(value: js.Array[PivotFieldData]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: PivotFieldData*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

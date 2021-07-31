package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotHierarchy.toJSON()`. */
trait PivotHierarchyData extends StObject {
  
  /**
    *
    * Returns the PivotFields associated with the PivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var fields: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
  
  /**
    *
    * Id of the PivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Name of the PivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
}
object PivotHierarchyData {
  
  @scala.inline
  def apply(): PivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHierarchyData]
  }
  
  @scala.inline
  implicit class PivotHierarchyDataMutableBuilder[Self <: PivotHierarchyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[PivotFieldData]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: PivotFieldData*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

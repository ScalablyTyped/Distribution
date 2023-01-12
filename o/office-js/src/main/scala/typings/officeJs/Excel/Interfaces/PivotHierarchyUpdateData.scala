package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotHierarchy object, for use in `pivotHierarchy.set({ ... })`. */
trait PivotHierarchyUpdateData extends StObject {
  
  /**
    * Name of the PivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
}
object PivotHierarchyUpdateData {
  
  inline def apply(): PivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHierarchyUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotHierarchyUpdateData] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

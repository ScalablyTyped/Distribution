package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlicerStyle object, for use in `slicerStyle.set({ ... })`. */
trait SlicerStyleUpdateData extends StObject {
  
  /**
    *
    * Gets the name of the SlicerStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}
object SlicerStyleUpdateData {
  
  inline def apply(): SlicerStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerStyleUpdateData]
  }
  
  extension [Self <: SlicerStyleUpdateData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

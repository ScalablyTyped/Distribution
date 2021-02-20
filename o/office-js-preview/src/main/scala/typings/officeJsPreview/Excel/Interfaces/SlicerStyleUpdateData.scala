package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlicerStyle object, for use in `slicerStyle.set({ ... })`. */
@js.native
trait SlicerStyleUpdateData extends StObject {
  
  /**
    *
    * Gets the name of the SlicerStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.native
}
object SlicerStyleUpdateData {
  
  @scala.inline
  def apply(): SlicerStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerStyleUpdateData]
  }
  
  @scala.inline
  implicit class SlicerStyleUpdateDataMutableBuilder[Self <: SlicerStyleUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.BindingType
import typings.officeJsPreview.officeJsPreviewStrings.Range
import typings.officeJsPreview.officeJsPreviewStrings.Table
import typings.officeJsPreview.officeJsPreviewStrings.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `binding.toJSON()`. */
trait BindingData extends StObject {
  
  /**
    *
    * Represents binding identifier.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[BindingType | Range | Table | Text] = js.undefined
}
object BindingData {
  
  @scala.inline
  def apply(): BindingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingData]
  }
  
  @scala.inline
  implicit class BindingDataMutableBuilder[Self <: BindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: BindingType | Range | Table | Text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

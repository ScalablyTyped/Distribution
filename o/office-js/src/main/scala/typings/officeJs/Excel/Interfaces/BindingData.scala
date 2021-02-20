package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.BindingType
import typings.officeJs.officeJsStrings.Range
import typings.officeJs.officeJsStrings.Table
import typings.officeJs.officeJsStrings.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `binding.toJSON()`. */
@js.native
trait BindingData extends StObject {
  
  /**
    *
    * Represents binding identifier.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[BindingType | Range | Table | Text] = js.native
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

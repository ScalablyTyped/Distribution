package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a worksheet-level custom property.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait WorksheetCustomPropertyLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the key of the custom property. Custom property keys are case-insensitive. The key is limited to 255 characters (larger values will cause an "InvalidArgument" error to be thrown.)
    *
    * [Api set: ExcelApi 1.12]
    */
  var key: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.12]
    */
  var value: js.UndefOr[Boolean] = js.native
}
object WorksheetCustomPropertyLoadOptions {
  
  @scala.inline
  def apply(): WorksheetCustomPropertyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyLoadOptions]
  }
  
  @scala.inline
  implicit class WorksheetCustomPropertyLoadOptionsMutableBuilder[Self <: WorksheetCustomPropertyLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

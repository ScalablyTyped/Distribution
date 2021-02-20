package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CustomProperty object, for use in `customProperty.set({ ... })`. */
@js.native
trait CustomPropertyUpdateData extends StObject {
  
  /**
    *
    * Gets or sets the value of the custom property. Note that even though Word for the web and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[js.Any] = js.native
}
object CustomPropertyUpdateData {
  
  @scala.inline
  def apply(): CustomPropertyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyUpdateData]
  }
  
  @scala.inline
  implicit class CustomPropertyUpdateDataMutableBuilder[Self <: CustomPropertyUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

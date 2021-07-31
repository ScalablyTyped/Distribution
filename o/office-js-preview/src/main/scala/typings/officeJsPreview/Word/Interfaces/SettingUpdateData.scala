package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Setting object, for use in `setting.set({ ... })`. */
trait SettingUpdateData extends StObject {
  
  /**
    *
    * Gets or sets the value of the setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object SettingUpdateData {
  
  @scala.inline
  def apply(): SettingUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingUpdateData]
  }
  
  @scala.inline
  implicit class SettingUpdateDataMutableBuilder[Self <: SettingUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

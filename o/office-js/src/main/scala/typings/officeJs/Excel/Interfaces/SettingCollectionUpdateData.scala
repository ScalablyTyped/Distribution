package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SettingCollection object, for use in `settingCollection.set({ ... })`. */
trait SettingCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SettingData]] = js.undefined
}
object SettingCollectionUpdateData {
  
  @scala.inline
  def apply(): SettingCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingCollectionUpdateData]
  }
  
  @scala.inline
  implicit class SettingCollectionUpdateDataMutableBuilder[Self <: SettingCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SettingData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SettingData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

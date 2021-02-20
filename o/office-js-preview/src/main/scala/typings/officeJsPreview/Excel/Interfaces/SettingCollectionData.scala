package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `settingCollection.toJSON()`. */
@js.native
trait SettingCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SettingData]] = js.native
}
object SettingCollectionData {
  
  @scala.inline
  def apply(): SettingCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingCollectionData]
  }
  
  @scala.inline
  implicit class SettingCollectionDataMutableBuilder[Self <: SettingCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SettingData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SettingData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

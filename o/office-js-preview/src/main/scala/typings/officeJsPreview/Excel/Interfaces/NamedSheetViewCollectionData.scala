package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedSheetViewCollection.toJSON()`. */
@js.native
trait NamedSheetViewCollectionData extends js.Object {
  
  var items: js.UndefOr[js.Array[NamedSheetViewData]] = js.native
}
object NamedSheetViewCollectionData {
  
  @scala.inline
  def apply(): NamedSheetViewCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedSheetViewCollectionData]
  }
  
  @scala.inline
  implicit class NamedSheetViewCollectionDataOps[Self <: NamedSheetViewCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: NamedSheetViewData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[NamedSheetViewData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}

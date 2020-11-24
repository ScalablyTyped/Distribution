package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `linkedDataTypeCollection.toJSON()`. */
@js.native
trait LinkedDataTypeCollectionData extends js.Object {
  
  var items: js.UndefOr[js.Array[LinkedDataTypeData]] = js.native
}
object LinkedDataTypeCollectionData {
  
  @scala.inline
  def apply(): LinkedDataTypeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeCollectionData]
  }
  
  @scala.inline
  implicit class LinkedDataTypeCollectionDataOps[Self <: LinkedDataTypeCollectionData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: LinkedDataTypeData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[LinkedDataTypeData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}

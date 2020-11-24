package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeBorderCollection.toJSON()`. */
@js.native
trait RangeBorderCollectionData extends js.Object {
  
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.native
}
object RangeBorderCollectionData {
  
  @scala.inline
  def apply(): RangeBorderCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderCollectionData]
  }
  
  @scala.inline
  implicit class RangeBorderCollectionDataOps[Self <: RangeBorderCollectionData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: RangeBorderData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[RangeBorderData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}

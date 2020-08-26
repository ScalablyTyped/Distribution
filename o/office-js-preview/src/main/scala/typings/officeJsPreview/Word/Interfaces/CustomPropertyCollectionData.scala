package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `customPropertyCollection.toJSON()`. */
@js.native
trait CustomPropertyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[CustomPropertyData]] = js.native
}

object CustomPropertyCollectionData {
  @scala.inline
  def apply(): CustomPropertyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyCollectionData]
  }
  @scala.inline
  implicit class CustomPropertyCollectionDataOps[Self <: CustomPropertyCollectionData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: CustomPropertyData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[CustomPropertyData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}


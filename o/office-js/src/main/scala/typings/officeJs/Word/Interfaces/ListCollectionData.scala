package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `listCollection.toJSON()`. */
@js.native
trait ListCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ListData]] = js.native
}

object ListCollectionData {
  @scala.inline
  def apply(): ListCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionData]
  }
  @scala.inline
  implicit class ListCollectionDataOps[Self <: ListCollectionData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: ListData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ListData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}


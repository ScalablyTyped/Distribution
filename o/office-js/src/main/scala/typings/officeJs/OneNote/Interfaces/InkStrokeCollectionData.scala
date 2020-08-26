package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkStrokeCollection.toJSON()". */
@js.native
trait InkStrokeCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[InkStrokeData]] = js.native
}

object InkStrokeCollectionData {
  @scala.inline
  def apply(): InkStrokeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeCollectionData]
  }
  @scala.inline
  implicit class InkStrokeCollectionDataOps[Self <: InkStrokeCollectionData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: InkStrokeData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[InkStrokeData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}


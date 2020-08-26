package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "sectionGroupCollection.toJSON()". */
@js.native
trait SectionGroupCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[SectionGroupData]] = js.native
}

object SectionGroupCollectionData {
  @scala.inline
  def apply(): SectionGroupCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupCollectionData]
  }
  @scala.inline
  implicit class SectionGroupCollectionDataOps[Self <: SectionGroupCollectionData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SectionGroupData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SectionGroupData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}


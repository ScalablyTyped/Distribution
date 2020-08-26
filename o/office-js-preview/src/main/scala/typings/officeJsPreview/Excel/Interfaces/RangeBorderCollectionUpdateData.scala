package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeBorderCollection object, for use in `rangeBorderCollection.set({ ... })`. */
@js.native
trait RangeBorderCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.native
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Borders, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the entire border collections don't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.native
}

object RangeBorderCollectionUpdateData {
  @scala.inline
  def apply(): RangeBorderCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderCollectionUpdateData]
  }
  @scala.inline
  implicit class RangeBorderCollectionUpdateDataOps[Self <: RangeBorderCollectionUpdateData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
  }
  
}


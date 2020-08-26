package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalRangeBorderCollection object, for use in `conditionalRangeBorderCollection.set({ ... })`. */
@js.native
trait ConditionalRangeBorderCollectionUpdateData extends js.Object {
  /**
    *
    * Gets the bottom border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var bottom: js.UndefOr[ConditionalRangeBorderUpdateData] = js.native
  var items: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.native
  /**
    *
    * Gets the left border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var left: js.UndefOr[ConditionalRangeBorderUpdateData] = js.native
  /**
    *
    * Gets the right border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var right: js.UndefOr[ConditionalRangeBorderUpdateData] = js.native
  /**
    *
    * Gets the top border.
    *
    * [Api set: ExcelApi 1.6]
    */
  var top: js.UndefOr[ConditionalRangeBorderUpdateData] = js.native
}

object ConditionalRangeBorderCollectionUpdateData {
  @scala.inline
  def apply(): ConditionalRangeBorderCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderCollectionUpdateData]
  }
  @scala.inline
  implicit class ConditionalRangeBorderCollectionUpdateDataOps[Self <: ConditionalRangeBorderCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setBottom(value: ConditionalRangeBorderUpdateData): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setItemsVarargs(value: ConditionalRangeBorderData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ConditionalRangeBorderData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLeft(value: ConditionalRangeBorderUpdateData): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: ConditionalRangeBorderUpdateData): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: ConditionalRangeBorderUpdateData): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}


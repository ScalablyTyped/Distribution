package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.borders` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.borders` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellBorderCollection extends js.Object {
  /**
    *
    * Represents the `format.borders.bottom` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.diagonalDown` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var diagonalDown: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.diagonalUp` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var diagonalUp: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.horizontal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontal: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.left` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.right` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.top` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[CellBorder] = js.native
  /**
    *
    * Represents the `format.borders.vertical` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var vertical: js.UndefOr[CellBorder] = js.native
}

object CellBorderCollection {
  @scala.inline
  def apply(): CellBorderCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellBorderCollection]
  }
  @scala.inline
  implicit class CellBorderCollectionOps[Self <: CellBorderCollection] (val x: Self) extends AnyVal {
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
    def setBottom(value: CellBorder): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setDiagonalDown(value: CellBorder): Self = this.set("diagonalDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagonalDown: Self = this.set("diagonalDown", js.undefined)
    @scala.inline
    def setDiagonalUp(value: CellBorder): Self = this.set("diagonalUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagonalUp: Self = this.set("diagonalUp", js.undefined)
    @scala.inline
    def setHorizontal(value: CellBorder): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setLeft(value: CellBorder): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: CellBorder): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: CellBorder): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setVertical(value: CellBorder): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}


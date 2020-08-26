package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.Alignment
import typings.officeJs.Word.VerticalAlignment
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Centered
import typings.officeJs.officeJsStrings.Justified
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Top
import typings.officeJs.officeJsStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableRow object, for use in `tableRow.set({ ... })`. */
@js.native
trait TableRowUpdateData extends js.Object {
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontUpdateData] = js.native
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.native
  /**
    *
    * Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: js.UndefOr[Double] = js.native
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[String] = js.native
  /**
    *
    * Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    *
    * Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.native
}

object TableRowUpdateData {
  @scala.inline
  def apply(): TableRowUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowUpdateData]
  }
  @scala.inline
  implicit class TableRowUpdateDataOps[Self <: TableRowUpdateData] (val x: Self) extends AnyVal {
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
    def setFont(value: FontUpdateData): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setPreferredHeight(value: Double): Self = this.set("preferredHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredHeight: Self = this.set("preferredHeight", js.undefined)
    @scala.inline
    def setShadingColor(value: String): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Array[String]*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[js.Array[String]]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | Mixed | Top | Center | Bottom): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}


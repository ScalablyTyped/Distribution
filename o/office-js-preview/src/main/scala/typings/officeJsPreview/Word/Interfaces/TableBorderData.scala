package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.BorderType
import typings.officeJsPreview.officeJsPreviewStrings.DashDotStroked
import typings.officeJsPreview.officeJsPreviewStrings.Dashed
import typings.officeJsPreview.officeJsPreviewStrings.DashedSmall
import typings.officeJsPreview.officeJsPreviewStrings.Dot2Dashed
import typings.officeJsPreview.officeJsPreviewStrings.DotDashed
import typings.officeJsPreview.officeJsPreviewStrings.Dotted
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.DoubleWave
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.ThickThinLarge
import typings.officeJsPreview.officeJsPreviewStrings.ThickThinMed
import typings.officeJsPreview.officeJsPreviewStrings.ThickThinSmall
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickLarge
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickMed
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickSmall
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickThinLarge
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickThinMed
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickThinSmall
import typings.officeJsPreview.officeJsPreviewStrings.ThreeDEmboss
import typings.officeJsPreview.officeJsPreviewStrings.ThreeDEngrave
import typings.officeJsPreview.officeJsPreviewStrings.Triple
import typings.officeJsPreview.officeJsPreviewStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableBorder.toJSON()`. */
@js.native
trait TableBorderData extends js.Object {
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.native
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.native
}

object TableBorderData {
  @scala.inline
  def apply(): TableBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderData]
  }
  @scala.inline
  implicit class TableBorderDataOps[Self <: TableBorderData] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setType(
      value: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: scala.Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


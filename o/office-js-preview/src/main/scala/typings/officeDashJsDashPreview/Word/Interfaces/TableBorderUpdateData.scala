package typings.officeDashJsDashPreview.Word.Interfaces

import typings.officeDashJsDashPreview.Word.BorderType
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotStroked
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dashed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashedSmall
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot2Dashed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DotDashed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dotted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Double
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DoubleWave
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Mixed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Single
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThickThinLarge
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThickThinMed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThickThinSmall
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickLarge
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickMed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickSmall
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickThinLarge
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickThinMed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickThinSmall
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeDEmboss
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeDEngrave
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Triple
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableBorder object, for use in "tableBorder.set({ ... })". */
trait TableBorderUpdateData extends js.Object {
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.undefined
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TableBorderUpdateData {
  @scala.inline
  def apply(
    color: String = null,
    `type`: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave = null,
    width: Int | scala.Double = null
  ): TableBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderUpdateData]
  }
}


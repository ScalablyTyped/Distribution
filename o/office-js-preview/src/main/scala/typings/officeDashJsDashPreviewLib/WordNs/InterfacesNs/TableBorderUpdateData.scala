package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

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
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.WordNs.BorderType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dotted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dashed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot2Dashed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triple | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickThinSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickThinSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickMed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickThinMed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickThinMed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickLarge | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickThinLarge | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickThinLarge | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wave | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DoubleWave | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashedSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotStroked | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeDEmboss | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeDEngrave
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
    color: java.lang.String = null,
    `type`: officeDashJsDashPreviewLib.WordNs.BorderType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dotted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dashed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot2Dashed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triple | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickThinSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickThinSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickMed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickThinMed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickThinMed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickLarge | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickThinLarge | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThickThinLarge | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wave | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DoubleWave | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashedSmall | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotStroked | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeDEmboss | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeDEngrave = null,
    width: scala.Int | scala.Double = null
  ): TableBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderUpdateData]
  }
}


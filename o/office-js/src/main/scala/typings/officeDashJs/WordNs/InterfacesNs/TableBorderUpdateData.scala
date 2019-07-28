package typings.officeDashJs.WordNs.InterfacesNs

import typings.officeDashJs.WordNs.BorderType
import typings.officeDashJs.officeDashJsStrings.DashDotStroked
import typings.officeDashJs.officeDashJsStrings.Dashed
import typings.officeDashJs.officeDashJsStrings.DashedSmall
import typings.officeDashJs.officeDashJsStrings.Dot2Dashed
import typings.officeDashJs.officeDashJsStrings.DotDashed
import typings.officeDashJs.officeDashJsStrings.Dotted
import typings.officeDashJs.officeDashJsStrings.Double
import typings.officeDashJs.officeDashJsStrings.DoubleWave
import typings.officeDashJs.officeDashJsStrings.Mixed
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Single
import typings.officeDashJs.officeDashJsStrings.ThickThinLarge
import typings.officeDashJs.officeDashJsStrings.ThickThinMed
import typings.officeDashJs.officeDashJsStrings.ThickThinSmall
import typings.officeDashJs.officeDashJsStrings.ThinThickLarge
import typings.officeDashJs.officeDashJsStrings.ThinThickMed
import typings.officeDashJs.officeDashJsStrings.ThinThickSmall
import typings.officeDashJs.officeDashJsStrings.ThinThickThinLarge
import typings.officeDashJs.officeDashJsStrings.ThinThickThinMed
import typings.officeDashJs.officeDashJsStrings.ThinThickThinSmall
import typings.officeDashJs.officeDashJsStrings.ThreeDEmboss
import typings.officeDashJs.officeDashJsStrings.ThreeDEngrave
import typings.officeDashJs.officeDashJsStrings.Triple
import typings.officeDashJs.officeDashJsStrings.Wave
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
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderUpdateData]
  }
}


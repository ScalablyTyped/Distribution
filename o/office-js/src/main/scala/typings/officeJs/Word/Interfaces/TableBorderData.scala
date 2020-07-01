package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.BorderType
import typings.officeJs.officeJsStrings.DashDotStroked
import typings.officeJs.officeJsStrings.Dashed
import typings.officeJs.officeJsStrings.DashedSmall
import typings.officeJs.officeJsStrings.Dot2Dashed
import typings.officeJs.officeJsStrings.DotDashed
import typings.officeJs.officeJsStrings.Dotted
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.DoubleWave
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Single
import typings.officeJs.officeJsStrings.ThickThinLarge
import typings.officeJs.officeJsStrings.ThickThinMed
import typings.officeJs.officeJsStrings.ThickThinSmall
import typings.officeJs.officeJsStrings.ThinThickLarge
import typings.officeJs.officeJsStrings.ThinThickMed
import typings.officeJs.officeJsStrings.ThinThickSmall
import typings.officeJs.officeJsStrings.ThinThickThinLarge
import typings.officeJs.officeJsStrings.ThinThickThinMed
import typings.officeJs.officeJsStrings.ThinThickThinSmall
import typings.officeJs.officeJsStrings.ThreeDEmboss
import typings.officeJs.officeJsStrings.ThreeDEngrave
import typings.officeJs.officeJsStrings.Triple
import typings.officeJs.officeJsStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableBorder.toJSON()`. */
trait TableBorderData extends js.Object {
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

object TableBorderData {
  @scala.inline
  def apply(
    color: String = null,
    `type`: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave = null,
    width: js.UndefOr[scala.Double] = js.undefined
  ): TableBorderData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderData]
  }
}


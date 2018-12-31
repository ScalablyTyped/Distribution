package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableBorder.toJSON()". */
trait TableBorderData extends js.Object {
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
    officeDashJsLib.WordNs.BorderType | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Single | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Dotted | officeDashJsLib.officeDashJsLibStrings.Dashed | officeDashJsLib.officeDashJsLibStrings.DotDashed | officeDashJsLib.officeDashJsLibStrings.Dot2Dashed | officeDashJsLib.officeDashJsLibStrings.Triple | officeDashJsLib.officeDashJsLibStrings.ThinThickSmall | officeDashJsLib.officeDashJsLibStrings.ThickThinSmall | officeDashJsLib.officeDashJsLibStrings.ThinThickThinSmall | officeDashJsLib.officeDashJsLibStrings.ThinThickMed | officeDashJsLib.officeDashJsLibStrings.ThickThinMed | officeDashJsLib.officeDashJsLibStrings.ThinThickThinMed | officeDashJsLib.officeDashJsLibStrings.ThinThickLarge | officeDashJsLib.officeDashJsLibStrings.ThickThinLarge | officeDashJsLib.officeDashJsLibStrings.ThinThickThinLarge | officeDashJsLib.officeDashJsLibStrings.Wave | officeDashJsLib.officeDashJsLibStrings.DoubleWave | officeDashJsLib.officeDashJsLibStrings.DashedSmall | officeDashJsLib.officeDashJsLibStrings.DashDotStroked | officeDashJsLib.officeDashJsLibStrings.ThreeDEmboss | officeDashJsLib.officeDashJsLibStrings.ThreeDEngrave
  ] = js.undefined
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}


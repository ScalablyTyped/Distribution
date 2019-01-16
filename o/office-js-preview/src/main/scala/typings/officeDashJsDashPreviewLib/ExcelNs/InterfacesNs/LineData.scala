package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "line.toJSON()". */
trait LineData extends js.Object {
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var connectorType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConnectorType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Straight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Elbow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Curve
  ] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}


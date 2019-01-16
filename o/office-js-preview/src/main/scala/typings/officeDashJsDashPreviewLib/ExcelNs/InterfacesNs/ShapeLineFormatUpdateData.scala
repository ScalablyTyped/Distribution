package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeLineFormat object, for use in "shapeLineFormat.set({ ... })". */
trait ShapeLineFormatUpdateData extends js.Object {
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the line style of the shape. Returns null when line is not visible or has mixed line dash style property (e.g. group type of shape). See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dashStyle: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LongDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LongDashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RoundDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SquareDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LongDashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SystemDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SystemDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SystemDashDot
  ] = js.undefined
  /**
    *
    * Represents the line style of the shape object. Returns null when line is not visible or has mixed line visible property (e.g. group type of shape). See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var style: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeLineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickBetweenThin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThickThin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThick | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThinThin
  ] = js.undefined
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has mixed line transparency property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var transparency: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents whether the line formatting of a shape element is visible. Returns null when the shape has mixed line visible property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents weight of the line, in points. Returns null when the line is not visible or has mixed line weight property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var weight: js.UndefOr[scala.Double] = js.undefined
}


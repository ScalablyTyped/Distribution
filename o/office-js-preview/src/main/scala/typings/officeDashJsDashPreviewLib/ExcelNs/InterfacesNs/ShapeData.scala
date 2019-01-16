package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shape.toJSON()". */
trait ShapeData extends js.Object {
  /**
    *
    * Returns or sets the alternative descriptive text string for a Shape object when the object is saved to a Web page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the alternative title text string for a Shape object when the object is saved to a Web page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns the fill formatting of the shape object. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var fill: js.UndefOr[ShapeFillData] = js.undefined
  /**
    *
    * Represents the geometric shape type of the specified shape. See Excel.GeometricShapeType for detail. Returns null if the shape is not geometric, for example, get GeometricShapeType of a line or a chart will return null.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var geometricShapeType: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 178 */ js.Any
  ] = js.undefined
  /**
    *
    * Represents the height, in points, of the shape.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The distance, in points, from the left side of the shape to the left of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the level of the specified shape. Level 0 means the shape is not part of any group, level 1 means the shape is part of a top-level group, etc.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the line formatting of the shape object. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lineFormat: js.UndefOr[ShapeLineFormatData] = js.undefined
  /**
    *
    * Represents if the aspect ratio locked, in boolean, of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the name of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the placment, value that represents the way the object is attached to the cells below it.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var placement: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.Placement | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OneCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Absolute
  ] = js.undefined
  /**
    *
    * Represents the rotation, in degrees, of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * The distance, in points, from the top edge of the shape to the top of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the type of the specified shape. Read-only. See Excel.ShapeType for detail.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Image | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GeometricShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Group | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Line
  ] = js.undefined
  /**
    *
    * Represents the visibility, in boolean, of the specified shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width, in points, of the shape.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the position of the specified shape in the z-order, the very bottom shape's z-order value is 0. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var zorderPosition: js.UndefOr[scala.Double] = js.undefined
}


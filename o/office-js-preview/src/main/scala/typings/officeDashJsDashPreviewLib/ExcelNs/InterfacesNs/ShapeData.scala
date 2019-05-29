package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shape.toJSON()". */
trait ShapeData extends js.Object {
  /**
    *
    * Returns or sets the alternative description text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the alternative title text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns the number of connection sites on this shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectionSiteCount: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the fill formatting of this shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[ShapeFillData] = js.undefined
  /**
    *
    * Represents the geometric shape type of this geometric shape. See Excel.GeometricShapeType for details. Returns null if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShapeType: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 179 */ js.Any
  ] = js.undefined
  /**
    *
    * Represents the height, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the level of the specified shape. For example, a level of 0 means that the shape is not part of any groups, a level of 1 means the shape is part of a top-level group, and a level of 2 means the shape is part of a sub-group of the top level.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the line formatting of this shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lineFormat: js.UndefOr[ShapeLineFormatData] = js.undefined
  /**
    *
    * Specifies whether or not the aspect ratio of this shape is locked.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the name of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents how the object is attached to the cells below it.
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
    * [Api set: ExcelApi 1.9]
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the type of this shape. See Excel.ShapeType for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unsupported | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Image | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GeometricShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Group | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Line
  ] = js.undefined
  /**
    *
    * Represents the visibility of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the position of the specified shape in the z-order, with 0 representing the bottom of the order stack. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var zOrderPosition: js.UndefOr[scala.Double] = js.undefined
}

object ShapeData {
  @scala.inline
  def apply(
    altTextDescription: java.lang.String = null,
    altTextTitle: java.lang.String = null,
    connectionSiteCount: scala.Int | scala.Double = null,
    fill: ShapeFillData = null,
    geometricShapeType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 179 */ js.Any = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    left: scala.Int | scala.Double = null,
    level: scala.Int | scala.Double = null,
    lineFormat: ShapeLineFormatData = null,
    lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    placement: officeDashJsDashPreviewLib.ExcelNs.Placement | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OneCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Absolute = null,
    rotation: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.ShapeType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unsupported | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Image | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GeometricShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Group | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Line = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    zOrderPosition: scala.Int | scala.Double = null
  ): ShapeData = {
    val __obj = js.Dynamic.literal()
    if (altTextDescription != null) __obj.updateDynamic("altTextDescription")(altTextDescription)
    if (altTextTitle != null) __obj.updateDynamic("altTextTitle")(altTextTitle)
    if (connectionSiteCount != null) __obj.updateDynamic("connectionSiteCount")(connectionSiteCount.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (geometricShapeType != null) __obj.updateDynamic("geometricShapeType")(geometricShapeType)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (lineFormat != null) __obj.updateDynamic("lineFormat")(lineFormat)
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio)
    if (name != null) __obj.updateDynamic("name")(name)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zOrderPosition != null) __obj.updateDynamic("zOrderPosition")(zOrderPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeData]
  }
}


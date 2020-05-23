package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.Placement
import typings.officeJs.Excel.ShapeType
import typings.officeJs.officeJsStrings.Absolute
import typings.officeJs.officeJsStrings.GeometricShape
import typings.officeJs.officeJsStrings.Group
import typings.officeJs.officeJsStrings.Image
import typings.officeJs.officeJsStrings.Line
import typings.officeJs.officeJsStrings.OneCell
import typings.officeJs.officeJsStrings.TwoCell
import typings.officeJs.officeJsStrings.Unsupported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `shape.toJSON()`. */
trait ShapeData extends js.Object {
  /**
    *
    * Specifies the alternative description text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the alternative title text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the number of connection sites on this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectionSiteCount: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns the fill formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[ShapeFillData] = js.undefined
  /**
    *
    * Specifies the geometric shape type of this geometric shape. See Excel.GeometricShapeType for details. Returns null if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShapeType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179 */ js.Any
  ] = js.undefined
  /**
    *
    * Specifies the height, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the level of the specified shape. For example, a level of 0 means that the shape is not part of any groups, a level of 1 means the shape is part of a top-level group, and a level of 2 means the shape is part of a sub-group of the top level.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns the line formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lineFormat: js.UndefOr[ShapeLineFormatData] = js.undefined
  /**
    *
    * Specifies if the aspect ratio of this shape is locked.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the name of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents how the object is attached to the cells below it.
    *
    * [Api set: ExcelApi 1.10]
    */
  var placement: js.UndefOr[Placement | TwoCell | OneCell | Absolute] = js.undefined
  /**
    *
    * Specifies the rotation, in degrees, of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    *
    * The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns the type of this shape. See Excel.ShapeType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ShapeType | Unsupported | Image | GeometricShape | Group | Line] = js.undefined
  /**
    *
    * Specifies if the shape is visible.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the width, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns the position of the specified shape in the z-order, with 0 representing the bottom of the order stack.
    *
    * [Api set: ExcelApi 1.9]
    */
  var zOrderPosition: js.UndefOr[Double] = js.undefined
}

object ShapeData {
  @scala.inline
  def apply(
    altTextDescription: String = null,
    altTextTitle: String = null,
    connectionSiteCount: js.UndefOr[Double] = js.undefined,
    fill: ShapeFillData = null,
    geometricShapeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179 */ js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    left: js.UndefOr[Double] = js.undefined,
    level: js.UndefOr[Double] = js.undefined,
    lineFormat: ShapeLineFormatData = null,
    lockAspectRatio: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    placement: Placement | TwoCell | OneCell | Absolute = null,
    rotation: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    `type`: ShapeType | Unsupported | Image | GeometricShape | Group | Line = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    zOrderPosition: js.UndefOr[Double] = js.undefined
  ): ShapeData = {
    val __obj = js.Dynamic.literal()
    if (altTextDescription != null) __obj.updateDynamic("altTextDescription")(altTextDescription.asInstanceOf[js.Any])
    if (altTextTitle != null) __obj.updateDynamic("altTextTitle")(altTextTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionSiteCount)) __obj.updateDynamic("connectionSiteCount")(connectionSiteCount.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (geometricShapeType != null) __obj.updateDynamic("geometricShapeType")(geometricShapeType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (lineFormat != null) __obj.updateDynamic("lineFormat")(lineFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zOrderPosition)) __obj.updateDynamic("zOrderPosition")(zOrderPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeData]
  }
}


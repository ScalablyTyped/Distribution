package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the shape collection inside a shape group.
  *
  * [Api set: ExcelApi 1.9]
  */
trait GroupShapeCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the alternative description text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the alternative title text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the number of connection sites on this shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectionSiteCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the fill formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[ShapeFillLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the geometric shape associated with the shape. An error will be thrown if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShape: js.UndefOr[GeometricShapeLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the geometric shape type of this geometric shape. See Excel.GeometricShapeType for details. Returns null if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShapeType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the shape group associated with the shape. An error will be thrown if the shape type is not "GroupShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var group: js.UndefOr[ShapeGroupLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the height, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the image associated with the shape. An error will be thrown if the shape type is not "Image".
    *
    * [Api set: ExcelApi 1.9]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the level of the specified shape. For example, a level of 0 means that the shape is not part of any groups, a level of 1 means the shape is part of a top-level group, and a level of 2 means the shape is part of a sub-group of the top level.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the line associated with the shape. An error will be thrown if the shape type is not "Line".
    *
    * [Api set: ExcelApi 1.9]
    */
  var line: js.UndefOr[LineLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the line formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lineFormat: js.UndefOr[ShapeLineFormatLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Specifies whether or not the aspect ratio of this shape is locked.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the name of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the parent group of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentGroup: js.UndefOr[ShapeLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents how the object is attached to the cells below it.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var placement: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the rotation, in degrees, of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rotation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the text frame object of this shape. Read only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textFrame: js.UndefOr[TextFrameLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the type of this shape. See Excel.ShapeType for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the visibility of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the width, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the position of the specified shape in the z-order, with 0 representing the bottom of the order stack. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var zOrderPosition: js.UndefOr[Boolean] = js.undefined
}

object GroupShapeCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    altTextDescription: js.UndefOr[Boolean] = js.undefined,
    altTextTitle: js.UndefOr[Boolean] = js.undefined,
    connectionSiteCount: js.UndefOr[Boolean] = js.undefined,
    fill: ShapeFillLoadOptions = null,
    geometricShape: GeometricShapeLoadOptions = null,
    geometricShapeType: js.UndefOr[Boolean] = js.undefined,
    group: ShapeGroupLoadOptions = null,
    height: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    image: ImageLoadOptions = null,
    left: js.UndefOr[Boolean] = js.undefined,
    level: js.UndefOr[Boolean] = js.undefined,
    line: LineLoadOptions = null,
    lineFormat: ShapeLineFormatLoadOptions = null,
    lockAspectRatio: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    parentGroup: ShapeLoadOptions = null,
    placement: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Boolean] = js.undefined,
    textFrame: TextFrameLoadOptions = null,
    top: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined,
    zOrderPosition: js.UndefOr[Boolean] = js.undefined
  ): GroupShapeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(altTextDescription)) __obj.updateDynamic("altTextDescription")(altTextDescription)
    if (!js.isUndefined(altTextTitle)) __obj.updateDynamic("altTextTitle")(altTextTitle)
    if (!js.isUndefined(connectionSiteCount)) __obj.updateDynamic("connectionSiteCount")(connectionSiteCount)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (geometricShape != null) __obj.updateDynamic("geometricShape")(geometricShape)
    if (!js.isUndefined(geometricShapeType)) __obj.updateDynamic("geometricShapeType")(geometricShapeType)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level)
    if (line != null) __obj.updateDynamic("line")(line)
    if (lineFormat != null) __obj.updateDynamic("lineFormat")(lineFormat)
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (parentGroup != null) __obj.updateDynamic("parentGroup")(parentGroup)
    if (!js.isUndefined(placement)) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation)
    if (textFrame != null) __obj.updateDynamic("textFrame")(textFrame)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    if (!js.isUndefined(zOrderPosition)) __obj.updateDynamic("zOrderPosition")(zOrderPosition)
    __obj.asInstanceOf[GroupShapeCollectionLoadOptions]
  }
}


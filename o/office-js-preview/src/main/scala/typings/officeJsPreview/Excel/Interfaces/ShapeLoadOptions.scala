package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a generic shape object in the worksheet. A shape could be a geometric shape, a line, a group of shapes, etc.
  To learn more about the shape object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-shapes | Work with shapes using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ShapeLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the alternative description text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the alternative title text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the number of connection sites on this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectionSiteCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the fill formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[ShapeFillLoadOptions] = js.undefined
  
  /**
    *
    * Returns the geometric shape associated with the shape. An error will be thrown if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShape: js.UndefOr[GeometricShapeLoadOptions] = js.undefined
  
  /**
    *
    * Specifies the geometric shape type of this geometric shape. See Excel.GeometricShapeType for details. Returns null if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var geometricShapeType: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the shape group associated with the shape. An error will be thrown if the shape type is not "GroupShape".
    *
    * [Api set: ExcelApi 1.9]
    */
  var group: js.UndefOr[ShapeGroupLoadOptions] = js.undefined
  
  /**
    *
    * Specifies the height, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the image associated with the shape. An error will be thrown if the shape type is not "Image".
    *
    * [Api set: ExcelApi 1.9]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.undefined
  
  /**
    *
    * The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the level of the specified shape. For example, a level of 0 means that the shape is not part of any groups, a level of 1 means the shape is part of a top-level group, and a level of 2 means the shape is part of a sub-group of the top level.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the line associated with the shape. An error will be thrown if the shape type is not "Line".
    *
    * [Api set: ExcelApi 1.9]
    */
  var line: js.UndefOr[LineLoadOptions] = js.undefined
  
  /**
    *
    * Returns the line formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lineFormat: js.UndefOr[ShapeLineFormatLoadOptions] = js.undefined
  
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
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the parent group of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentGroup: js.UndefOr[ShapeLoadOptions] = js.undefined
  
  /**
    *
    * Represents how the object is attached to the cells below it.
    *
    * [Api set: ExcelApi 1.10]
    */
  var placement: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the rotation, in degrees, of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rotation: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the text frame object of this shape. Read only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textFrame: js.UndefOr[TextFrameLoadOptions] = js.undefined
  
  /**
    *
    * The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the type of this shape. See Excel.ShapeType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
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
  var width: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the position of the specified shape in the z-order, with 0 representing the bottom of the order stack.
    *
    * [Api set: ExcelApi 1.9]
    */
  var zOrderPosition: js.UndefOr[Boolean] = js.undefined
}
object ShapeLoadOptions {
  
  @scala.inline
  def apply(): ShapeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeLoadOptions]
  }
  
  @scala.inline
  implicit class ShapeLoadOptionsMutableBuilder[Self <: ShapeLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAltTextDescription(value: Boolean): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    @scala.inline
    def setAltTextTitle(value: Boolean): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    @scala.inline
    def setConnectionSiteCount(value: Boolean): Self = StObject.set(x, "connectionSiteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSiteCountUndefined: Self = StObject.set(x, "connectionSiteCount", js.undefined)
    
    @scala.inline
    def setFill(value: ShapeFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGeometricShape(value: GeometricShapeLoadOptions): Self = StObject.set(x, "geometricShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometricShapeType(value: Boolean): Self = StObject.set(x, "geometricShapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometricShapeTypeUndefined: Self = StObject.set(x, "geometricShapeType", js.undefined)
    
    @scala.inline
    def setGeometricShapeUndefined: Self = StObject.set(x, "geometricShape", js.undefined)
    
    @scala.inline
    def setGroup(value: ShapeGroupLoadOptions): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: ImageLoadOptions): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLine(value: LineLoadOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineFormat(value: ShapeLineFormatLoadOptions): Self = StObject.set(x, "lineFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineFormatUndefined: Self = StObject.set(x, "lineFormat", js.undefined)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentGroup(value: ShapeLoadOptions): Self = StObject.set(x, "parentGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupUndefined: Self = StObject.set(x, "parentGroup", js.undefined)
    
    @scala.inline
    def setPlacement(value: Boolean): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setRotation(value: Boolean): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setTextFrame(value: TextFrameLoadOptions): Self = StObject.set(x, "textFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFrameUndefined: Self = StObject.set(x, "textFrame", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZOrderPosition(value: Boolean): Self = StObject.set(x, "zOrderPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZOrderPositionUndefined: Self = StObject.set(x, "zOrderPosition", js.undefined)
  }
}

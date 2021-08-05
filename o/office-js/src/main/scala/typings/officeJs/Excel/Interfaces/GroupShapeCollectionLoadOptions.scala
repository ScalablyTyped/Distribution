package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the shape collection inside a shape group.
  *
  * [Api set: ExcelApi 1.9]
  */
trait GroupShapeCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the alternative description text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the alternative title text for a Shape object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the number of connection sites on this shape.
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
    * For EACH ITEM in the collection: Specifies the geometric shape type of this geometric shape. See Excel.GeometricShapeType for details. Returns null if the shape type is not "GeometricShape".
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
    * For EACH ITEM in the collection: Specifies the height, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the shape identifier.
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
    * For EACH ITEM in the collection: Specifies the level of the specified shape. For example, a level of 0 means that the shape is not part of any groups, a level of 1 means the shape is part of a top-level group, and a level of 2 means the shape is part of a sub-group of the top level.
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
    * For EACH ITEM in the collection: Specifies if the aspect ratio of this shape is locked.
    *
    * [Api set: ExcelApi 1.9]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the name of the shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the parent group of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentGroup: js.UndefOr[ShapeLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents how the object is attached to the cells below it.
    *
    * [Api set: ExcelApi 1.10]
    */
  var placement: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the rotation, in degrees, of the shape.
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
    * For EACH ITEM in the collection: Returns the type of this shape. See Excel.ShapeType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the shape is visible.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the width, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the position of the specified shape in the z-order, with 0 representing the bottom of the order stack.
    *
    * [Api set: ExcelApi 1.9]
    */
  var zOrderPosition: js.UndefOr[Boolean] = js.undefined
}
object GroupShapeCollectionLoadOptions {
  
  inline def apply(): GroupShapeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupShapeCollectionLoadOptions]
  }
  
  extension [Self <: GroupShapeCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAltTextDescription(value: Boolean): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    inline def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    inline def setAltTextTitle(value: Boolean): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    inline def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    inline def setConnectionSiteCount(value: Boolean): Self = StObject.set(x, "connectionSiteCount", value.asInstanceOf[js.Any])
    
    inline def setConnectionSiteCountUndefined: Self = StObject.set(x, "connectionSiteCount", js.undefined)
    
    inline def setFill(value: ShapeFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setGeometricShape(value: GeometricShapeLoadOptions): Self = StObject.set(x, "geometricShape", value.asInstanceOf[js.Any])
    
    inline def setGeometricShapeType(value: Boolean): Self = StObject.set(x, "geometricShapeType", value.asInstanceOf[js.Any])
    
    inline def setGeometricShapeTypeUndefined: Self = StObject.set(x, "geometricShapeType", js.undefined)
    
    inline def setGeometricShapeUndefined: Self = StObject.set(x, "geometricShape", js.undefined)
    
    inline def setGroup(value: ShapeGroupLoadOptions): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: ImageLoadOptions): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLine(value: LineLoadOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineFormat(value: ShapeLineFormatLoadOptions): Self = StObject.set(x, "lineFormat", value.asInstanceOf[js.Any])
    
    inline def setLineFormatUndefined: Self = StObject.set(x, "lineFormat", js.undefined)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentGroup(value: ShapeLoadOptions): Self = StObject.set(x, "parentGroup", value.asInstanceOf[js.Any])
    
    inline def setParentGroupUndefined: Self = StObject.set(x, "parentGroup", js.undefined)
    
    inline def setPlacement(value: Boolean): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRotation(value: Boolean): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setTextFrame(value: TextFrameLoadOptions): Self = StObject.set(x, "textFrame", value.asInstanceOf[js.Any])
    
    inline def setTextFrameUndefined: Self = StObject.set(x, "textFrame", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZOrderPosition(value: Boolean): Self = StObject.set(x, "zOrderPosition", value.asInstanceOf[js.Any])
    
    inline def setZOrderPositionUndefined: Self = StObject.set(x, "zOrderPosition", js.undefined)
  }
}

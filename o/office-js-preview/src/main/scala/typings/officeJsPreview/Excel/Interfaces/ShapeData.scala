package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.Placement
import typings.officeJsPreview.Excel.ShapeType
import typings.officeJsPreview.officeJsPreviewStrings.Absolute
import typings.officeJsPreview.officeJsPreviewStrings.GeometricShape
import typings.officeJsPreview.officeJsPreviewStrings.Group
import typings.officeJsPreview.officeJsPreviewStrings.Image
import typings.officeJsPreview.officeJsPreviewStrings.Line
import typings.officeJsPreview.officeJsPreviewStrings.OneCell
import typings.officeJsPreview.officeJsPreviewStrings.TwoCell
import typings.officeJsPreview.officeJsPreviewStrings.Unsupported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `shape.toJSON()`. */
trait ShapeData extends StObject {
  
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
  def apply(): ShapeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeData]
  }
  
  @scala.inline
  implicit class ShapeDataMutableBuilder[Self <: ShapeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltTextDescription(value: String): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    @scala.inline
    def setAltTextTitle(value: String): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    @scala.inline
    def setConnectionSiteCount(value: Double): Self = StObject.set(x, "connectionSiteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSiteCountUndefined: Self = StObject.set(x, "connectionSiteCount", js.undefined)
    
    @scala.inline
    def setFill(value: ShapeFillData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGeometricShapeType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179 */ js.Any): Self = StObject.set(x, "geometricShapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometricShapeTypeUndefined: Self = StObject.set(x, "geometricShapeType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLineFormat(value: ShapeLineFormatData): Self = StObject.set(x, "lineFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineFormatUndefined: Self = StObject.set(x, "lineFormat", js.undefined)
    
    @scala.inline
    def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement | TwoCell | OneCell | Absolute): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setType(value: ShapeType | Unsupported | Image | GeometricShape | Group | Line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZOrderPosition(value: Double): Self = StObject.set(x, "zOrderPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZOrderPositionUndefined: Self = StObject.set(x, "zOrderPosition", js.undefined)
  }
}

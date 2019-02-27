package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a generic shape object in the worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.Shape")
@js.native
class Shape ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Returns or sets the alternative descriptive text string for a Shape object when the object is saved to a Web page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextDescription: java.lang.String = js.native
  /**
    *
    * Returns or sets the alternative title text string for a Shape object when the object is saved to a Web page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextTitle: java.lang.String = js.native
  /**
    *
    * Returns the number of connection sites on the specified shape. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val connectionSiteCount: scala.Double = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Shape: RequestContext = js.native
  /**
    *
    * Returns the fill formatting of the shape object. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val fill: ShapeFill = js.native
  /**
    *
    * Returns the geometric shape for the shape object. Error will be thrown, if the shape object is other shape type (Like, Image, SmartArt, etc.) rather than GeometricShape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val geometricShape: GeometricShape = js.native
  /**
    *
    * Represents the geometric shape type of the specified shape. See Excel.GeometricShapeType for detail. Returns null if the shape is not geometric, for example, get GeometricShapeType of a line or a chart will return null.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var geometricShapeType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 178 */ js.Any = js.native
  /**
    *
    * Returns the shape group for the shape object. Error will be thrown, if the shape object is other shape type (Like, Image, SmartArt, etc.) rather than GroupShape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val group: ShapeGroup = js.native
  /**
    *
    * Represents the height, in points, of the shape.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var height: scala.Double = js.native
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val id: java.lang.String = js.native
  /**
    *
    * Returns the image for the shape object. Error will be thrown, if the shape object is other shape type (Like, GeometricShape, SmartArt, etc.) rather than Image.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val image: Image = js.native
  /**
    *
    * The distance, in points, from the left side of the shape to the left of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var left: scala.Double = js.native
  /**
    *
    * Represents the level of the specified shape. Level 0 means the shape is not part of any group, level 1 means the shape is part of a top-level group, etc.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val level: scala.Double = js.native
  /**
    *
    * Returns the line object for the shape object. Error will be thrown, if the shape object is other shape type (Like, GeometricShape, SmartArt, etc.) rather than Image.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val line: Line = js.native
  /**
    *
    * Returns the line formatting of the shape object. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val lineFormat: ShapeLineFormat = js.native
  /**
    *
    * Represents if the aspect ratio locked, in boolean, of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lockAspectRatio: scala.Boolean = js.native
  /**
    *
    * Represents the name of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: java.lang.String = js.native
  /**
    *
    * Occurs when the shape is activated.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onActivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ShapeActivatedEventArgs] = js.native
  /**
    *
    * Occurs when the shape is activated.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onDeactivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ShapeDeactivatedEventArgs] = js.native
  /**
    *
    * Represents the parent group of the specified shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentGroup: Shape = js.native
  /**
    *
    * Represents the placment, value that represents the way the object is attached to the cells below it.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var placement: Placement | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OneCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Absolute = js.native
  /**
    *
    * Represents the rotation, in degrees, of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rotation: scala.Double = js.native
  /**
    *
    * Returns the textFrame object of a shape. Read only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val textFrame: TextFrame = js.native
  /**
    *
    * The distance, in points, from the top edge of the shape to the top of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var top: scala.Double = js.native
  /**
    *
    * Returns the type of the specified shape. Read-only. See Excel.ShapeType for detail.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val `type`: ShapeType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Image | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GeometricShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Group | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Line = js.native
  /**
    *
    * Represents the visibility, in boolean, of the specified shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visible: scala.Boolean = js.native
  /**
    *
    * Represents the width, in points, of the shape.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var width: scala.Double = js.native
  /**
    *
    * Returns the position of the specified shape in the z-order, the very bottom shape's z-order value is 0. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val zorderPosition: scala.Double = js.native
  /**
    *
    * Deletes the Shape
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Moves the shape horizontally by the specified number of points.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param increment Specifies how far the shape is to be moved horizontally, in points. A positive value moves the shape to the right; a negative value moves it to the left. If the sheet is RTL, IncrementLeft with a positive value should move the shape to the left instead of right.
    */
  def incrementLeft(increment: scala.Double): scala.Unit = js.native
  /**
    *
    * Changes the rotation of the shape around the z-axis by the specified number of degrees.
    Use the Rotation property to set the absolute rotation of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param increment Specifies how far the shape is to be rotated horizontally, in degrees. A positive value rotates the shape clockwise; a negative value rotates it counterclockwise.
    */
  def incrementRotation(increment: scala.Double): scala.Unit = js.native
  /**
    *
    * Moves the shape vertically by the specified number of points.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param increment Specifies how far the shape is to be moved vertically, in points. A positive value moves the shape down; a negative value moves it up.
    */
  def incrementTop(increment: scala.Double): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Shape` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Shape` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Shape` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Shape = js.native
  def load(option: java.lang.String): Shape = js.native
  def load(option: js.Array[java.lang.String]): Shape = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Shape = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeLoadOptions): Shape = js.native
  /**
    *
    * Saves the shape as a picture and returns the picture in the form of base64 encoded string, using the DPI sets to 96. Only support saves as to Excel.PictureFormat.BMP, Excel.PictureFormat.PNG, Excel.PictureFormat.JPEG and Excel.PictureFormat.GIF.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def saveAsPicture(format: PictureFormat): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("saveAsPicture")
  def saveAsPicture_BMP(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BMP): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("saveAsPicture")
  def saveAsPicture_GIF(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GIF): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("saveAsPicture")
  def saveAsPicture_JPEG(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JPEG): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("saveAsPicture")
  def saveAsPicture_PNG(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PNG): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("saveAsPicture")
  def saveAsPicture_SVG(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SVG): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Saves the shape as a picture and returns the picture in the form of base64 encoded string, using the DPI sets to 96. Only support saves as to Excel.PictureFormat.BMP, Excel.PictureFormat.PNG, Excel.PictureFormat.JPEG and Excel.PictureFormat.GIF.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @JSName("saveAsPicture")
  def saveAsPicture_UNKNOWN(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.UNKNOWN): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Scales the height of the shape by a specified factor. For pictures, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current height.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param scaleFactor Specifies the ratio between the height of the shape after you resize it and the current or original height.
    * @param scaleType OriginalSize to scale the shape relative to its original size. CurrentSize to scale it relative to its current size. You can specify OriginalSize for this argument only if the specified shape is a picture.
    * @param scaleFrom Optional. One of the constants of ShapeScaleFrom which specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
    */
  def scaleHeight(scaleFactor: scala.Double, scaleType: ShapeScaleType): scala.Unit = js.native
  def scaleHeight(scaleFactor: scala.Double, scaleType: ShapeScaleType, scaleFrom: ShapeScaleFrom): scala.Unit = js.native
  def scaleHeight(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CurrentSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromBottomRight
  ): scala.Unit = js.native
  def scaleHeight(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CurrentSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromMiddle
  ): scala.Unit = js.native
  def scaleHeight(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CurrentSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromTopLeft
  ): scala.Unit = js.native
  def scaleHeight(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OriginalSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromBottomRight
  ): scala.Unit = js.native
  def scaleHeight(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OriginalSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromMiddle
  ): scala.Unit = js.native
  def scaleHeight(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OriginalSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromTopLeft
  ): scala.Unit = js.native
  /**
    *
    * Scales the height of the shape by a specified factor. For pictures, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current height.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param scaleFactor Specifies the ratio between the height of the shape after you resize it and the current or original height.
    * @param scaleType OriginalSize to scale the shape relative to its original size. CurrentSize to scale it relative to its current size. You can specify OriginalSize for this argument only if the specified shape is a picture.
    * @param scaleFrom Optional. One of the constants of ShapeScaleFrom which specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
    */
  @JSName("scaleHeight")
  def scaleHeight_CurrentSize(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CurrentSize
  ): scala.Unit = js.native
  @JSName("scaleHeight")
  def scaleHeight_OriginalSize(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OriginalSize
  ): scala.Unit = js.native
  /**
    *
    * Scales the width of the shape by a specified factor. For pictures, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current width.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param scaleFactor Specifies the ratio between the width of the shape after you resize it and the current or original width.
    * @param scaleType OriginalSize to scale the shape relative to its original size. CurrentSize to scale it relative to its current size. You can specify OriginalSize for this argument only if the specified shape is a picture.
    * @param scaleFrom Optional. One of the constants of ShapeScaleFrom which specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
    */
  def scaleWidth(scaleFactor: scala.Double, scaleType: ShapeScaleType): scala.Unit = js.native
  def scaleWidth(scaleFactor: scala.Double, scaleType: ShapeScaleType, scaleFrom: ShapeScaleFrom): scala.Unit = js.native
  def scaleWidth(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CurrentSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromBottomRight
  ): scala.Unit = js.native
  def scaleWidth(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CurrentSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromMiddle
  ): scala.Unit = js.native
  def scaleWidth(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CurrentSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromTopLeft
  ): scala.Unit = js.native
  def scaleWidth(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OriginalSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromBottomRight
  ): scala.Unit = js.native
  def scaleWidth(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OriginalSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromMiddle
  ): scala.Unit = js.native
  def scaleWidth(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OriginalSize,
    scaleFrom: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ScaleFromTopLeft
  ): scala.Unit = js.native
  /**
    *
    * Scales the width of the shape by a specified factor. For pictures, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current width.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param scaleFactor Specifies the ratio between the width of the shape after you resize it and the current or original width.
    * @param scaleType OriginalSize to scale the shape relative to its original size. CurrentSize to scale it relative to its current size. You can specify OriginalSize for this argument only if the specified shape is a picture.
    * @param scaleFrom Optional. One of the constants of ShapeScaleFrom which specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
    */
  @JSName("scaleWidth")
  def scaleWidth_CurrentSize(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CurrentSize
  ): scala.Unit = js.native
  @JSName("scaleWidth")
  def scaleWidth_OriginalSize(
    scaleFactor: scala.Double,
    scaleType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OriginalSize
  ): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Shape): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Shape): scala.Unit = js.native
  /**
    *
    * Moves the specified shape in front of or behind other shapes in the collection (that is, changes the shape's position in the z-order).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param value where to move the specified shape relative to the other shapes. See Excel.ShapeZOrder for detail.
    */
  def setZOrder(value: ShapeZOrder): scala.Unit = js.native
  @JSName("setZOrder")
  def setZOrder_BringForward(value: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BringForward): scala.Unit = js.native
  /**
    *
    * Moves the specified shape in front of or behind other shapes in the collection (that is, changes the shape's position in the z-order).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param value where to move the specified shape relative to the other shapes. See Excel.ShapeZOrder for detail.
    */
  @JSName("setZOrder")
  def setZOrder_BringToFront(value: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BringToFront): scala.Unit = js.native
  @JSName("setZOrder")
  def setZOrder_SendBackward(value: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SendBackward): scala.Unit = js.native
  @JSName("setZOrder")
  def setZOrder_SendToBack(value: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SendToBack): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Shape object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeData = js.native
}


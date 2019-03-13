package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a generic shape object in the worksheet. A shape could be a geometric shape, a line, a group of shapes, etc.
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
    * Returns or sets the alternative description text for a Shape object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextDescription: java.lang.String = js.native
  /**
    *
    * Returns or sets the alternative title text for a Shape object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextTitle: java.lang.String = js.native
  /**
    *
    * Returns the number of connection sites on this shape. Read-only.
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
    * Returns the fill formatting of this shape. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val fill: ShapeFill = js.native
  /**
    *
    * Returns the geometric shape associated with the shape. An error will be thrown if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val geometricShape: GeometricShape = js.native
  /**
    *
    * Represents the geometric shape type of this geometric shape. See Excel.GeometricShapeType for details. Returns null if the shape type is not "GeometricShape".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var geometricShapeType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 178 */ js.Any = js.native
  /**
    *
    * Returns the shape group associated with the shape. An error will be thrown if the shape type is not "GroupShape".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val group: ShapeGroup = js.native
  /**
    *
    * Represents the height, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
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
    * Returns the image associated with the shape. An error will be thrown if the shape type is not "Image".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val image: Image = js.native
  /**
    *
    * The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var left: scala.Double = js.native
  /**
    *
    * Represents the level of the specified shape. For example, a level of 0 means that the shape is not part of any groups, a level of 1 means the shape is part of a top-level group, and a level of 2 means the shape is part of a sub-group of the top level.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val level: scala.Double = js.native
  /**
    *
    * Returns the line associated with the shape. An error will be thrown if the shape type is not "Line".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val line: Line = js.native
  /**
    *
    * Returns the line formatting of this shape. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val lineFormat: ShapeLineFormat = js.native
  /**
    *
    * Specifies whether or not the aspect ratio of this shape is locked.
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
    * Occurs when the shape is deactivated.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onDeactivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ShapeDeactivatedEventArgs] = js.native
  /**
    *
    * Represents the parent group of this shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val parentGroup: Shape = js.native
  /**
    *
    * Represents how the object is attached to the cells below it.
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
    * Returns the text frame object of this shape. Read only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val textFrame: TextFrame = js.native
  /**
    *
    * The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an invalid argument exception when set with a negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var top: scala.Double = js.native
  /**
    *
    * Returns the type of this shape. See Excel.ShapeType for details. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val `type`: ShapeType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unsupported | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Image | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GeometricShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Group | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Line = js.native
  /**
    *
    * Represents the visibility of this shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visible: scala.Boolean = js.native
  /**
    *
    * Represents the width, in points, of the shape.
    Throws an invalid argument exception when set with a negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var width: scala.Double = js.native
  /**
    *
    * Returns the position of the specified shape in the z-order, with 0 representing the bottom of the order stack. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val zorderPosition: scala.Double = js.native
  /**
    *
    * Removes the shape from the worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Converts the shape to an image and returns the image as a base64-encoded string. The DPI is 96. The only supported formats are `Excel.PictureFormat.BMP`, `Excel.PictureFormat.PNG`, `Excel.PictureFormat.JPEG`, and `Excel.PictureFormat.GIF`.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param format Specifies the format of the image.
    */
  def getAsImage(format: PictureFormat): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("getAsImage")
  def getAsImage_BMP(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BMP): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("getAsImage")
  def getAsImage_GIF(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GIF): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("getAsImage")
  def getAsImage_JPEG(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JPEG): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("getAsImage")
  def getAsImage_PNG(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PNG): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("getAsImage")
  def getAsImage_SVG(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SVG): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Converts the shape to an image and returns the image as a base64-encoded string. The DPI is 96. The only supported formats are `Excel.PictureFormat.BMP`, `Excel.PictureFormat.PNG`, `Excel.PictureFormat.JPEG`, and `Excel.PictureFormat.GIF`.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param format Specifies the format of the image.
    */
  @JSName("getAsImage")
  def getAsImage_UNKNOWN(format: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.UNKNOWN): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Moves the shape horizontally by the specified number of points.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param increment The increment, in points, the shape will be horizontally moved. A positive value moves the shape to the right and a negative value moves it to the left. If the sheet is right-to-left oriented, this is reversed: positive values will move the shape to the left and negative values will move it to the right.
    */
  def incrementLeft(increment: scala.Double): scala.Unit = js.native
  /**
    *
    * Rotates the shape clockwise around the z-axis by the specified number of degrees.
    Use the `rotation` property to set the absolute rotation of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param increment How many degrees the shape will be rotated. A positive value rotates the shape clockwise; a negative value rotates it counterclockwise.
    */
  def incrementRotation(increment: scala.Double): scala.Unit = js.native
  /**
    *
    * Moves the shape vertically by the specified number of points.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param increment The increment, in points, the shape will be vertically moved. in points. A positive value moves the shape down and a negative value moves it up.
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
    * Scales the height of the shape by a specified factor. For images, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current height.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param scaleFactor Specifies the ratio between the height of the shape after you resize it and the current or original height.
    * @param scaleType Specifies whether the shape is scaled relative to its original or current size. The original size scaling option only works for images.
    * @param scaleFrom Optional. Specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
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
    * Scales the height of the shape by a specified factor. For images, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current height.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param scaleFactor Specifies the ratio between the height of the shape after you resize it and the current or original height.
    * @param scaleType Specifies whether the shape is scaled relative to its original or current size. The original size scaling option only works for images.
    * @param scaleFrom Optional. Specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
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
    * Scales the width of the shape by a specified factor. For images, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current width.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param scaleFactor Specifies the ratio between the width of the shape after you resize it and the current or original width.
    * @param scaleType Specifies whether the shape is scaled relative to its original or current size. The original size scaling option only works for images.
    * @param scaleFrom Optional. Specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
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
    * Scales the width of the shape by a specified factor. For images, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current width.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param scaleFactor Specifies the ratio between the width of the shape after you resize it and the current or original width.
    * @param scaleType Specifies whether the shape is scaled relative to its original or current size. The original size scaling option only works for images.
    * @param scaleFrom Optional. Specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
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
    * Moves the specified shape up or down the collection's z-order, which shifts it in front of or behind other shapes.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param position Where to move the shape in the z-order stack relative to the other shapes. See Excel.ShapeZOrder for details.
    */
  def setZOrder(position: ShapeZOrder): scala.Unit = js.native
  @JSName("setZOrder")
  def setZOrder_BringForward(position: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BringForward): scala.Unit = js.native
  /**
    *
    * Moves the specified shape up or down the collection's z-order, which shifts it in front of or behind other shapes.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param position Where to move the shape in the z-order stack relative to the other shapes. See Excel.ShapeZOrder for details.
    */
  @JSName("setZOrder")
  def setZOrder_BringToFront(position: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BringToFront): scala.Unit = js.native
  @JSName("setZOrder")
  def setZOrder_SendBackward(position: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SendBackward): scala.Unit = js.native
  @JSName("setZOrder")
  def setZOrder_SendToBack(position: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SendToBack): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Shape object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeData = js.native
}


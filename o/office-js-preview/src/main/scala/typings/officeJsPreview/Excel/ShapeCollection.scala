package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ShapeCollectionData
import typings.officeJsPreview.Excel.Interfaces.ShapeCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.officeJsPreviewStrings.Curve
import typings.officeJsPreview.officeJsPreviewStrings.Elbow
import typings.officeJsPreview.officeJsPreviewStrings.Straight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the shapes in the worksheet.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeCollection extends ClientObject {
  
  /**
    * Adds a geometric shape to the worksheet. Returns a Shape object that represents the new shape.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param geometricShapeType Represents the type of the geometric shape. See Excel.GeometricShapeType for details.
    */
  def addGeometricShape(
    geometricShapeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ): Shape = js.native
  /**
    * Adds a geometric shape to the worksheet. Returns a Shape object that represents the new shape.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param geometricShapeType Represents the type of the geometric shape. See Excel.GeometricShapeType for details.
    */
  def addGeometricShape(geometricShapeType: GeometricShapeType): Shape = js.native
  
  /**
    * Groups a subset of shapes in this collection's worksheet. Returns a Shape object that represents the new group of shapes.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param values An array of shape ID or shape objects.
    */
  def addGroup(values: js.Array[String | Shape]): Shape = js.native
  
  /**
    * Creates an image from a base64-encoded string and adds it to the worksheet. Returns the Shape object that represents the new image.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param base64ImageString A base64-encoded string representing an image in either JPEG or PNG format.
    */
  def addImage(base64ImageString: String): Shape = js.native
  
  /**
    * Adds a line to worksheet. Returns a Shape object that represents the new line.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param startLeft The distance, in points, from the start of the line to the left side of the worksheet.
    * @param startTop The distance, in points, from the start of the line to the top of the worksheet.
    * @param endLeft The distance, in points, from the end of the line to the left of the worksheet.
    * @param endTop The distance, in points, from the end of the line to the top of the worksheet.
    * @param connectorType Represents the connector type. See Excel.ConnectorType for details.
    */
  def addLine(startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): Shape = js.native
  def addLine(startLeft: Double, startTop: Double, endLeft: Double, endTop: Double, connectorType: ConnectorType): Shape = js.native
  @JSName("addLine")
  def addLine_Curve(startLeft: Double, startTop: Double, endLeft: Double, endTop: Double, connectorType: Curve): Shape = js.native
  @JSName("addLine")
  def addLine_Elbow(startLeft: Double, startTop: Double, endLeft: Double, endTop: Double, connectorType: Elbow): Shape = js.native
  @JSName("addLine")
  def addLine_Straight(startLeft: Double, startTop: Double, endLeft: Double, endTop: Double, connectorType: Straight): Shape = js.native
  
  /**
    * Creates a scalable vector graphic (SVG) from an XML string and adds it to the worksheet. Returns a Shape object that represents the new image.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param xml An XML string that represents the SVG.
    */
  def addSvg(xml: String): Shape = js.native
  
  /**
    * Adds a text box to the worksheet with the provided text as the content. Returns a Shape object that represents the new text box.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text Represents the text that will be shown in the created text box.
    */
  def addTextBox(): Shape = js.native
  def addTextBox(text: String): Shape = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeCollection: RequestContext = js.native
  
  /**
    * Returns the number of shapes in the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a shape using its Name or ID.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param key Name or ID of the shape to be retrieved.
    */
  def getItem(key: String): Shape = js.native
  
  /**
    * Gets a shape using its position in the collection.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index The zero-based index of the shape to be retrieved.
    */
  def getItemAt(index: Double): Shape = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeCollection = js.native
  def load(options: ShapeCollectionLoadOptions with CollectionLoadOptions): ShapeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ShapeCollection = js.native
  def load(propertyNames: String): ShapeCollection = js.native
  def load(propertyNames: js.Array[String]): ShapeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ShapeCollectionData = js.native
}

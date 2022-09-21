package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.ShapeCollectionData
import typings.officeJs.Excel.Interfaces.ShapeCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.officeJsStrings.Curve
import typings.officeJs.officeJsStrings.Elbow
import typings.officeJs.officeJsStrings.Straight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the shapes in the worksheet.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a geometric shape to the worksheet. Returns a `Shape` object that represents the new shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param geometricShapeType Represents the type of the geometric shape. See `Excel.GeometricShapeType` for details.
    */
  def addGeometricShape(
    geometricShapeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ Any
  ): Shape = js.native
  /**
    * Adds a geometric shape to the worksheet. Returns a `Shape` object that represents the new shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param geometricShapeType Represents the type of the geometric shape. See `Excel.GeometricShapeType` for details.
    */
  def addGeometricShape(geometricShapeType: GeometricShapeType): Shape = js.native
  
  /**
    * Groups a subset of shapes in this collection's worksheet. Returns a `Shape` object that represents the new group of shapes.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param values An array of shape IDs or shape objects.
    */
  def addGroup(values: js.Array[String | Shape]): Shape = js.native
  
  /**
    * Creates an image from a base64-encoded string and adds it to the worksheet. Returns the `Shape` object that represents the new image.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param base64ImageString A base64-encoded string representing an image in either JPEG or PNG format.
    */
  def addImage(base64ImageString: String): Shape = js.native
  
  /**
    * Adds a line to worksheet. Returns a `Shape` object that represents the new line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param startLeft The distance, in points, from the start of the line to the left side of the worksheet.
    * @param startTop The distance, in points, from the start of the line to the top of the worksheet.
    * @param endLeft The distance, in points, from the end of the line to the left of the worksheet.
    * @param endTop The distance, in points, from the end of the line to the top of the worksheet.
    * @param connectorType Represents the connector type. See `Excel.ConnectorType` for details.
    */
  def addLine(startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): Shape = js.native
  def addLine(
    startLeft: Double,
    startTop: Double,
    endLeft: Double,
    endTop: Double,
    connectorType: Straight | Elbow | Curve
  ): Shape = js.native
  def addLine(startLeft: Double, startTop: Double, endLeft: Double, endTop: Double, connectorType: ConnectorType): Shape = js.native
  
  /**
    * Adds a text box to the worksheet with the provided text as the content. Returns a `Shape` object that represents the new text box.
    *
    * @remarks
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
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a shape using its name or ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param key The name or ID of the shape to be retrieved.
    */
  def getItem(key: String): Shape = js.native
  
  /**
    * Gets a shape using its position in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param index The zero-based index of the shape to be retrieved.
    */
  def getItemAt(index: Double): Shape = js.native
  
  /**
    * Gets a shape using its name or ID.
    If the shape object does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties  | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    *
    * @param key The name or ID of the shape to be retrieved.
    */
  def getItemOrNullObject(key: String): Shape = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeCollection = js.native
  def load(options: ShapeCollectionLoadOptions & CollectionLoadOptions): ShapeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ShapeCollection = js.native
  def load(propertyNames: String): ShapeCollection = js.native
  def load(propertyNames: js.Array[String]): ShapeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ShapeCollectionData = js.native
}

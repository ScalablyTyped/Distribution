package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.PowerPoint.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.PowerPoint.Interfaces.ShapeCollectionData
import typings.officeJsPreview.PowerPoint.Interfaces.ShapeCollectionLoadOptions
import typings.officeJsPreview.officeJsPreviewStrings.Curve
import typings.officeJsPreview.officeJsPreviewStrings.Elbow
import typings.officeJsPreview.officeJsPreviewStrings.Straight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of shapes.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
@js.native
trait ShapeCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a geometric shape to the slide. Returns a `Shape` object that represents the new shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    *
    * @param geometricShapeType Specifies the type of the geometric shape. See {@link PowerPoint.GeometricShapeType} for details.
    * @param options An optional parameter to specify the additional options such as the position of the shape.
    * @returns The newly inserted shape.
    */
  def addGeometricShape(
    geometricShapeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.officeJsPreview.officeJsPreviewStrings.LineInverse, typings.officeJsPreview.officeJsPreviewStrings.Triangle, typings.officeJsPreview.officeJsPreviewStrings.RightTriangle */ Any
  ): Shape = js.native
  def addGeometricShape(
    geometricShapeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.officeJsPreview.officeJsPreviewStrings.LineInverse, typings.officeJsPreview.officeJsPreviewStrings.Triangle, typings.officeJsPreview.officeJsPreviewStrings.RightTriangle */ Any,
    options: ShapeAddOptions
  ): Shape = js.native
  /**
    * Adds a geometric shape to the slide. Returns a `Shape` object that represents the new shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    *
    * @param geometricShapeType Specifies the type of the geometric shape. See {@link PowerPoint.GeometricShapeType} for details.
    * @param options An optional parameter to specify the additional options such as the position of the shape.
    * @returns The newly inserted shape.
    */
  def addGeometricShape(geometricShapeType: GeometricShapeType): Shape = js.native
  def addGeometricShape(geometricShapeType: GeometricShapeType, options: ShapeAddOptions): Shape = js.native
  
  /**
    * Adds a line to the slide. Returns a `Shape` object that represents the new line.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    *
    * @param connectorType Specifies the connector type of the line. If not provided, `straight` connector type will be used. See {@link PowerPoint.ConnectorType} for details.
    * @param options An optional parameter to specify the additional options such as the position of the shape object that contains the line.
    * @returns The newly inserted shape.
    */
  def addLine(): Shape = js.native
  def addLine(connectorType: Straight | Elbow | Curve): Shape = js.native
  def addLine(connectorType: Straight | Elbow | Curve, options: ShapeAddOptions): Shape = js.native
  def addLine(connectorType: Unit, options: ShapeAddOptions): Shape = js.native
  def addLine(connectorType: ConnectorType): Shape = js.native
  def addLine(connectorType: ConnectorType, options: ShapeAddOptions): Shape = js.native
  
  /**
    * Adds a text box to the slide with the provided text as the content. Returns a `Shape` object that represents the new text box.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    *
    * @param text Specifies the text that will be shown in the created text box.
    * @param options An optional parameter to specify the additional options such as the position of the text box.
    * @returns The newly inserted shape.
    */
  def addTextBox(text: String): Shape = js.native
  def addTextBox(text: String, options: ShapeAddOptions): Shape = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeCollection: RequestContext = js.native
  
  /**
    * Gets the number of shapes in the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    * @returns The number of shapes in the collection.
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a shape using its unique ID. An error is thrown if the shape does not exist.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param key The ID of the shape.
    * @returns The shape with the unique ID. If such a shape does not exist, an error is thrown.
    */
  def getItem(key: String): Shape = js.native
  
  /**
    * Gets a shape using its zero-based index in the collection. An error is thrown if the index is out of range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param index The index of the shape in the collection.
    * @returns The shape at the given index. An error is thrown if index is out of range.
    */
  def getItemAt(index: Double): Shape = js.native
  
  /**
    * Gets a shape using its unique ID. If such a shape does not exist, an object with an `isNullObject` property set to true is returned.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param id The ID of the shape.
    * @returns The shape with the unique ID. If such a shape does not exist, an object with an `isNullObject` property set to true is returned.
    */
  def getItemOrNullObject(id: String): Shape = js.native
  
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
    * Whereas the original `PowerPoint.ShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ShapeCollectionData = js.native
}

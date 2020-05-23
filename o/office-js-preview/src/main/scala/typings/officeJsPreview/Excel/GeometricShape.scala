package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.GeometricShapeData
import typings.officeJsPreview.Excel.Interfaces.GeometricShapeLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a geometric shape inside a worksheet. A geometric shape can be a rectangle, block arrow, equation symbol, flowchart item, star, banner, callout, or any other basic shape in Excel.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait GeometricShape extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_GeometricShape: RequestContext = js.native
  /**
    *
    * Returns the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  val id: String = js.native
  /**
    *
    * Returns the Shape object for the geometric shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  val shape: Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): GeometricShape = js.native
  def load(options: GeometricShapeLoadOptions): GeometricShape = js.native
  def load(propertyNamesAndPaths: Expand): GeometricShape = js.native
  def load(propertyNames: String): GeometricShape = js.native
  def load(propertyNames: js.Array[String]): GeometricShape = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.GeometricShape object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.GeometricShapeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): GeometricShapeData = js.native
}


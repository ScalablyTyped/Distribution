package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ShapeFillData
import typings.officeJs.Excel.Interfaces.ShapeFillLoadOptions
import typings.officeJs.Excel.Interfaces.ShapeFillUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Gradient
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.NoFill
import typings.officeJs.officeJsStrings.Pattern
import typings.officeJs.officeJsStrings.PictureAndTexture
import typings.officeJs.officeJsStrings.Solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the fill formatting of a shape object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeFill extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeFill: RequestContext = js.native
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.9]
    */
  var foregroundColor: String = js.native
  /**
    *
    * Specifies the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: Double = js.native
  /**
    *
    * Returns the fill type of the shape. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  val `type`: ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed = js.native
  /**
    * Clears the fill formatting of this shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  def clear(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeFill = js.native
  def load(options: ShapeFillLoadOptions): ShapeFill = js.native
  def load(propertyNamesAndPaths: Expand): ShapeFill = js.native
  def load(propertyNames: String): ShapeFill = js.native
  def load(propertyNames: js.Array[String]): ShapeFill = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ShapeFill): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ShapeFillUpdateData): Unit = js.native
  def set(properties: ShapeFillUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeFill): Unit = js.native
  /**
    * Sets the fill formatting of the shape to a uniform color. This changes the fill type to "Solid".
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param color A string that represents the fill color in HTML color format, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    */
  def setSolidColor(color: String): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ShapeFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeFillData = js.native
}


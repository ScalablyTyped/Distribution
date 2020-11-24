package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ColorScaleConditionalFormatData
import typings.officeJsPreview.Excel.Interfaces.ColorScaleConditionalFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ColorScaleConditionalFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents ColorScale criteria for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ColorScaleConditionalFormat extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ColorScaleConditionalFormat: RequestContext = js.native
  
  /**
    *
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: ConditionalColorScaleCriteria = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ColorScaleConditionalFormat = js.native
  def load(options: ColorScaleConditionalFormatLoadOptions): ColorScaleConditionalFormat = js.native
  def load(propertyNamesAndPaths: Expand): ColorScaleConditionalFormat = js.native
  def load(propertyNames: String): ColorScaleConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): ColorScaleConditionalFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ColorScaleConditionalFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ColorScaleConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ColorScaleConditionalFormatUpdateData): Unit = js.native
  def set(properties: ColorScaleConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * If true the color scale will have three points (minimum, midpoint, maximum), otherwise it will have two (minimum, maximum).
    *
    * [Api set: ExcelApi 1.6]
    */
  val threeColorScale: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ColorScaleConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ColorScaleConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ColorScaleConditionalFormatData = js.native
}

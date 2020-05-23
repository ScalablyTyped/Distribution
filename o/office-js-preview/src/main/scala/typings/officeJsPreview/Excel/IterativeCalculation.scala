package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.IterativeCalculationData
import typings.officeJsPreview.Excel.Interfaces.IterativeCalculationLoadOptions
import typings.officeJsPreview.Excel.Interfaces.IterativeCalculationUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Iterative Calculation settings.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait IterativeCalculation extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_IterativeCalculation: RequestContext = js.native
  /**
    *
    * True if Excel will use iteration to resolve circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: Boolean = js.native
  /**
    *
    * Specifies the maximum amount of change between each iteration as Excel resolves circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxChange: Double = js.native
  /**
    *
    * Specifies the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): IterativeCalculation = js.native
  def load(options: IterativeCalculationLoadOptions): IterativeCalculation = js.native
  def load(propertyNamesAndPaths: Expand): IterativeCalculation = js.native
  def load(propertyNames: String): IterativeCalculation = js.native
  def load(propertyNames: js.Array[String]): IterativeCalculation = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.IterativeCalculation): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: IterativeCalculationUpdateData): Unit = js.native
  def set(properties: IterativeCalculationUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: IterativeCalculation): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.IterativeCalculation object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.IterativeCalculationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): IterativeCalculationData = js.native
}


package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.ConditionalFormatRuleData
import typings.officeDashJs.Excel.Interfaces.ConditionalFormatRuleLoadOptions
import typings.officeDashJs.Excel.Interfaces.ConditionalFormatRuleUpdateData
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a rule, for all traditional rule/format pairings.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatRule")
@js.native
class ConditionalFormatRule () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalFormatRule: RequestContext = js.native
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: String = js.native
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in the user's language.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: String = js.native
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalFormatRule = js.native
  def load(options: ConditionalFormatRuleLoadOptions): ConditionalFormatRule = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ConditionalFormatRule = js.native
  def load(propertyNames: String): ConditionalFormatRule = js.native
  def load(propertyNames: js.Array[String]): ConditionalFormatRule = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalFormatRule): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ConditionalFormatRule): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalFormatRuleUpdateData): Unit = js.native
  def set(properties: ConditionalFormatRuleUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalFormatRule object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalFormatRuleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalFormatRuleData = js.native
}


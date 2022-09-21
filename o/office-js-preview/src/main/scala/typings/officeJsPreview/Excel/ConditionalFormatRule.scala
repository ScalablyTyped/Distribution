package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ConditionalFormatRuleData
import typings.officeJsPreview.Excel.Interfaces.ConditionalFormatRuleLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ConditionalFormatRuleUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a rule, for all traditional rule/format pairings.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalFormatRule
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalFormatRule: RequestContext = js.native
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formula: String = js.native
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule in the user's language.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: String = js.native
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule in R1C1-style notation.
    *
    * @remarks
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
  def load(propertyNamesAndPaths: Expand): ConditionalFormatRule = js.native
  def load(propertyNames: String): ConditionalFormatRule = js.native
  def load(propertyNames: js.Array[String]): ConditionalFormatRule = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalFormatRule): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
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

package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.PresetCriteriaConditionalFormatData
import typings.officeJsPreview.Excel.Interfaces.PresetCriteriaConditionalFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.PresetCriteriaConditionalFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the preset criteria conditional format such as above average, below average, unique values, contains blank, nonblank, error, and noerror.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait PresetCriteriaConditionalFormat
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PresetCriteriaConditionalFormat: RequestContext = js.native
  
  /**
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val format: ConditionalRangeFormat = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PresetCriteriaConditionalFormat = js.native
  def load(options: PresetCriteriaConditionalFormatLoadOptions): PresetCriteriaConditionalFormat = js.native
  def load(propertyNamesAndPaths: Expand): PresetCriteriaConditionalFormat = js.native
  def load(propertyNames: String): PresetCriteriaConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): PresetCriteriaConditionalFormat = js.native
  
  /**
    * The rule of the conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var rule: ConditionalPresetCriteriaRule = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PresetCriteriaConditionalFormatUpdateData): Unit = js.native
  def set(properties: PresetCriteriaConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PresetCriteriaConditionalFormat): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PresetCriteriaConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PresetCriteriaConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PresetCriteriaConditionalFormatData = js.native
}

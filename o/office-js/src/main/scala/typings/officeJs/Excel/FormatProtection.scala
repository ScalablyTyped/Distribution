package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.FormatProtectionData
import typings.officeJs.Excel.Interfaces.FormatProtectionLoadOptions
import typings.officeJs.Excel.Interfaces.FormatProtectionUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the format protection of a range object.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait FormatProtection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_FormatProtection: RequestContext = js.native
  
  /**
    *
    * Specifies if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulaHidden: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): FormatProtection = js.native
  def load(options: FormatProtectionLoadOptions): FormatProtection = js.native
  def load(propertyNamesAndPaths: Expand): FormatProtection = js.native
  def load(propertyNames: String): FormatProtection = js.native
  def load(propertyNames: js.Array[String]): FormatProtection = js.native
  
  /**
    *
    * Specifies if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var locked: Boolean = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: FormatProtection): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.FormatProtection): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: FormatProtectionUpdateData): Unit = js.native
  def set(properties: FormatProtectionUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.FormatProtection object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.FormatProtectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FormatProtectionData = js.native
}

package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.NamedItemArrayValuesData
import typings.officeJs.Excel.Interfaces.NamedItemArrayValuesLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an object containing values and types of a named item.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait NamedItemArrayValues extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NamedItemArrayValues: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NamedItemArrayValues = js.native
  def load(options: NamedItemArrayValuesLoadOptions): NamedItemArrayValues = js.native
  def load(propertyNamesAndPaths: Expand): NamedItemArrayValues = js.native
  def load(propertyNames: String): NamedItemArrayValues = js.native
  def load(propertyNames: js.Array[String]): NamedItemArrayValues = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.NamedItemArrayValues object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.NamedItemArrayValuesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NamedItemArrayValuesData = js.native
  
  /**
    *
    * Represents the types for each item in the named item array
    *
    * [Api set: ExcelApi 1.7]
    */
  val types: js.Array[js.Array[RangeValueType]] = js.native
  
  /**
    *
    * Represents the values of each item in the named item array.
    *
    * [Api set: ExcelApi 1.7]
    */
  val values: js.Array[js.Array[_]] = js.native
}

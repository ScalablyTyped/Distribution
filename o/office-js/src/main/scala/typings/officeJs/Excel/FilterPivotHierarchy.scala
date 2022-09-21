package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.FilterPivotHierarchyData
import typings.officeJs.Excel.Interfaces.FilterPivotHierarchyLoadOptions
import typings.officeJs.Excel.Interfaces.FilterPivotHierarchyUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Excel FilterPivotHierarchy.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait FilterPivotHierarchy
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_FilterPivotHierarchy: RequestContext = js.native
  
  /**
    * Determines whether to allow multiple filter items.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var enableMultipleFilterItems: Boolean = js.native
  
  /**
    * Returns the PivotFields associated with the FilterPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val fields: PivotFieldCollection = js.native
  
  /**
    * ID of the FilterPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): FilterPivotHierarchy = js.native
  def load(options: FilterPivotHierarchyLoadOptions): FilterPivotHierarchy = js.native
  def load(propertyNamesAndPaths: Expand): FilterPivotHierarchy = js.native
  def load(propertyNames: String): FilterPivotHierarchy = js.native
  def load(propertyNames: js.Array[String]): FilterPivotHierarchy = js.native
  
  /**
    * Name of the FilterPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var name: String = js.native
  
  /**
    * Position of the FilterPivotHierarchy.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var position: Double = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: FilterPivotHierarchy): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: FilterPivotHierarchyUpdateData): Unit = js.native
  def set(properties: FilterPivotHierarchyUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Reset the FilterPivotHierarchy back to its default values.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def setToDefault(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.FilterPivotHierarchy object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.FilterPivotHierarchyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FilterPivotHierarchyData = js.native
}

package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.PivotTableStyleCollectionData
import typings.officeJsPreview.Excel.Interfaces.PivotTableStyleCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of PivotTable styles.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait PivotTableStyleCollection extends ClientObject {
  
  /**
    * Creates a blank PivotTableStyle with the specified name.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name The unique name for the new PivotTableStyle. Will throw an invalid argument exception if the name is already in use.
    * @param makeUniqueName Optional, defaults to false. If true, will append numbers to the name in order to make it unique, if needed.
    * @returns The newly created PivotTableStyle.
    */
  def add(name: String): PivotTableStyle = js.native
  def add(name: String, makeUniqueName: Boolean): PivotTableStyle = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotTableStyleCollection: RequestContext = js.native
  
  /**
    * Gets the number of PivotTable styles in the collection.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets the default PivotTableStyle for the parent object's scope.
    *
    * [Api set: ExcelApi 1.10]
    * @returns The PivotTableStyle object that is the current default PivotTableStyle.
    */
  def getDefault(): PivotTableStyle = js.native
  
  /**
    * Gets a PivotTableStyle by name.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name Name of the PivotTableStyle to be retrieved.
    * @returns The PivotTableStyle object whose name matches the input.
    */
  def getItem(name: String): PivotTableStyle = js.native
  
  /**
    * Gets a PivotTableStyle by name. If the PivotTableStyle does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name Name of the PivotTableStyle to be retrieved.
    * @returns The PivotTableStyle object whose name matches the input.
    */
  def getItemOrNullObject(name: String): PivotTableStyle = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotTableStyle] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotTableStyleCollection = js.native
  def load(options: PivotTableStyleCollectionLoadOptions with CollectionLoadOptions): PivotTableStyleCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PivotTableStyleCollection = js.native
  def load(propertyNames: String): PivotTableStyleCollection = js.native
  def load(propertyNames: js.Array[String]): PivotTableStyleCollection = js.native
  
  def setDefault(newDefaultStyle: String): Unit = js.native
  /**
    * Sets the default PivotTableStyle for use in the parent object's scope.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param newDefaultStyle The PivotTableStyle object or name of the PivotTableStyle object that should be the new default.
    */
  def setDefault(newDefaultStyle: PivotTableStyle): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PivotTableStyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotTableStyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PivotTableStyleCollectionData = js.native
}

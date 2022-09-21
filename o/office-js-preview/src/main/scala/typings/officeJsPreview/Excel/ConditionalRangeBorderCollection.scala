package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ConditionalRangeBorderCollectionData
import typings.officeJsPreview.Excel.Interfaces.ConditionalRangeBorderCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typings.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typings.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typings.officeJsPreview.officeJsPreviewStrings.EdgeTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the border objects that make up range border.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalRangeBorderCollection
  extends StObject
     with ClientObject {
  
  /**
    * Gets the bottom border.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val bottom: ConditionalRangeBorder = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeBorderCollection: RequestContext = js.native
  
  /**
    * Number of border objects in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val count: Double = js.native
  
  /**
    * Gets a border object using its name.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    *
    * @param index Index value of the border object to be retrieved. See `Excel.ConditionalRangeBorderIndex` for details.
    */
  def getItem(index: EdgeTop | EdgeBottom | EdgeLeft | EdgeRight): ConditionalRangeBorder = js.native
  /**
    * Gets a border object using its name.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    *
    * @param index Index value of the border object to be retrieved. See `Excel.ConditionalRangeBorderIndex` for details.
    */
  def getItem(index: ConditionalRangeBorderIndex): ConditionalRangeBorder = js.native
  
  /**
    * Gets a border object using its index.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): ConditionalRangeBorder = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ConditionalRangeBorder] = js.native
  
  /**
    * Gets the left border.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val left: ConditionalRangeBorder = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalRangeBorderCollection = js.native
  def load(options: ConditionalRangeBorderCollectionLoadOptions & CollectionLoadOptions): ConditionalRangeBorderCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ConditionalRangeBorderCollection = js.native
  def load(propertyNames: String): ConditionalRangeBorderCollection = js.native
  def load(propertyNames: js.Array[String]): ConditionalRangeBorderCollection = js.native
  
  /**
    * Gets the right border.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val right: ConditionalRangeBorder = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ConditionalRangeBorderCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeBorderCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ConditionalRangeBorderCollectionData = js.native
  
  /**
    * Gets the top border.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val top: ConditionalRangeBorder = js.native
}

package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.RangeBorderCollectionData
import typings.officeJsPreview.Excel.Interfaces.RangeBorderCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.officeJsPreviewStrings.DiagonalDown
import typings.officeJsPreview.officeJsPreviewStrings.DiagonalUp
import typings.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typings.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typings.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typings.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typings.officeJsPreview.officeJsPreviewStrings.InsideHorizontal
import typings.officeJsPreview.officeJsPreviewStrings.InsideVertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the border objects that make up the range border.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait RangeBorderCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeBorderCollection: RequestContext = js.native
  
  /**
    * Number of border objects in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Gets a border object using its name.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the border object to be retrieved. See `Excel.BorderIndex` for details.
    */
  def getItem(
    index: EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
  ): RangeBorder = js.native
  /**
    * Gets a border object using its name.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the border object to be retrieved. See `Excel.BorderIndex` for details.
    */
  def getItem(index: BorderIndex): RangeBorder = js.native
  
  /**
    * Gets a border object using its index.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): RangeBorder = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RangeBorder] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeBorderCollection = js.native
  def load(options: RangeBorderCollectionLoadOptions & CollectionLoadOptions): RangeBorderCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): RangeBorderCollection = js.native
  def load(propertyNames: String): RangeBorderCollection = js.native
  def load(propertyNames: js.Array[String]): RangeBorderCollection = js.native
  
  /**
    * Specifies a double that lightens or darkens a color for range borders. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the entire border collection doesn't have a uniform `tintAndShade` setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RangeBorderCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeBorderCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RangeBorderCollectionData = js.native
}

package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.HeaderFooterGroupData
import typings.officeJsPreview.Excel.Interfaces.HeaderFooterGroupLoadOptions
import typings.officeJsPreview.Excel.Interfaces.HeaderFooterGroupUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Default
import typings.officeJsPreview.officeJsPreviewStrings.FirstAndDefault
import typings.officeJsPreview.officeJsPreviewStrings.FirstOddAndEven
import typings.officeJsPreview.officeJsPreviewStrings.OddAndEven
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait HeaderFooterGroup
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_HeaderFooterGroup: RequestContext = js.native
  
  /**
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val defaultForAllPages: HeaderFooter = js.native
  
  /**
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val evenPages: HeaderFooter = js.native
  
  /**
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val firstPage: HeaderFooter = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): HeaderFooterGroup = js.native
  def load(options: HeaderFooterGroupLoadOptions): HeaderFooterGroup = js.native
  def load(propertyNamesAndPaths: Expand): HeaderFooterGroup = js.native
  def load(propertyNames: String): HeaderFooterGroup = js.native
  def load(propertyNames: js.Array[String]): HeaderFooterGroup = js.native
  
  /**
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val oddPages: HeaderFooter = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: HeaderFooterGroup): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: HeaderFooterGroupUpdateData): Unit = js.native
  def set(properties: HeaderFooterGroupUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * The state by which headers/footers are set. See `Excel.HeaderFooterState` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var state: HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.HeaderFooterGroup object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.HeaderFooterGroupData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): HeaderFooterGroupData = js.native
  
  /**
    * Gets or sets a flag indicating if headers/footers are aligned with the page margins set in the page layout options for the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var useSheetMargins: Boolean = js.native
  
  /**
    * Gets or sets a flag indicating if headers/footers should be scaled by the page percentage scale set in the page layout options for the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var useSheetScale: Boolean = js.native
}

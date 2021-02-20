package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.AutoFilterData
import typings.officeJs.Excel.Interfaces.AutoFilterLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the AutoFilter object.
  AutoFilter turns the values in Excel column into specific filters based on the cell contents.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait AutoFilter extends ClientObject {
  
  @JSName("apply")
  def apply(range: String): Unit = js.native
  @JSName("apply")
  def apply(range: String, columnIndex: js.UndefOr[scala.Nothing], criteria: FilterCriteria): Unit = js.native
  @JSName("apply")
  def apply(range: String, columnIndex: Double): Unit = js.native
  @JSName("apply")
  def apply(range: String, columnIndex: Double, criteria: FilterCriteria): Unit = js.native
  /**
    * Applies the AutoFilter to a range. This filters the column if column index and filter criteria are specified.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param range The range over which the AutoFilter will apply on.
    * @param columnIndex The zero-based column index to which the AutoFilter is applied.
    * @param criteria The filter criteria.
    */
  @JSName("apply")
  def apply(range: Range): Unit = js.native
  @JSName("apply")
  def apply(range: Range, columnIndex: js.UndefOr[scala.Nothing], criteria: FilterCriteria): Unit = js.native
  @JSName("apply")
  def apply(range: Range, columnIndex: Double): Unit = js.native
  @JSName("apply")
  def apply(range: Range, columnIndex: Double, criteria: FilterCriteria): Unit = js.native
  
  /**
    * Clears the filter criteria of the AutoFilter.
    *
    * [Api set: ExcelApi 1.9]
    */
  def clearCriteria(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_AutoFilter: RequestContext = js.native
  
  /**
    *
    * An array that holds all the filter criteria in the autofiltered range.
    *
    * [Api set: ExcelApi 1.9]
    */
  val criteria: js.Array[FilterCriteria] = js.native
  
  /**
    *
    * Specifies if the AutoFilter is enabled.
    *
    * [Api set: ExcelApi 1.9]
    */
  val enabled: Boolean = js.native
  
  /**
    * Returns the Range object that represents the range to which the AutoFilter applies.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getRange(): Range = js.native
  
  /**
    * Returns the Range object that represents the range to which the AutoFilter applies.
    If there is no Range object associated with the AutoFilter, this method returns a null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getRangeOrNullObject(): Range = js.native
  
  /**
    *
    * Specifies if the AutoFilter has filter criteria.
    *
    * [Api set: ExcelApi 1.9]
    */
  val isDataFiltered: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): AutoFilter = js.native
  def load(options: AutoFilterLoadOptions): AutoFilter = js.native
  def load(propertyNamesAndPaths: Expand): AutoFilter = js.native
  def load(propertyNames: String): AutoFilter = js.native
  def load(propertyNames: js.Array[String]): AutoFilter = js.native
  
  /**
    * Applies the specified Autofilter object currently on the range.
    *
    * [Api set: ExcelApi 1.9]
    */
  def reapply(): Unit = js.native
  
  /**
    * Removes the AutoFilter for the range.
    *
    * [Api set: ExcelApi 1.9]
    */
  def remove(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.AutoFilter object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.AutoFilterData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): AutoFilterData = js.native
}

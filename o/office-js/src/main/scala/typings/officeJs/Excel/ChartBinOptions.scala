package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartBinOptionsData
import typings.officeJs.Excel.Interfaces.ChartBinOptionsLoadOptions
import typings.officeJs.Excel.Interfaces.ChartBinOptionsUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Auto
import typings.officeJs.officeJsStrings.BinCount
import typings.officeJs.officeJsStrings.BinWidth
import typings.officeJs.officeJsStrings.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the bin options for histogram charts and pareto charts.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartBinOptions
  extends StObject
     with ClientObject {
  
  /**
    * Specifies if bin overflow is enabled in a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: Boolean = js.native
  
  /**
    * Specifies if bin underflow is enabled in a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartBinOptions: RequestContext = js.native
  
  /**
    * Specifies the bin count of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var count: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartBinOptions = js.native
  def load(options: ChartBinOptionsLoadOptions): ChartBinOptions = js.native
  def load(propertyNamesAndPaths: Expand): ChartBinOptions = js.native
  def load(propertyNames: String): ChartBinOptions = js.native
  def load(propertyNames: js.Array[String]): ChartBinOptions = js.native
  
  /**
    * Specifies the bin overflow value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: Double = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartBinOptions): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartBinOptionsUpdateData): Unit = js.native
  def set(properties: ChartBinOptionsUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartBinOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartBinOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartBinOptionsData = js.native
  
  /**
    * Specifies the bin's type for a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ChartBinType | Category | Auto | BinWidth | BinCount = js.native
  
  /**
    * Specifies the bin underflow value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: Double = js.native
  
  /**
    * Specifies the bin width value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var width: Double = js.native
}

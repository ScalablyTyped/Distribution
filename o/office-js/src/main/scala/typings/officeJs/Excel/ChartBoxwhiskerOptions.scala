package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartBoxwhiskerOptionsData
import typings.officeJs.Excel.Interfaces.ChartBoxwhiskerOptionsLoadOptions
import typings.officeJs.Excel.Interfaces.ChartBoxwhiskerOptionsUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Exclusive
import typings.officeJs.officeJsStrings.Inclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the properties of a box and whisker chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartBoxwhiskerOptions
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartBoxwhiskerOptions: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartBoxwhiskerOptions = js.native
  def load(options: ChartBoxwhiskerOptionsLoadOptions): ChartBoxwhiskerOptions = js.native
  def load(propertyNamesAndPaths: Expand): ChartBoxwhiskerOptions = js.native
  def load(propertyNames: String): ChartBoxwhiskerOptions = js.native
  def load(propertyNames: js.Array[String]): ChartBoxwhiskerOptions = js.native
  
  /**
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: ChartBoxQuartileCalculation | Inclusive | Exclusive = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartBoxwhiskerOptions): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartBoxwhiskerOptionsUpdateData): Unit = js.native
  def set(properties: ChartBoxwhiskerOptionsUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: Boolean = js.native
  
  /**
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: Boolean = js.native
  
  /**
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: Boolean = js.native
  
  /**
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartBoxwhiskerOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartBoxwhiskerOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartBoxwhiskerOptionsData = js.native
}

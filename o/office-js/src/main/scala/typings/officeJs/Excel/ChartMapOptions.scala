package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartMapOptionsData
import typings.officeJs.Excel.Interfaces.ChartMapOptionsLoadOptions
import typings.officeJs.Excel.Interfaces.ChartMapOptionsUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Albers
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.BestFit
import typings.officeJs.officeJsStrings.City
import typings.officeJs.officeJsStrings.Continent
import typings.officeJs.officeJsStrings.Country
import typings.officeJs.officeJsStrings.County
import typings.officeJs.officeJsStrings.DataOnly
import typings.officeJs.officeJsStrings.Mercator
import typings.officeJs.officeJsStrings.Miller
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Robinson
import typings.officeJs.officeJsStrings.ShowAll
import typings.officeJs.officeJsStrings.State
import typings.officeJs.officeJsStrings.World
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the properties for a region map chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartMapOptions
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartMapOptions: RequestContext = js.native
  
  /**
    * Specifies the series map labels strategy of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = js.native
  
  /**
    * Specifies the series mapping level of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartMapOptions = js.native
  def load(options: ChartMapOptionsLoadOptions): ChartMapOptions = js.native
  def load(propertyNamesAndPaths: Expand): ChartMapOptions = js.native
  def load(propertyNames: String): ChartMapOptions = js.native
  def load(propertyNames: js.Array[String]): ChartMapOptions = js.native
  
  /**
    * Specifies the series projection type of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartMapOptions): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartMapOptionsUpdateData): Unit = js.native
  def set(properties: ChartMapOptionsUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartMapOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartMapOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartMapOptionsData = js.native
}

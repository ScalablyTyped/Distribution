package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.RangeBorderData
import typings.officeJs.Excel.Interfaces.RangeBorderLoadOptions
import typings.officeJs.Excel.Interfaces.RangeBorderUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Continuous
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashDot
import typings.officeJs.officeJsStrings.DashDotDot
import typings.officeJs.officeJsStrings.DiagonalDown
import typings.officeJs.officeJsStrings.DiagonalUp
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.EdgeBottom
import typings.officeJs.officeJsStrings.EdgeLeft
import typings.officeJs.officeJsStrings.EdgeRight
import typings.officeJs.officeJsStrings.EdgeTop
import typings.officeJs.officeJsStrings.Hairline
import typings.officeJs.officeJsStrings.InsideHorizontal
import typings.officeJs.officeJsStrings.InsideVertical
import typings.officeJs.officeJsStrings.Medium
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.SlantDashDot
import typings.officeJs.officeJsStrings.Thick
import typings.officeJs.officeJsStrings.Thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the border of an object.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait RangeBorder extends ClientObject {
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeBorder: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeBorder = js.native
  def load(options: RangeBorderLoadOptions): RangeBorder = js.native
  def load(propertyNamesAndPaths: Expand): RangeBorder = js.native
  def load(propertyNames: String): RangeBorder = js.native
  def load(propertyNames: js.Array[String]): RangeBorder = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeBorder): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeBorderUpdateData): Unit = js.native
  def set(properties: RangeBorderUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeBorder): Unit = js.native
  
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  val sideIndex: BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp = js.native
  
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot = js.native
  
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: scala.Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeBorderData = js.native
  
  /**
    *
    * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: BorderWeight | Hairline | Thin | Medium | Thick = js.native
}

package typings.officeDashJs.ExcelNs

import org.scalablytyped.runtime.StringDictionary
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the fill formatting for a chart element.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartFill")
@js.native
class ChartFill () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartFill: RequestContext = js.native
  /**
    *
    * Clear the fill color of a chart element.
    *
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    */
  def load(): ChartFill = js.native
  def load(option: String): ChartFill = js.native
  def load(option: js.Array[String]): ChartFill = js.native
  def load(option: LoadOption): ChartFill = js.native
  /**
    *
    * Sets the fill formatting of a chart element to a uniform color.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param color HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    */
  def setSolidColor(color: String): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String] = js.native
}


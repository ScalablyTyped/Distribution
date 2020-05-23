package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJsPreview.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the fill formatting for a chart element.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartFill extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartFill: RequestContext
  /**
    * Clear the fill color of a chart element.
    *
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit
  /**
    * Sets the fill formatting of a chart element to a uniform color.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param color HTML color code representing the color of the background, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    */
  def setSolidColor(color: String): Unit
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String]
}

object ChartFill {
  @scala.inline
  def apply(
    clear: () => Unit,
    context: RequestContext,
    isNullObject: Boolean,
    setSolidColor: String => Unit,
    toJSON: () => StringDictionary[String]
  ): ChartFill = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), context = context.asInstanceOf[js.Any], isNullObject = isNullObject.asInstanceOf[js.Any], setSolidColor = js.Any.fromFunction1(setSolidColor), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ChartFill]
  }
}


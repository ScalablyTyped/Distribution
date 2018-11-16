package typings
package officeDashJsLib.ExcelNs

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
class ChartFill ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Clear the fill color of a chart element.
           *
           * [Api set: ExcelApi 1.1]
           */
  def clear(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           */
  def load(): ChartFill = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           */
  def load(option: java.lang.String): ChartFill = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           */
  def load(option: js.Array[java.lang.String]): ChartFill = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           */
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ChartFill = js.native
  /**
           *
           * Sets the fill formatting of a chart element to a uniform color.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param color HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
           */
  def setSolidColor(color: java.lang.String): scala.Unit = js.native
  def toJSON(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
}


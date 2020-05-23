package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarLegendItem extends Element {
  /**
    * Gets current value of property <code>text</code>.Text to be displayed for the item.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>type</code>.Type of the item.If not set the type is
    * automatically determined from the order of the items in the CalendarLegend.Default value is
    * <code>None</code>.
    * @since 1.28.9
    * @returns Value of property <code>type</code>
    */
  def getType(): CalendarDayType = js.native
  /**
    * Sets a new value for property <code>text</code>.Text to be displayed for the item.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): CalendarLegendItem = js.native
  /**
    * Sets a new value for property <code>type</code>.Type of the item.If not set the type is
    * automatically determined from the order of the items in the CalendarLegend.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @since 1.28.9
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: CalendarDayType): CalendarLegendItem = js.native
}


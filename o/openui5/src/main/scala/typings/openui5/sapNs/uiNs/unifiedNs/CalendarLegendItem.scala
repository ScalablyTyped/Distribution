package typings.openui5.sapNs.uiNs.unifiedNs

import typings.openui5.sapNs.uiNs.coreNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.CalendarLegendItem")
@js.native
class CalendarLegendItem protected () extends Element {
  /**
    * Constructor for a new CalendarLegendItem.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
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


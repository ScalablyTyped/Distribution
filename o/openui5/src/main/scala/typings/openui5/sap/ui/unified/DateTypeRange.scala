package typings.openui5.sap.ui.unified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTypeRange extends DateRange {
  
  /**
    * Gets current value of property <code>type</code>.Type of the date range.Default value is
    * <code>Type01</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): CalendarDayType = js.native
  
  /**
    * Sets a new value for property <code>type</code>.Type of the date range.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Type01</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: CalendarDayType): DateTypeRange = js.native
}

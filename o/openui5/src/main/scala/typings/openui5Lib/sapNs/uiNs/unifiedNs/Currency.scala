package typings
package openui5Lib.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.Currency")
@js.native
class Currency protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new Currency.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>currency</code>.Determines the displayed currency code (ISO
    * 4217).<b>Note: </b>If a * character is set instead of currency code,only the character itself will
    * be rendered, ignoring the <code>value</code> property.
    * @returns Value of property <code>currency</code>
    */
  def getCurrency(): java.lang.String = js.native
  /**
    * Get symbol of the currency, if available
    */
  def getCurrencySymbol(): java.lang.String = js.native
  /**
    * The formatted value
    */
  def getFormattedValue(): java.lang.String = js.native
  /**
    * Gets current value of property <code>maxPrecision</code>.Defines the space that is available for the
    * precision of the various currencies.Default value is <code>3</code>.
    * @returns Value of property <code>maxPrecision</code>
    */
  def getMaxPrecision(): scala.Double = js.native
  /**
    * Gets current value of property <code>useSymbol</code>.Show the currency symbol instead of the ISO
    * currency codeDefault value is <code>true</code>.
    * @returns Value of property <code>useSymbol</code>
    */
  def getUseSymbol(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>value</code>.The currency valueDefault value is <code>0</code>.
    * @returns Value of property <code>value</code>
    */
  def getValue(): scala.Double = js.native
}


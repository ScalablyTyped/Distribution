package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency
  extends StObject
     with Control {
  
  /**
    * Gets current value of property <code>currency</code>.Determines the displayed currency code (ISO
    * 4217).<b>Note: </b>If a * character is set instead of currency code,only the character itself will
    * be rendered, ignoring the <code>value</code> property.
    * @returns Value of property <code>currency</code>
    */
  def getCurrency(): String = js.native
  
  /**
    * Get symbol of the currency, if available
    */
  def getCurrencySymbol(): String = js.native
  
  /**
    * The formatted value
    */
  def getFormattedValue(): String = js.native
  
  /**
    * Gets current value of property <code>maxPrecision</code>.Defines the space that is available for the
    * precision of the various currencies.Default value is <code>3</code>.
    * @returns Value of property <code>maxPrecision</code>
    */
  def getMaxPrecision(): Double = js.native
  
  /**
    * Gets current value of property <code>useSymbol</code>.Show the currency symbol instead of the ISO
    * currency codeDefault value is <code>true</code>.
    * @returns Value of property <code>useSymbol</code>
    */
  def getUseSymbol(): Boolean = js.native
  
  /**
    * Gets current value of property <code>value</code>.The currency valueDefault value is <code>0</code>.
    * @returns Value of property <code>value</code>
    */
  def getValue(): Double = js.native
}

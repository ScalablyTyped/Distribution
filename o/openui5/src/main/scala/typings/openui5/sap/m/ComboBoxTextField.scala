package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBoxTextField extends InputBase {
  
  /**
    * Gets current value of property <code>maxWidth</code>.Sets the maximum width of the text
    * field.Default value is <code>100%</code>.
    * @returns Value of property <code>maxWidth</code>
    */
  def getMaxWidth(): js.Any = js.native
  
  /**
    * Gets current value of property <code>showButton</code>.Indicates whether the dropdown arrow button
    * is shown.Default value is <code>true</code>.
    * @since 1.38
    * @returns Value of property <code>showButton</code>
    */
  def getShowButton(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>maxWidth</code>.Sets the maximum width of the text field.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>100%</code>.
    * @param sMaxWidth New value for property <code>maxWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxWidth(sMaxWidth: js.Any): ComboBoxTextField = js.native
  
  /**
    * Sets a new value for property <code>showButton</code>.Indicates whether the dropdown arrow button is
    * shown.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @since 1.38
    * @param bShowButton New value for property <code>showButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowButton(bShowButton: Boolean): ComboBoxTextField = js.native
}

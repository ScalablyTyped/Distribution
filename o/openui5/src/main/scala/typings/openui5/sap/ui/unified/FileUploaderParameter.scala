package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUploaderParameter extends Element {
  
  /**
    * Gets current value of property <code>name</code>.The name of the hidden inputfield.
    * @since 1.12.2
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
  
  /**
    * Gets current value of property <code>value</code>.The value of the hidden inputfield.
    * @since 1.12.2
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  
  /**
    * Sets a new value for property <code>name</code>.The name of the hidden inputfield.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.12.2
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): FileUploaderParameter = js.native
  
  /**
    * Sets a new value for property <code>value</code>.The value of the hidden inputfield.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.12.2
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): FileUploaderParameter = js.native
}

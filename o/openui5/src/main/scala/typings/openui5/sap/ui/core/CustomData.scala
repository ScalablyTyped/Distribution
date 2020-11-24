package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomData extends Element {
  
  /**
    * Gets current value of property <code>key</code>.The key of the data in this CustomData object.When
    * the data is just stored, it can be any string, but when it is to be written to HTML (writeToDom ==
    * true) then it must also be a valid HTML attribute name (it must conform to the any type
    * and may contain no colon) to avoid collisions, it also may not start with "sap-ui". When written to
    * HTML, the key is prefixed with "data-".If any restriction is violated, a warning will be logged and
    * nothing will be written to the DOM.
    * @returns Value of property <code>key</code>
    */
  def getKey(): String = js.native
  
  /**
    * Gets current value of property <code>value</code>.The data stored in this CustomData object.When the
    * data is just stored, it can be any JS type, but when it is to be written to HTML (writeToDom ==
    * true) then it must be a string.If this restriction is violated, a warning will be logged and nothing
    * will be written to the DOM.
    * @returns Value of property <code>value</code>
    */
  def getValue(): js.Any = js.native
  
  /**
    * Gets current value of property <code>writeToDom</code>.If set to "true" and the value is of type
    * "string" and the key conforms to the documented restrictions, this custom data is written to the
    * HTML root element of the control as a "data-*" attribute.If the key is "abc" and the value is "cde",
    * the HTML will look as follows:&lt;SomeTag ... data-abc="cde" ... &gt;Thus the application can
    * provide stable attributes by data binding which can be used for styling or identification
    * purposes.ATTENTION: use carefully to not create huge attributes or a large number of them.Default
    * value is <code>false</code>.
    * @since 1.9.0
    * @returns Value of property <code>writeToDom</code>
    */
  def getWriteToDom(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>key</code>.The key of the data in this CustomData object.When
    * the data is just stored, it can be any string, but when it is to be written to HTML (writeToDom ==
    * true) then it must also be a valid HTML attribute name (it must conform to the any type
    * and may contain no colon) to avoid collisions, it also may not start with "sap-ui". When written to
    * HTML, the key is prefixed with "data-".If any restriction is violated, a warning will be logged and
    * nothing will be written to the DOM.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: String): CustomData = js.native
  
  /**
    * Sets a new value for property <code>value</code>.The data stored in this CustomData object.When the
    * data is just stored, it can be any JS type, but when it is to be written to HTML (writeToDom ==
    * true) then it must be a string.If this restriction is violated, a warning will be logged and nothing
    * will be written to the DOM.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.
    * @param oValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(oValue: js.Any): CustomData = js.native
  
  /**
    * Sets a new value for property <code>writeToDom</code>.If set to "true" and the value is of type
    * "string" and the key conforms to the documented restrictions, this custom data is written to the
    * HTML root element of the control as a "data-*" attribute.If the key is "abc" and the value is "cde",
    * the HTML will look as follows:&lt;SomeTag ... data-abc="cde" ... &gt;Thus the application can
    * provide stable attributes by data binding which can be used for styling or identification
    * purposes.ATTENTION: use carefully to not create huge attributes or a large number of them.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @since 1.9.0
    * @param bWriteToDom New value for property <code>writeToDom</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWriteToDom(bWriteToDom: Boolean): CustomData = js.native
}

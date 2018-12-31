package typings
package openui5Lib.sapNs.uiNs.coreNs.tmplNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.tmpl.DOMAttribute")
@js.native
class DOMAttribute protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
    * Constructor for a new tmpl/DOMAttribute.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>name</code>.Name of the DOM attribute
    * @returns Value of property <code>name</code>
    */
  def getName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>value</code>.Value of the DOM attribute
    * @returns Value of property <code>value</code>
    */
  def getValue(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>name</code>.Name of the DOM attributeWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: java.lang.String): DOMAttribute = js.native
  /**
    * Sets a new value for property <code>value</code>.Value of the DOM attributeWhen called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: java.lang.String): DOMAttribute = js.native
}


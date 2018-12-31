package typings
package openui5Lib.sapNs.uiNs.testNs.matchersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.matchers.PropertyStrictEquals")
@js.native
class PropertyStrictEquals protected () extends Matcher {
  /**
    * PropertyStrictEquals - checks if a property has the exact same value.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param mSettings optional map/JSON-object with initial settings for the new PropertyStrictEquals
    */
  def this(mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>name</code>.The Name of the property that is used for matching.
    * @returns Value of property <code>name</code>
    */
  def getName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>value</code>.The value of the property that is used for
    * matching.
    * @returns Value of property <code>value</code>
    */
  def getValue(): js.Any = js.native
  /**
    * Sets a new value for property <code>name</code>.The Name of the property that is used for
    * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: java.lang.String): PropertyStrictEquals = js.native
  /**
    * Sets a new value for property <code>value</code>.The value of the property that is used for
    * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param oValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(oValue: js.Any): PropertyStrictEquals = js.native
}


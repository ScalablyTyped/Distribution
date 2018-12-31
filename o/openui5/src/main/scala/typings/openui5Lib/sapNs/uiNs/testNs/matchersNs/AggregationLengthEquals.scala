package typings
package openui5Lib.sapNs.uiNs.testNs.matchersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.matchers.AggregationLengthEquals")
@js.native
class AggregationLengthEquals protected () extends Matcher {
  /**
    * AggregationLengthEquals - checks if an aggregation contains at least one entry.Accepts an object
    * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
    * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
    * description of the syntax of the settings object.
    * @param mSettings optional map/JSON-object with initial settings for the new
    * AggregationLengthEqualsMatcher
    */
  def this(mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>length</code>.The length that aggregation <code>name</code>
    * should have.
    * @returns Value of property <code>length</code>
    */
  def getLength(): scala.Double = js.native
  /**
    * Gets current value of property <code>name</code>.The name of the aggregation that is used for
    * matching.
    * @returns Value of property <code>name</code>
    */
  def getName(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>length</code>.The length that aggregation <code>name</code>
    * should have.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param iLength New value for property <code>length</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLength(iLength: scala.Double): AggregationLengthEquals = js.native
  /**
    * Sets a new value for property <code>name</code>.The name of the aggregation that is used for
    * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: java.lang.String): AggregationLengthEquals = js.native
}


package typings.openui5.sap.ui.test.matchers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregationFilled extends Matcher {
  
  /**
    * Gets current value of property <code>name</code>.The name of the aggregation that is used for
    * matching.
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
  
  /**
    * Sets a new value for property <code>name</code>.The name of the aggregation that is used for
    * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): AggregationFilled = js.native
}

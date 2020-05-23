package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.Lookup")
@js.native
class Lookup protected () extends AttributeBase {
  /**
    * A Lookup Attribute.
    * @param name The logical name of the attribute.
    * @param value The value of the attribute.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, value: EntityReference) = this()
  /**
    * Sets the value of a Lookup attribute.
    * @param value The value to set.
    */
  def setValue(value: EntityReference): Unit = js.native
}


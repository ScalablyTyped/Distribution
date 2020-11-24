package typings.microsoftSdkSoap.mod.global.Sdk

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.DateTime")
@js.native
class DateTime protected () extends AttributeBase {
  /**
    * A DateTime Attribute.
    * @param name The logical name of the attribute.
    * @param value The value of the attribute.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, value: Date) = this()
  
  /**
    * Sets the value of a DateTime attribute.
    * @param value The value to set.
    */
  def setValue(value: Date): Unit = js.native
}

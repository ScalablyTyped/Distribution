package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.DateTime")
@js.native
open class DateTime protected () extends AttributeBase {
  /**
    * A DateTime Attribute.
    * @param name The logical name of the attribute.
    * @param value The value of the attribute.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, value: js.Date) = this()
  
  /**
    * Sets the value of a DateTime attribute.
    * @param value The value to set.
    */
  def setValue(value: js.Date): Unit = js.native
}

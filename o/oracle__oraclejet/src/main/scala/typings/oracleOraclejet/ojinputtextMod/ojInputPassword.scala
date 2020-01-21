package typings.oracleOraclejet.ojinputtextMod

import typings.oracleOraclejet.AnonAction
import typings.oracleOraclejet.AnonActionElement
import typings.oracleOraclejet.ojinputtextMod.ojInputPassword.ojAnimateEnd
import typings.oracleOraclejet.ojinputtextMod.ojInputPassword.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputPassword extends inputBase[String | Null, ojInputPasswordSettableProperties, String | Null, String | Null] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputPassword: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputPassword: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  def setProperties(properties: ojInputPasswordSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: String): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojinputtext", "ojInputPassword")
@js.native
object ojInputPassword extends js.Object {
  type ojAnimateEnd = CustomEvent[AnonAction]
  type ojAnimateStart = CustomEvent[AnonActionElement]
}


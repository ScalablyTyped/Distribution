package typings.atOracleOraclejet.ojinputtextMod

import typings.atOracleOraclejet.atOracleOraclejetStrings.value
import typings.atOracleOraclejet.ojinputtextMod.ojInputPasswordNs.ojAnimateEnd
import typings.atOracleOraclejet.ojinputtextMod.ojInputPasswordNs.ojAnimateStart
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
  def setProperty_rawValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: String): Unit = js.native
}


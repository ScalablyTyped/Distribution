package typings
package atOracleOraclejetLib.ojinputtextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputPassword
  extends inputBase[
      java.lang.String | scala.Null, 
      ojInputPasswordSettableProperties, 
      java.lang.String | scala.Null, 
      java.lang.String | scala.Null
    ] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputPassword: (js.Function1[/* event */ atOracleOraclejetLib.ojinputtextMod.ojInputPasswordNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputPassword: (js.Function1[
    /* event */ atOracleOraclejetLib.ojinputtextMod.ojInputPasswordNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  def setProperties(properties: ojInputPasswordSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue, value: java.lang.String): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.value, value: java.lang.String): scala.Unit = js.native
}


package typings.oracleOraclejet.ojinputtextMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.ojinputtextMod.ojInputPassword.ojAnimateEnd
import typings.oracleOraclejet.ojinputtextMod.ojInputPassword.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputPassword
  extends StObject
     with inputBase[String | Null, ojInputPasswordSettableProperties, String | Null, String | Null] {
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputPassword: (js.Function1[/* event */ ojAnimateEnd, Any]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputPassword: (js.Function1[/* event */ ojAnimateStart, Any]) | Null = js.native
  
  def setProperties(properties: ojInputPasswordSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
}
object ojInputPassword {
  
  type ojAnimateEnd = CustomEvent[Action]
  
  type ojAnimateStart = CustomEvent[Element]
}

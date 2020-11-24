package typings.oracleOraclejet.ojtoolbarMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.oracleOraclejetStrings.chroming
import typings.oracleOraclejet.oracleOraclejetStrings.chromingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojToolbar extends baseComponent[ojToolbarSettableProperties] {
  
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], _]
  ): Unit = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], _],
    useCapture: Boolean
  ): Unit = js.native
  
  var chroming: full | half | outlined = js.native
  
  @JSName("getProperty")
  def getProperty_chroming(property: chroming): full | half | outlined = js.native
  
  var onChromingChanged: (js.Function1[/* event */ JetElementCustomEvent[full | half | outlined], _]) | Null = js.native
  
  def setProperties(properties: ojToolbarSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: chroming, value: full): Unit = js.native
  def setProperty(property: chroming, value: half): Unit = js.native
  def setProperty(property: chroming, value: outlined): Unit = js.native
}

package typings
package atOracleOraclejetLib.ojarraydataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayDataProvider[K, D]
  extends atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] {
  def addEventListener(eventType: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
  def getCapability(): js.Any = js.native
  def removeEventListener(eventType: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
}


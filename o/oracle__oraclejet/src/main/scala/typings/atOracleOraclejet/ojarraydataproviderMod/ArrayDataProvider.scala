package typings.atOracleOraclejet.ojarraydataproviderMod

import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayDataProvider[K, D] extends DataProvider[K, D] {
  def addEventListener(eventType: String, listener: EventListener): Unit = js.native
  def getCapability(): js.Any = js.native
  def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
}


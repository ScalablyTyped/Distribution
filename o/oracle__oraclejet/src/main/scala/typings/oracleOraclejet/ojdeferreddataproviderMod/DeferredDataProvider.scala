package typings.oracleOraclejet.ojdeferreddataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredDataProvider[K, D] extends DataProvider[K, D] {
  def addEventListener(eventType: String, listener: EventListener): js.Any = js.native
  def removeEventListener(eventType: String, listener: EventListener): js.Any = js.native
}


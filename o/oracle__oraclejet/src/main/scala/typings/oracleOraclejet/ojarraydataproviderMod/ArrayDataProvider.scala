package typings.oracleOraclejet.ojarraydataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayDataProvider[K, D] extends DataProvider[K, D] {
  
  def addEventListener(eventType: String, listener: EventListener): Unit = js.native
  
  def getCapability(): js.Any = js.native
  
  def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
}

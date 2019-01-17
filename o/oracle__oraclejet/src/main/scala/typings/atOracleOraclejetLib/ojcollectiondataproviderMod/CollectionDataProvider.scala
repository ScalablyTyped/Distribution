package typings
package atOracleOraclejetLib.ojcollectiondataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionDataProvider[K, D]
  extends atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] {
  def addEventListener(eventType: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
  def getCapability(): js.Any = js.native
  def removeEventListener(eventType: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
}


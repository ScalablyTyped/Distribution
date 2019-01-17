package typings
package atOracleOraclejetLib.ojlistdataproviderviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataProviderView[K, D, Kin, Din]
  extends atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] {
  var attributes: js.Array[java.lang.String | atOracleOraclejetLib.ojdataproviderMod.FetchAttribute] = js.native
  var dataMapping: atOracleOraclejetLib.ojdataproviderMod.DataMapping[K, D, Kin, Din] = js.native
  var from: Kin = js.native
  var offset: scala.Double = js.native
  var sortCriteria: js.Array[atOracleOraclejetLib.ojdataproviderMod.SortCriterion[D]] = js.native
  def addEventListener(eventType: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
  def removeEventListener(eventType: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
}


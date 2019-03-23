package typings
package ndnDashJsLib.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/data", "MetaInfo")
@js.native
class MetaInfo () extends js.Object {
  def this(meta: MetaInfo) = this()
  def getFinalBlockId(): ndnDashJsLib.nameMod.NameNs.Component = js.native
  def getFreshnessPeriod(): scala.Double = js.native
  def getOtherTypeCode(): scala.Double = js.native
  def getType(): ContentType = js.native
  def setFinalBlockId(comp: ndnDashJsLib.nameMod.NameNs.Component): scala.Unit = js.native
  def setFreshnessPeriod(freshness: scala.Double): scala.Unit = js.native
  def setOtherTypeCode(otherTypeCode: scala.Double): scala.Unit = js.native
  def setType(`type`: ContentType): scala.Unit = js.native
}


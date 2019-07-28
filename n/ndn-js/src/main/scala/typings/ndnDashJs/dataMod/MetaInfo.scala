package typings.ndnDashJs.dataMod

import typings.ndnDashJs.nameMod.NameNs.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/data", "MetaInfo")
@js.native
class MetaInfo () extends js.Object {
  def this(meta: MetaInfo) = this()
  def getFinalBlockId(): Component = js.native
  def getFreshnessPeriod(): Double = js.native
  def getOtherTypeCode(): Double = js.native
  def getType(): ContentType = js.native
  def setFinalBlockId(comp: Component): Unit = js.native
  def setFreshnessPeriod(freshness: Double): Unit = js.native
  def setOtherTypeCode(otherTypeCode: Double): Unit = js.native
  def setType(`type`: ContentType): Unit = js.native
}


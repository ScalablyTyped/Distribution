package typings.ndnDashJs.interestMod

import typings.ndnDashJs.blobMod.Blob
import typings.ndnDashJs.dataMod.Data
import typings.ndnDashJs.nameMod.Name
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/interest", "Interest")
@js.native
class Interest () extends js.Object {
  def this(interest: Interest) = this()
  def this(name: String) = this()
  def this(name: Name) = this()
  def appendParametersDigestToName(): Interest = js.native
  def getApplicationParameters(): Blob = js.native
  def getCanBePrefix(): Boolean = js.native
  def getForwardingHint(): DelegationSet = js.native
  def getIncomingFaceId(): Double = js.native
  def getInterestLifetimeMilliseconds(): Double = js.native
  def getMustBeFresh(): Boolean = js.native
  def getName(): Name = js.native
  def getNonce(): Blob = js.native
  def matchesData(data: Data): Boolean = js.native
  def matchesName(name: Name): Boolean = js.native
  def refreshNonce(): Unit = js.native
  def setApplicationParameters(parameters: Blob): Interest = js.native
  def setApplicationParameters(parameters: Buffer): Interest = js.native
  def setCanBePrefix(canBePrefix: Boolean): Interest = js.native
  def setForwardingHint(fh: DelegationSet): Interest = js.native
  def setInterestLifetimeMilliseconds(lifetime: Double): Interest = js.native
  def setMustBeFresh(mustBeFresh: Boolean): Interest = js.native
  def setName(name: Name): Interest = js.native
  def toUri(): String = js.native
  def wireDecode(input: Blob): Unit = js.native
  def wireDecode(input: Buffer): Unit = js.native
  def wireEncode(): Blob = js.native
}


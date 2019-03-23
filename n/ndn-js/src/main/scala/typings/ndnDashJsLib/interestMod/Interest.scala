package typings
package ndnDashJsLib.interestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/interest", "Interest")
@js.native
class Interest () extends js.Object {
  def this(interest: Interest) = this()
  def this(name: java.lang.String) = this()
  def this(name: ndnDashJsLib.nameMod.Name) = this()
  def appendParametersDigestToName(): Interest = js.native
  def getApplicationParameters(): ndnDashJsLib.blobMod.Blob = js.native
  def getCanBePrefix(): scala.Boolean = js.native
  def getForwardingHint(): DelegationSet = js.native
  def getIncomingFaceId(): scala.Double = js.native
  def getInterestLifetimeMilliseconds(): scala.Double = js.native
  def getMustBeFresh(): scala.Boolean = js.native
  def getName(): ndnDashJsLib.nameMod.Name = js.native
  def getNonce(): ndnDashJsLib.blobMod.Blob = js.native
  def matchesData(data: ndnDashJsLib.dataMod.Data): scala.Boolean = js.native
  def matchesName(name: ndnDashJsLib.nameMod.Name): scala.Boolean = js.native
  def refreshNonce(): scala.Unit = js.native
  def setApplicationParameters(parameters: ndnDashJsLib.blobMod.Blob): Interest = js.native
  def setApplicationParameters(parameters: nodeLib.Buffer): Interest = js.native
  def setCanBePrefix(canBePrefix: scala.Boolean): Interest = js.native
  def setForwardingHint(fh: DelegationSet): Interest = js.native
  def setInterestLifetimeMilliseconds(lifetime: scala.Double): Interest = js.native
  def setMustBeFresh(mustBeFresh: scala.Boolean): Interest = js.native
  def setName(name: ndnDashJsLib.nameMod.Name): Interest = js.native
  def toUri(): java.lang.String = js.native
  def wireDecode(input: ndnDashJsLib.blobMod.Blob): scala.Unit = js.native
  def wireDecode(input: nodeLib.Buffer): scala.Unit = js.native
  def wireEncode(): ndnDashJsLib.blobMod.Blob = js.native
}


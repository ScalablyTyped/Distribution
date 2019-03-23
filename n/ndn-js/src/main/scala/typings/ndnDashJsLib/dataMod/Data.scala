package typings
package ndnDashJsLib.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/data", "Data")
@js.native
class Data () extends js.Object {
  def this(data: Data) = this()
  def this(name: java.lang.String) = this()
  def this(name: ndnDashJsLib.nameMod.Name) = this()
  def getCongestionMark(): scala.Double = js.native
  def getContent(): ndnDashJsLib.blobMod.Blob = js.native
  def getFullName(): ndnDashJsLib.nameMod.Name = js.native
  def getIncomingFaceId(): scala.Double = js.native
  def getMetaInfo(): MetaInfo = js.native
  def getName(): ndnDashJsLib.nameMod.Name = js.native
  def getSignature(): ndnDashJsLib.signatureMod.Signature = js.native
  def setContent(content: ndnDashJsLib.blobMod.Blob): Data = js.native
  def setContent(content: nodeLib.Buffer): Data = js.native
  def setMetaInfo(meta: MetaInfo): Data = js.native
  def setName(name: ndnDashJsLib.nameMod.Name): Data = js.native
  def setSignature(sig: ndnDashJsLib.signatureMod.Signature): Data = js.native
  def wireDecode(input: ndnDashJsLib.blobMod.Blob): scala.Unit = js.native
  def wireDecode(input: nodeLib.Buffer): scala.Unit = js.native
  def wireEncode(): ndnDashJsLib.blobMod.Blob = js.native
}


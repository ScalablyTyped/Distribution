package typings.ndnDashJs.dataMod

import typings.ndnDashJs.blobMod.Blob
import typings.ndnDashJs.nameMod.Name
import typings.ndnDashJs.signatureMod.Signature
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/data", "Data")
@js.native
class Data () extends js.Object {
  def this(data: Data) = this()
  def this(name: String) = this()
  def this(name: Name) = this()
  def getCongestionMark(): Double = js.native
  def getContent(): Blob = js.native
  def getFullName(): Name = js.native
  def getIncomingFaceId(): Double = js.native
  def getMetaInfo(): MetaInfo = js.native
  def getName(): Name = js.native
  def getSignature(): Signature = js.native
  def setContent(content: Blob): Data = js.native
  def setContent(content: Buffer): Data = js.native
  def setMetaInfo(meta: MetaInfo): Data = js.native
  def setName(name: Name): Data = js.native
  def setSignature(sig: Signature): Data = js.native
  def wireDecode(input: Blob): Unit = js.native
  def wireDecode(input: Buffer): Unit = js.native
  def wireEncode(): Blob = js.native
}


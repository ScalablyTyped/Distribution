package typings.ndnDashJs.signatureMod

import typings.ndnDashJs.blobMod.Blob
import typings.ndnDashJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "KeyLocator")
@js.native
class KeyLocator () extends js.Object {
  def this(kl: KeyLocator) = this()
  def clear(): Unit = js.native
  def getKeyData(): Blob = js.native
  def getKeyName(): Name = js.native
  def getType(): KeyLocatorType = js.native
  def setKeyData(keyData: Blob): Unit = js.native
  def setKeyName(name: Name): Unit = js.native
  def setType(`type`: KeyLocatorType): Unit = js.native
}


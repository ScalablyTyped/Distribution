package typings
package ndnDashJsLib.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "KeyLocator")
@js.native
class KeyLocator () extends js.Object {
  def this(kl: KeyLocator) = this()
  def clear(): scala.Unit = js.native
  def getKeyData(): ndnDashJsLib.blobMod.Blob = js.native
  def getKeyName(): ndnDashJsLib.nameMod.Name = js.native
  def getType(): KeyLocatorType = js.native
  def setKeyData(keyData: ndnDashJsLib.blobMod.Blob): scala.Unit = js.native
  def setKeyName(name: ndnDashJsLib.nameMod.Name): scala.Unit = js.native
  def setType(`type`: KeyLocatorType): scala.Unit = js.native
}


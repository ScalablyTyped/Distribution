package typings.nodeForge.mod.pkcs12

import typings.nodeForge.AnonEncrypted
import typings.nodeForge.AnonFriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkcs12Pfx extends js.Object {
  var safeContents: js.Array[AnonEncrypted]
  var version: String
  def getBags(filter: BagsFilter): AnonFriendlyName
  def getBagsByFriendlyName(fiendlyName: String, bagType: String): js.Array[Bag]
  def getBagsByLocalKeyId(localKeyId: String, bagType: String): js.Array[Bag]
}

object Pkcs12Pfx {
  @scala.inline
  def apply(
    getBags: BagsFilter => AnonFriendlyName,
    getBagsByFriendlyName: (String, String) => js.Array[Bag],
    getBagsByLocalKeyId: (String, String) => js.Array[Bag],
    safeContents: js.Array[AnonEncrypted],
    version: String
  ): Pkcs12Pfx = {
    val __obj = js.Dynamic.literal(getBags = js.Any.fromFunction1(getBags), getBagsByFriendlyName = js.Any.fromFunction2(getBagsByFriendlyName), getBagsByLocalKeyId = js.Any.fromFunction2(getBagsByLocalKeyId), safeContents = safeContents.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pkcs12Pfx]
  }
}


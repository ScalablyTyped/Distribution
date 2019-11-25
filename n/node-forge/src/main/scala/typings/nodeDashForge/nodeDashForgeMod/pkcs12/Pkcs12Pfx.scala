package typings.nodeDashForge.nodeDashForgeMod.pkcs12

import typings.nodeDashForge.Anon_Encrypted
import typings.nodeDashForge.Anon_FriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkcs12Pfx extends js.Object {
  var safeContents: js.Array[Anon_Encrypted]
  var version: String
  def getBags(filter: BagsFilter): Anon_FriendlyName
  def getBagsByFriendlyName(fiendlyName: String, bagType: String): js.Array[Bag]
  def getBagsByLocalKeyId(localKeyId: String, bagType: String): js.Array[Bag]
}

object Pkcs12Pfx {
  @scala.inline
  def apply(
    getBags: BagsFilter => Anon_FriendlyName,
    getBagsByFriendlyName: (String, String) => js.Array[Bag],
    getBagsByLocalKeyId: (String, String) => js.Array[Bag],
    safeContents: js.Array[Anon_Encrypted],
    version: String
  ): Pkcs12Pfx = {
    val __obj = js.Dynamic.literal(getBags = js.Any.fromFunction1(getBags), getBagsByFriendlyName = js.Any.fromFunction2(getBagsByFriendlyName), getBagsByLocalKeyId = js.Any.fromFunction2(getBagsByLocalKeyId), safeContents = safeContents.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pkcs12Pfx]
  }
}


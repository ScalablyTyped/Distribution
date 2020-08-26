package typings.nodeForge.mod.pkcs12

import typings.nodeForge.anon.Dictkey
import typings.nodeForge.anon.Encrypted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pkcs12Pfx extends js.Object {
  var safeContents: js.Array[Encrypted] = js.native
  var version: String = js.native
  def getBags(filter: BagsFilter): Dictkey = js.native
  def getBagsByFriendlyName(fiendlyName: String, bagType: String): js.Array[Bag] = js.native
  def getBagsByLocalKeyId(localKeyId: String, bagType: String): js.Array[Bag] = js.native
}

object Pkcs12Pfx {
  @scala.inline
  def apply(
    getBags: BagsFilter => Dictkey,
    getBagsByFriendlyName: (String, String) => js.Array[Bag],
    getBagsByLocalKeyId: (String, String) => js.Array[Bag],
    safeContents: js.Array[Encrypted],
    version: String
  ): Pkcs12Pfx = {
    val __obj = js.Dynamic.literal(getBags = js.Any.fromFunction1(getBags), getBagsByFriendlyName = js.Any.fromFunction2(getBagsByFriendlyName), getBagsByLocalKeyId = js.Any.fromFunction2(getBagsByLocalKeyId), safeContents = safeContents.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pkcs12Pfx]
  }
  @scala.inline
  implicit class Pkcs12PfxOps[Self <: Pkcs12Pfx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBags(value: BagsFilter => Dictkey): Self = this.set("getBags", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBagsByFriendlyName(value: (String, String) => js.Array[Bag]): Self = this.set("getBagsByFriendlyName", js.Any.fromFunction2(value))
    @scala.inline
    def setGetBagsByLocalKeyId(value: (String, String) => js.Array[Bag]): Self = this.set("getBagsByLocalKeyId", js.Any.fromFunction2(value))
    @scala.inline
    def setSafeContentsVarargs(value: Encrypted*): Self = this.set("safeContents", js.Array(value :_*))
    @scala.inline
    def setSafeContents(value: js.Array[Encrypted]): Self = this.set("safeContents", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


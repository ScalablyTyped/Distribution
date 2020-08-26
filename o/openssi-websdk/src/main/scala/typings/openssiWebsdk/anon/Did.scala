package typings.openssiWebsdk.anon

import typings.openssiWebsdk.mod.DID
import typings.openssiWebsdk.mod.Verkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Did extends js.Object {
  var did: DID = js.native
  var verkey: Verkey = js.native
}

object Did {
  @scala.inline
  def apply(did: DID, verkey: Verkey): Did = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Did]
  }
  @scala.inline
  implicit class DidOps[Self <: Did] (val x: Self) extends AnyVal {
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
    def setDid(value: DID): Self = this.set("did", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerkey(value: Verkey): Self = this.set("verkey", value.asInstanceOf[js.Any])
  }
  
}


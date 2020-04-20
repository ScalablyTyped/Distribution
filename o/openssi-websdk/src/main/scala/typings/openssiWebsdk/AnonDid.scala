package typings.openssiWebsdk

import typings.openssiWebsdk.mod.DID
import typings.openssiWebsdk.mod.Verkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDid extends js.Object {
  var did: DID
  var verkey: Verkey
}

object AnonDid {
  @scala.inline
  def apply(did: DID, verkey: Verkey): AnonDid = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDid]
  }
}


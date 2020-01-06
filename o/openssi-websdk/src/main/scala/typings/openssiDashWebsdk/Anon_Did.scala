package typings.openssiDashWebsdk

import typings.openssiDashWebsdk.openssiDashWebsdkMod.DID
import typings.openssiDashWebsdk.openssiDashWebsdkMod.Verkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Did extends js.Object {
  var did: DID
  var verkey: Verkey
}

object Anon_Did {
  @scala.inline
  def apply(did: DID, verkey: Verkey): Anon_Did = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Did]
  }
}


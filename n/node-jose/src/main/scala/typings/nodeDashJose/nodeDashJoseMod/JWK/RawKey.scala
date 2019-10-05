package typings.nodeDashJose.nodeDashJoseMod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawKey extends js.Object {
  var alg: String
  // e and n make up the public key
  var e: String
  var kty: String
  var n: String
  var use: KeyUse
}

object RawKey {
  @scala.inline
  def apply(alg: String, e: String, kty: String, n: String, use: KeyUse): RawKey = {
    val __obj = js.Dynamic.literal(alg = alg, e = e, kty = kty, n = n, use = use)
  
    __obj.asInstanceOf[RawKey]
  }
}


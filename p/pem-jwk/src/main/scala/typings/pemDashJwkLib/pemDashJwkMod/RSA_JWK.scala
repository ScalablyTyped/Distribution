package typings
package pemDashJwkLib.pemDashJwkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSA_JWK extends js.Object {
  var d: js.UndefOr[java.lang.String] = js.undefined
  var dp: js.UndefOr[java.lang.String] = js.undefined
  var dq: js.UndefOr[java.lang.String] = js.undefined
  var e: java.lang.String
  var kty: java.lang.String
  var n: java.lang.String
  var p: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var qi: js.UndefOr[java.lang.String] = js.undefined
}

object RSA_JWK {
  @scala.inline
  def apply(
    e: java.lang.String,
    kty: java.lang.String,
    n: java.lang.String,
    d: java.lang.String = null,
    dp: java.lang.String = null,
    dq: java.lang.String = null,
    p: java.lang.String = null,
    q: java.lang.String = null,
    qi: java.lang.String = null
  ): RSA_JWK = {
    val __obj = js.Dynamic.literal(e = e, kty = kty, n = n)
    if (d != null) __obj.updateDynamic("d")(d)
    if (dp != null) __obj.updateDynamic("dp")(dp)
    if (dq != null) __obj.updateDynamic("dq")(dq)
    if (p != null) __obj.updateDynamic("p")(p)
    if (q != null) __obj.updateDynamic("q")(q)
    if (qi != null) __obj.updateDynamic("qi")(qi)
    __obj.asInstanceOf[RSA_JWK]
  }
}


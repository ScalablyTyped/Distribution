package typings
package openidDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codeverifier extends js.Object {
  val code_verifier: js.UndefOr[java.lang.String] = js.undefined
  val max_age: js.UndefOr[scala.Double] = js.undefined
  val nonce: js.UndefOr[java.lang.String] = js.undefined
  val response_type: js.UndefOr[java.lang.String] = js.undefined
  val state: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Codeverifier {
  @scala.inline
  def apply(
    code_verifier: java.lang.String = null,
    max_age: scala.Int | scala.Double = null,
    nonce: java.lang.String = null,
    response_type: java.lang.String = null,
    state: java.lang.String = null
  ): Anon_Codeverifier = {
    val __obj = js.Dynamic.literal()
    if (code_verifier != null) __obj.updateDynamic("code_verifier")(code_verifier)
    if (max_age != null) __obj.updateDynamic("max_age")(max_age.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Codeverifier]
  }
}


package typings.openidDashClient

import typings.openidDashClient.openidDashClientMod.RetryFunction
import typings.openidDashClient.openidDashClientNumbers.`408`
import typings.openidDashClient.openidDashClientNumbers.`413`
import typings.openidDashClient.openidDashClientNumbers.`429`
import typings.openidDashClient.openidDashClientNumbers.`500`
import typings.openidDashClient.openidDashClientNumbers.`502`
import typings.openidDashClient.openidDashClientNumbers.`503`
import typings.openidDashClient.openidDashClientNumbers.`504`
import typings.openidDashClient.openidDashClientStrings.DELETE
import typings.openidDashClient.openidDashClientStrings.GET
import typings.openidDashClient.openidDashClientStrings.HEAD
import typings.openidDashClient.openidDashClientStrings.OPTIONS
import typings.openidDashClient.openidDashClientStrings.POST
import typings.openidDashClient.openidDashClientStrings.PUT
import typings.openidDashClient.openidDashClientStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_408 extends js.Object {
  var errorCodes: js.UndefOr[js.Array[String]] = js.undefined
  var maxRetryAfter: js.UndefOr[Double] = js.undefined
  var methods: js.UndefOr[js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE]] = js.undefined
  var retries: js.UndefOr[Double | RetryFunction] = js.undefined
  var statusCodes: js.UndefOr[js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`]] = js.undefined
}

object Anon_408 {
  @scala.inline
  def apply(
    errorCodes: js.Array[String] = null,
    maxRetryAfter: Int | Double = null,
    methods: js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE] = null,
    retries: Double | RetryFunction = null,
    statusCodes: js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`] = null
  ): Anon_408 = {
    val __obj = js.Dynamic.literal()
    if (errorCodes != null) __obj.updateDynamic("errorCodes")(errorCodes)
    if (maxRetryAfter != null) __obj.updateDynamic("maxRetryAfter")(maxRetryAfter.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (statusCodes != null) __obj.updateDynamic("statusCodes")(statusCodes)
    __obj.asInstanceOf[Anon_408]
  }
}


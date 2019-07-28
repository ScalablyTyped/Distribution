package typings.atOctokitRest.atOctokitRestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atOctokitRest.Anon_Agent
import typings.atOctokitRest.Anon_ClientId
import typings.atOctokitRest.Anon_Debug
import typings.atOctokitRest.Anon_On2fa
import typings.atOctokitRest.Fn_Promise
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends  // Deprecated
/* option */ StringDictionary[js.Any] {
   // Deprecated
  var agent: js.UndefOr[Agent] = js.undefined
  var auth: js.UndefOr[String | Anon_On2fa | Anon_ClientId | Fn_Promise] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
   // Deprecated
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var log: js.UndefOr[Anon_Debug] = js.undefined
  var previews: js.UndefOr[js.Array[String]] = js.undefined
  var request: js.UndefOr[Anon_Agent] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary:  // Deprecated
  /* option */ StringDictionary[js.Any] = null,
    agent: Agent = null,
    auth: String | Anon_On2fa | Anon_ClientId | Fn_Promise = null,
    baseUrl: String = null,
    headers: StringDictionary[js.Any] = null,
    log: Anon_Debug = null,
    previews: js.Array[String] = null,
    request: Anon_Agent = null,
    timeout: Int | Double = null,
    userAgent: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (log != null) __obj.updateDynamic("log")(log)
    if (previews != null) __obj.updateDynamic("previews")(previews)
    if (request != null) __obj.updateDynamic("request")(request)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[Options]
  }
}


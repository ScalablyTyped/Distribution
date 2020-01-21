package typings.octokitRest.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.octokitRest.AnonAgent
import typings.octokitRest.AnonClientId
import typings.octokitRest.AnonDebug
import typings.octokitRest.AnonOn2fa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* option */ StringDictionary[js.Any] {
  /**
    * @deprecated Use {request: {agent}} instead. See https://github.com/octokit/request.js#request
    */
  var agent: js.UndefOr[Agent] = js.undefined
  var auth: js.UndefOr[String | AnonOn2fa | AnonClientId | (js.Function0[String | js.Promise[String]])] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Use {userAgent, previews} instead. See https://github.com/octokit/request.js#request
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var log: js.UndefOr[AnonDebug] = js.undefined
  var previews: js.UndefOr[js.Array[String]] = js.undefined
  var request: js.UndefOr[AnonAgent] = js.undefined
  /**
    * @deprecated Use {request: {timeout}} instead. See https://github.com/octokit/request.js#request
    */
  var timeout: js.UndefOr[Double] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.Any] = null,
    agent: Agent = null,
    auth: String | AnonOn2fa | AnonClientId | (js.Function0[String | js.Promise[String]]) = null,
    baseUrl: String = null,
    headers: StringDictionary[js.Any] = null,
    log: AnonDebug = null,
    previews: js.Array[String] = null,
    request: AnonAgent = null,
    timeout: Int | Double = null,
    userAgent: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (previews != null) __obj.updateDynamic("previews")(previews.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends  // Deprecated
/* option */ org.scalablytyped.runtime.StringDictionary[js.Any] {
   // Deprecated
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var auth: js.UndefOr[
    java.lang.String | atOctokitRestLib.Anon_On2fa | atOctokitRestLib.Anon_ClientId | atOctokitRestLib.Anon_Promise
  ] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
   // Deprecated
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var log: js.UndefOr[atOctokitRestLib.Anon_Debug] = js.undefined
  var previews: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var request: js.UndefOr[atOctokitRestLib.Anon_Agent] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary:  // Deprecated
  /* option */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    agent: nodeLib.httpMod.Agent = null,
    auth: java.lang.String | atOctokitRestLib.Anon_On2fa | atOctokitRestLib.Anon_ClientId | atOctokitRestLib.Anon_Promise = null,
    baseUrl: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    log: atOctokitRestLib.Anon_Debug = null,
    previews: js.Array[java.lang.String] = null,
    request: atOctokitRestLib.Anon_Agent = null,
    timeout: scala.Int | scala.Double = null,
    userAgent: java.lang.String = null
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


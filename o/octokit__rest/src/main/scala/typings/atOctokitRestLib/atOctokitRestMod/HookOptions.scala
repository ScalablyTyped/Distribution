package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptions
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var baseUrl: java.lang.String
  var data: js.Any
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var method: java.lang.String
  // See https://Octokit.com/bitinn/node-fetch#options
  var request: atOctokitRestLib.Anon_AgentCompress
  var url: java.lang.String
}

object HookOptions {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    data: js.Any,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    method: java.lang.String,
    request: atOctokitRestLib.Anon_AgentCompress,
    url: java.lang.String,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): HookOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, data = data, headers = headers, method = method, request = request, url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HookOptions]
  }
}


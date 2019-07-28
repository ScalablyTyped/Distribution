package typings.atOctokitRest.atOctokitRestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atOctokitRest.Anon_AgentCompress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptions
  extends /* index */ StringDictionary[js.Any] {
  var baseUrl: String
  var data: js.Any
  var headers: StringDictionary[String]
  var method: String
  // See https://github.com/bitinn/node-fetch#options
  var request: Anon_AgentCompress
  var url: String
}

object HookOptions {
  @scala.inline
  def apply(
    baseUrl: String,
    data: js.Any,
    headers: StringDictionary[String],
    method: String,
    request: Anon_AgentCompress,
    url: String,
    StringDictionary: /* index */ StringDictionary[js.Any] = null
  ): HookOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, data = data, headers = headers, method = method, request = request, url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HookOptions]
  }
}


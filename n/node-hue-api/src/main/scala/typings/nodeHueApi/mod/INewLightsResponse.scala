package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHueApi.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INewLightsResponse extends /* key */ StringDictionary[String | AnonName] {
  var lastscan: String
}

object INewLightsResponse {
  @scala.inline
  def apply(lastscan: String, StringDictionary: /* key */ StringDictionary[String | AnonName] = null): INewLightsResponse = {
    val __obj = js.Dynamic.literal(lastscan = lastscan.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[INewLightsResponse]
  }
}


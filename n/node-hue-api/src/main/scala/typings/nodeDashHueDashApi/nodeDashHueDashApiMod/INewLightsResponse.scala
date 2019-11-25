package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashHueDashApi.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INewLightsResponse extends /* key */ StringDictionary[String | Anon_Name] {
  var lastscan: String
}

object INewLightsResponse {
  @scala.inline
  def apply(lastscan: String, StringDictionary: /* key */ StringDictionary[String | Anon_Name] = null): INewLightsResponse = {
    val __obj = js.Dynamic.literal(lastscan = lastscan.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[INewLightsResponse]
  }
}


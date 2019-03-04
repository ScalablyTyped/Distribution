package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INewLightsResponse
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | nodeDashHueDashApiLib.Anon_Name] {
  var lastscan: java.lang.String
}

object INewLightsResponse {
  @scala.inline
  def apply(
    lastscan: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | nodeDashHueDashApiLib.Anon_Name] = null
  ): INewLightsResponse = {
    val __obj = js.Dynamic.literal(lastscan = lastscan)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[INewLightsResponse]
  }
}


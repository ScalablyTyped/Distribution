package typings.nodeHueApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends /* key */ StringDictionary[Double | String] {
  var lastupdated: String
}

object AnonKey {
  @scala.inline
  def apply(lastupdated: String, StringDictionary: /* key */ StringDictionary[Double | String] = null): AnonKey = {
    val __obj = js.Dynamic.literal(lastupdated = lastupdated.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKey]
  }
}


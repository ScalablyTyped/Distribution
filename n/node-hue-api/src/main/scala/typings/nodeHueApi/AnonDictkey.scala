package typings.nodeHueApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey extends /* key */ StringDictionary[Double | String] {
  var lastupdated: String
}

object AnonDictkey {
  @scala.inline
  def apply(lastupdated: String, StringDictionary: /* key */ StringDictionary[Double | String] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal(lastupdated = lastupdated.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}


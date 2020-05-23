package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[Double | String] {
  var lastupdated: String
}

object Dictkey {
  @scala.inline
  def apply(lastupdated: String, StringDictionary: /* key */ StringDictionary[Double | String] = null): Dictkey = {
    val __obj = js.Dynamic.literal(lastupdated = lastupdated.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}


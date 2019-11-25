package typings.nodeDashHueDashApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends /* key */ StringDictionary[Double | String] {
  var lastupdated: String
}

object Anon_Key {
  @scala.inline
  def apply(lastupdated: String, StringDictionary: /* key */ StringDictionary[Double | String] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(lastupdated = lastupdated.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}


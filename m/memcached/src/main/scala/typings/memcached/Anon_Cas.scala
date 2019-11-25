package typings.memcached

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cas
  extends /* key */ StringDictionary[js.Any] {
  var cas: String
}

object Anon_Cas {
  @scala.inline
  def apply(cas: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Cas = {
    val __obj = js.Dynamic.literal(cas = cas.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Cas]
  }
}


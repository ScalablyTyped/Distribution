package typings.memcached

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCas
  extends /* key */ StringDictionary[js.Any] {
  var cas: String
}

object AnonCas {
  @scala.inline
  def apply(cas: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonCas = {
    val __obj = js.Dynamic.literal(cas = cas.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCas]
  }
}


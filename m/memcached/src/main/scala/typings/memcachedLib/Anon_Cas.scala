package typings
package memcachedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cas
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cas: java.lang.String
}

object Anon_Cas {
  @scala.inline
  def apply(
    cas: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Cas = {
    val __obj = js.Dynamic.literal(cas = cas)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Cas]
  }
}


package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyLevel
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var level: js.UndefOr[pinoLib.pinoMod.PNs.Level | java.lang.String] = js.undefined
  var serializers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[pinoLib.pinoMod.PNs.SerializerFn]] = js.undefined
}

object Anon_KeyLevel {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    level: pinoLib.pinoMod.PNs.Level | java.lang.String = null,
    serializers: org.scalablytyped.runtime.StringDictionary[pinoLib.pinoMod.PNs.SerializerFn] = null
  ): Anon_KeyLevel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    __obj.asInstanceOf[Anon_KeyLevel]
  }
}


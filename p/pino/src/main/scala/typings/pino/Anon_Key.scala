package typings.pino

import org.scalablytyped.runtime.StringDictionary
import typings.pino.pinoMod.Level
import typings.pino.pinoMod.SerializerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var level: js.UndefOr[Level | String] = js.undefined
  var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    level: Level | String = null,
    serializers: StringDictionary[SerializerFn] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    __obj.asInstanceOf[Anon_Key]
  }
}


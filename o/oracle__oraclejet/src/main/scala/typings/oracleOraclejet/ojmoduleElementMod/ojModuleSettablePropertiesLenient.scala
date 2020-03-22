package typings.oracleOraclejet.ojmoduleElementMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonCleanupMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmodule-element.ojModuleSettableProperties> */
trait ojModuleSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var animation: js.UndefOr[js.Object] = js.undefined
  var config: js.UndefOr[AnonCleanupMode] = js.undefined
}

object ojModuleSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: js.Object = null,
    config: AnonCleanupMode = null
  ): ojModuleSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojModuleSettablePropertiesLenient]
  }
}


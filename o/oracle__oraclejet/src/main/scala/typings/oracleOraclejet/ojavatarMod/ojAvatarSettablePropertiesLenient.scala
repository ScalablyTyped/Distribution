package typings.oracleOraclejet.ojavatarMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.lg
import typings.oracleOraclejet.oracleOraclejetStrings.md
import typings.oracleOraclejet.oracleOraclejetStrings.sm
import typings.oracleOraclejet.oracleOraclejetStrings.xl
import typings.oracleOraclejet.oracleOraclejetStrings.xs
import typings.oracleOraclejet.oracleOraclejetStrings.xxl
import typings.oracleOraclejet.oracleOraclejetStrings.xxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojavatar.ojAvatarSettableProperties> */
trait ojAvatarSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var initials: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[xxs | xs | sm | md | lg | xl | xxl] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object ojAvatarSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    initials: String = null,
    size: xxs | xs | sm | md | lg | xl | xxl = null,
    src: String = null
  ): ojAvatarSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (initials != null) __obj.updateDynamic("initials")(initials.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojAvatarSettablePropertiesLenient]
  }
}


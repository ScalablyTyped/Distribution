package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions
  extends /* key */ StringDictionary[js.Any] {
  var openOptions: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
}

object OpenOptions {
  @scala.inline
  def apply(
    openOptions: typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): OpenOptions = {
    val __obj = js.Dynamic.literal(openOptions = openOptions.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OpenOptions]
  }
}


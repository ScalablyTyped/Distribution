package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.after
import typings.oracleOraclejet.oracleOraclejetStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPosition
  extends /* key */ StringDictionary[js.Any] {
  var item: typings.std.Element
  var position: before | after
  var reference: typings.std.Element
}

object ItemPosition {
  @scala.inline
  def apply(
    item: typings.std.Element,
    position: before | after,
    reference: typings.std.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): ItemPosition = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ItemPosition]
  }
}


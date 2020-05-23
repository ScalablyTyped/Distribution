package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference
  extends /* key */ StringDictionary[js.Any] {
  var items: js.Array[typings.std.Element]
  var position: String
  var reference: typings.std.Element
}

object Reference {
  @scala.inline
  def apply(
    items: js.Array[typings.std.Element],
    position: String,
    reference: typings.std.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Reference = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Reference]
  }
}


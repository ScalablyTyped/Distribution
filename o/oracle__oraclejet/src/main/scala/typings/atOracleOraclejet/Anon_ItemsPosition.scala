package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsPosition
  extends /* propName */ StringDictionary[js.Any] {
  var items: js.Array[Element]
  var position: String
  var reference: Element
}

object Anon_ItemsPosition {
  @scala.inline
  def apply(
    items: js.Array[Element],
    position: String,
    reference: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ItemsPosition = {
    val __obj = js.Dynamic.literal(items = items, position = position, reference = reference)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ItemsPosition]
  }
}


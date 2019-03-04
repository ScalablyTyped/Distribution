package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsPosition
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var items: js.Array[stdLib.Element]
  var position: java.lang.String
  var reference: stdLib.Element
}

object Anon_ItemsPosition {
  @scala.inline
  def apply(
    items: js.Array[stdLib.Element],
    position: java.lang.String,
    reference: stdLib.Element,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ItemsPosition = {
    val __obj = js.Dynamic.literal(items = items, position = position, reference = reference)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ItemsPosition]
  }
}


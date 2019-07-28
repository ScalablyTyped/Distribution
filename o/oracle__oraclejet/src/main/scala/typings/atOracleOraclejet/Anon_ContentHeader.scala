package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentHeader
  extends /* propName */ StringDictionary[js.Any] {
  var content: Element
  var header: Element
}

object Anon_ContentHeader {
  @scala.inline
  def apply(
    content: Element,
    header: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ContentHeader = {
    val __obj = js.Dynamic.literal(content = content, header = header)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ContentHeader]
  }
}


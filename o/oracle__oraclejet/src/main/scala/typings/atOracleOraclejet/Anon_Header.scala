package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header
  extends /* propName */ StringDictionary[js.Any] {
  var header: String | Double
  var newDimensions: Anon_Height
  var oldDimensions: Anon_Height
}

object Anon_Header {
  @scala.inline
  def apply(
    header: String | Double,
    newDimensions: Anon_Height,
    oldDimensions: Anon_Height,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], newDimensions = newDimensions, oldDimensions = oldDimensions)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Header]
  }
}


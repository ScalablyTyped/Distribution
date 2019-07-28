package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MajorAxisScale
  extends /* propName */ StringDictionary[js.Any] {
  var majorAxisScale: String
  var minorAxisScale: String
  var viewportEnd: String
  var viewportStart: String
}

object Anon_MajorAxisScale {
  @scala.inline
  def apply(
    majorAxisScale: String,
    minorAxisScale: String,
    viewportEnd: String,
    viewportStart: String,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_MajorAxisScale = {
    val __obj = js.Dynamic.literal(majorAxisScale = majorAxisScale, minorAxisScale = minorAxisScale, viewportEnd = viewportEnd, viewportStart = viewportStart)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_MajorAxisScale]
  }
}


package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MajorAxisScale
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var majorAxisScale: java.lang.String
  var minorAxisScale: java.lang.String
  var viewportEnd: java.lang.String
  var viewportStart: java.lang.String
}

object Anon_MajorAxisScale {
  @scala.inline
  def apply(
    majorAxisScale: java.lang.String,
    minorAxisScale: java.lang.String,
    viewportEnd: java.lang.String,
    viewportStart: java.lang.String,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_MajorAxisScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("majorAxisScale")(majorAxisScale)
    __obj.updateDynamic("minorAxisScale")(minorAxisScale)
    __obj.updateDynamic("viewportEnd")(viewportEnd)
    __obj.updateDynamic("viewportStart")(viewportStart)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_MajorAxisScale]
  }
}


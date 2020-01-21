package typings.octokitEndpoint

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQ
  extends /* x */ StringDictionary[js.UndefOr[String]] {
  var q: js.UndefOr[String] = js.undefined
}

object AnonQ {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.UndefOr[String]] = null, q: String = null): AnonQ = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQ]
  }
}


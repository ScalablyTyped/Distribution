package typings.octokitEndpoint.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictx
  extends /* x */ StringDictionary[js.UndefOr[String]] {
  var q: js.UndefOr[String] = js.undefined
}

object Dictx {
  @scala.inline
  def apply(StringDictionary: /* header */ StringDictionary[js.UndefOr[String]] = null, q: String = null): Dictx = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
}


package typings.nodePolyglot.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodePolyglot.AnonLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationOptions
  extends /* interpolationKey */ StringDictionary[js.Any] {
  @JSName("_")
  var _underscore: js.UndefOr[String] = js.undefined
  var smart_count: js.UndefOr[Double | AnonLength] = js.undefined
}

object InterpolationOptions {
  @scala.inline
  def apply(
    StringDictionary: /* interpolationKey */ StringDictionary[js.Any] = null,
    _underscore: String = null,
    smart_count: Double | AnonLength = null
  ): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_underscore != null) __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (smart_count != null) __obj.updateDynamic("smart_count")(smart_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationOptions]
  }
}


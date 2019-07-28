package typings.nodeDashPolyglot.nodeDashPolyglotMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashPolyglot.Anon_Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationOptions
  extends /* interpolationKey */ StringDictionary[js.Any] {
  var `_`: js.UndefOr[String] = js.undefined
  var smart_count: js.UndefOr[Double | Anon_Length] = js.undefined
}

object InterpolationOptions {
  @scala.inline
  def apply(
    StringDictionary: /* interpolationKey */ StringDictionary[js.Any] = null,
    `_`: String = null,
    smart_count: Double | Anon_Length = null
  ): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`_` != null) __obj.updateDynamic("_")(`_`)
    if (smart_count != null) __obj.updateDynamic("smart_count")(smart_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationOptions]
  }
}


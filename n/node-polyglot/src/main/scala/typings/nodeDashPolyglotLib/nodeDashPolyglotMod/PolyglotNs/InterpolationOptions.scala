package typings
package nodeDashPolyglotLib.nodeDashPolyglotMod.PolyglotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationOptions
  extends /* interpolationKey */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `_`: js.UndefOr[java.lang.String] = js.undefined
  var smart_count: js.UndefOr[scala.Double | nodeDashPolyglotLib.Anon_Length] = js.undefined
}

object InterpolationOptions {
  @scala.inline
  def apply(
    StringDictionary: /* interpolationKey */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `_`: java.lang.String = null,
    smart_count: scala.Double | nodeDashPolyglotLib.Anon_Length = null
  ): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`_` != null) __obj.updateDynamic("_")(`_`)
    if (smart_count != null) __obj.updateDynamic("smart_count")(smart_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationOptions]
  }
}


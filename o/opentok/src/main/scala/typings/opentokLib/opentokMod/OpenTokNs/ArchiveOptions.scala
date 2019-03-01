package typings
package opentokLib.opentokMod.OpenTokNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveOptions extends js.Object {
  var hasAudio: js.UndefOr[scala.Boolean] = js.undefined
  var hasVideo: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[ArchiveLayoutOptions] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var outputMode: js.UndefOr[OutputMode] = js.undefined
}

object ArchiveOptions {
  @scala.inline
  def apply(
    hasAudio: js.UndefOr[scala.Boolean] = js.undefined,
    hasVideo: js.UndefOr[scala.Boolean] = js.undefined,
    layout: ArchiveLayoutOptions = null,
    name: java.lang.String = null,
    outputMode: OutputMode = null
  ): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasAudio)) __obj.updateDynamic("hasAudio")(hasAudio)
    if (!js.isUndefined(hasVideo)) __obj.updateDynamic("hasVideo")(hasVideo)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (name != null) __obj.updateDynamic("name")(name)
    if (outputMode != null) __obj.updateDynamic("outputMode")(outputMode)
    __obj.asInstanceOf[ArchiveOptions]
  }
}


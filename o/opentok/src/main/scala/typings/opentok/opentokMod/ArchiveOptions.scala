package typings.opentok.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveOptions extends js.Object {
  var hasAudio: js.UndefOr[Boolean] = js.undefined
  var hasVideo: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[ArchiveLayoutOptions] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outputMode: js.UndefOr[OutputMode] = js.undefined
}

object ArchiveOptions {
  @scala.inline
  def apply(
    hasAudio: js.UndefOr[Boolean] = js.undefined,
    hasVideo: js.UndefOr[Boolean] = js.undefined,
    layout: ArchiveLayoutOptions = null,
    name: String = null,
    outputMode: OutputMode = null
  ): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasAudio)) __obj.updateDynamic("hasAudio")(hasAudio.asInstanceOf[js.Any])
    if (!js.isUndefined(hasVideo)) __obj.updateDynamic("hasVideo")(hasVideo.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputMode != null) __obj.updateDynamic("outputMode")(outputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveOptions]
  }
}


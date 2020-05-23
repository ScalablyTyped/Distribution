package typings.nodeWgetPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnProgress extends js.Object {
  var onProgress: js.UndefOr[js.Any] = js.undefined
  var onStart: js.UndefOr[js.Any] = js.undefined
  var output: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object OnProgress {
  @scala.inline
  def apply(
    onProgress: js.Any = null,
    onStart: js.Any = null,
    output: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): OnProgress = {
    val __obj = js.Dynamic.literal()
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(onStart.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgress]
  }
}


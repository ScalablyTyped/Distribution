package typings
package nodeDashWgetDashPromiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnProgress extends js.Object {
  var onProgress: js.UndefOr[js.Any] = js.undefined
  var onStart: js.UndefOr[js.Any] = js.undefined
  var output: js.UndefOr[java.lang.String] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_OnProgress {
  @scala.inline
  def apply(
    onProgress: js.Any = null,
    onStart: js.Any = null,
    output: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_OnProgress = {
    val __obj = js.Dynamic.literal()
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_OnProgress]
  }
}


package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends js.Object {
  var chunkSizeIncrement: js.UndefOr[scala.Double] = js.undefined
  var end: js.UndefOr[js.Any] = js.undefined
  var initialChunkSize: js.UndefOr[scala.Double] = js.undefined
  var maxChunkSize: js.UndefOr[scala.Double] = js.undefined
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  var returnCiphertext: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    chunkSizeIncrement: scala.Int | scala.Double = null,
    end: js.Any = null,
    initialChunkSize: scala.Int | scala.Double = null,
    maxChunkSize: scala.Int | scala.Double = null,
    maxConnections: scala.Int | scala.Double = null,
    returnCiphertext: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Any = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSizeIncrement != null) __obj.updateDynamic("chunkSizeIncrement")(chunkSizeIncrement.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end)
    if (initialChunkSize != null) __obj.updateDynamic("initialChunkSize")(initialChunkSize.asInstanceOf[js.Any])
    if (maxChunkSize != null) __obj.updateDynamic("maxChunkSize")(maxChunkSize.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (!js.isUndefined(returnCiphertext)) __obj.updateDynamic("returnCiphertext")(returnCiphertext)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[DownloadOptions]
  }
}


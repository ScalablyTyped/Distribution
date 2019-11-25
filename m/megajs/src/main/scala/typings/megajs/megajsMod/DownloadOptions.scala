package typings.megajs.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends js.Object {
  var chunkSizeIncrement: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[js.Any] = js.undefined
  var initialChunkSize: js.UndefOr[Double] = js.undefined
  var maxChunkSize: js.UndefOr[Double] = js.undefined
  var maxConnections: js.UndefOr[Double] = js.undefined
  var returnCiphertext: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    chunkSizeIncrement: Int | Double = null,
    end: js.Any = null,
    initialChunkSize: Int | Double = null,
    maxChunkSize: Int | Double = null,
    maxConnections: Int | Double = null,
    returnCiphertext: js.UndefOr[Boolean] = js.undefined,
    start: js.Any = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSizeIncrement != null) __obj.updateDynamic("chunkSizeIncrement")(chunkSizeIncrement.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initialChunkSize != null) __obj.updateDynamic("initialChunkSize")(initialChunkSize.asInstanceOf[js.Any])
    if (maxChunkSize != null) __obj.updateDynamic("maxChunkSize")(maxChunkSize.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (!js.isUndefined(returnCiphertext)) __obj.updateDynamic("returnCiphertext")(returnCiphertext.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}


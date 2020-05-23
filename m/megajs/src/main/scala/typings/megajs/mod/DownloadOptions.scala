package typings.megajs.mod

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
    chunkSizeIncrement: js.UndefOr[Double] = js.undefined,
    end: js.Any = null,
    initialChunkSize: js.UndefOr[Double] = js.undefined,
    maxChunkSize: js.UndefOr[Double] = js.undefined,
    maxConnections: js.UndefOr[Double] = js.undefined,
    returnCiphertext: js.UndefOr[Boolean] = js.undefined,
    start: js.Any = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSizeIncrement)) __obj.updateDynamic("chunkSizeIncrement")(chunkSizeIncrement.get.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(initialChunkSize)) __obj.updateDynamic("initialChunkSize")(initialChunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxChunkSize)) __obj.updateDynamic("maxChunkSize")(maxChunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnCiphertext)) __obj.updateDynamic("returnCiphertext")(returnCiphertext.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}


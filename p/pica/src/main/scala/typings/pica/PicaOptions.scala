package typings.pica

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PicaOptions extends js.Object {
  // max webworkers pool size. Default is autodetected CPU count, but not more than 4.
  var concurrency: js.UndefOr[Double] = js.undefined
  // list of features to use.
  // Default is [ 'js', 'wasm', 'ww' ]. Can be [ 'js', 'wasm', 'cib', 'ww' ] or [ 'all' ].
  // Note, resize via createImageBitmap() ('cib') disabled by default due problems with quality.
  var features: js.UndefOr[js.Array[String]] = js.undefined
  // cache timeout, ms. Webworkers create is not fast.
  // This option allow reuse webworkers effectively. Default 2000.
  var idle: js.UndefOr[Double] = js.undefined
  // tile width/height.
  // Images are processed by regions, to restrict peak memory use. Default 1024.
  var tile: js.UndefOr[Double] = js.undefined
}

object PicaOptions {
  @scala.inline
  def apply(
    concurrency: Int | Double = null,
    features: js.Array[String] = null,
    idle: Int | Double = null,
    tile: Int | Double = null
  ): PicaOptions = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (idle != null) __obj.updateDynamic("idle")(idle.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicaOptions]
  }
}


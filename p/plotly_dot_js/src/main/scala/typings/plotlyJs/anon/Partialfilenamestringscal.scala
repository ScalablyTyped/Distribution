package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.jpeg
import typings.plotlyJs.plotlyJsStrings.png
import typings.plotlyJs.plotlyJsStrings.svg
import typings.plotlyJs.plotlyJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  filename  :string,   scale  :number,   format  :'png' | 'svg' | 'jpeg' | 'webp',   height  :number,   width  :number}> */
trait Partialfilenamestringscal extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[png | svg | jpeg | webp] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Partialfilenamestringscal {
  @scala.inline
  def apply(
    filename: String = null,
    format: png | svg | jpeg | webp = null,
    height: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Partialfilenamestringscal = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialfilenamestringscal]
  }
}


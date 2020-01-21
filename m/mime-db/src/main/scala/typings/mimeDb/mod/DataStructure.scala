package typings.mimeDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStructure extends js.Object {
  /** the default charset associated with this type, if any. */
  var charset: js.UndefOr[String] = js.undefined
  /** whether a file of this type can be gzipped. */
  var compressible: js.UndefOr[Boolean] = js.undefined
  /** known extensions associated with this mime type. */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  /** where the mime type is defined. If not set, it's probably a custom media type. */
  var source: js.UndefOr[String] = js.undefined
}

object DataStructure {
  @scala.inline
  def apply(
    charset: String = null,
    compressible: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    source: String = null
  ): DataStructure = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compressible)) __obj.updateDynamic("compressible")(compressible.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStructure]
  }
}


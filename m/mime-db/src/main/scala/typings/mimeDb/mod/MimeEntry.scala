package typings.mimeDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/jshttp/mime-db#data-structure}
  */
trait MimeEntry extends js.Object {
  /** The default charset associated with this type, if any. */
  val charset: js.UndefOr[String] = js.undefined
  /** Whether a file of this type can be gzipped. */
  val compressible: js.UndefOr[Boolean] = js.undefined
  /** Known extensions associated with this mime type. */
  val extensions: js.UndefOr[js.Array[String]] = js.undefined
  /** Where the mime type is defined. If not set, it's probably a custom media type. */
  val source: js.UndefOr[String] = js.undefined
}

object MimeEntry {
  @scala.inline
  def apply(
    charset: String = null,
    compressible: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    source: String = null
  ): MimeEntry = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compressible)) __obj.updateDynamic("compressible")(compressible.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeEntry]
  }
}


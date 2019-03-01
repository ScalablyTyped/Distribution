package typings
package mimeDashDbLib.mimeDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStructure extends js.Object {
  /** the default charset associated with this type, if any. */
  var charset: js.UndefOr[java.lang.String] = js.undefined
  /** whether a file of this type can be gzipped. */
  var compressible: js.UndefOr[scala.Boolean] = js.undefined
  /** known extensions associated with this mime type. */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** where the mime type is defined. If not set, it's probably a custom media type. */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object DataStructure {
  @scala.inline
  def apply(
    charset: java.lang.String = null,
    compressible: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[java.lang.String] = null,
    source: java.lang.String = null
  ): DataStructure = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (!js.isUndefined(compressible)) __obj.updateDynamic("compressible")(compressible)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[DataStructure]
  }
}


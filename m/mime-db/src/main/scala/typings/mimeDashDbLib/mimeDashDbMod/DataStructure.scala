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


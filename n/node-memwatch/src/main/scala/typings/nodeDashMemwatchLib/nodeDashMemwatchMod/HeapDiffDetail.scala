package typings
package nodeDashMemwatchLib.nodeDashMemwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapDiffDetail extends js.Object {
  var `+`: scala.Double
  var `-`: scala.Double
  var size: java.lang.String
  var size_bytes: scala.Double
  var what: java.lang.String
}

object HeapDiffDetail {
  @scala.inline
  def apply(
    `+`: scala.Double,
    `-`: scala.Double,
    size: java.lang.String,
    size_bytes: scala.Double,
    what: java.lang.String
  ): HeapDiffDetail = {
    val __obj = js.Dynamic.literal(size = size, size_bytes = size_bytes, what = what)
    __obj.updateDynamic("+")(`+`)
    __obj.updateDynamic("-")(`-`)
    __obj.asInstanceOf[HeapDiffDetail]
  }
}


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
    val __obj = js.Dynamic.literal(`+` = `+`, `-` = `-`)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("size_bytes")(size_bytes)
    __obj.updateDynamic("what")(what)
    __obj.asInstanceOf[HeapDiffDetail]
  }
}


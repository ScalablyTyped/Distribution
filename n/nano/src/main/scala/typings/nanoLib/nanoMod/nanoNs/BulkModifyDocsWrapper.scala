package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkModifyDocsWrapper extends js.Object {
  var docs: js.Array[_]
}

object BulkModifyDocsWrapper {
  @scala.inline
  def apply(docs: js.Array[_]): BulkModifyDocsWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("docs")(docs)
    __obj.asInstanceOf[BulkModifyDocsWrapper]
  }
}


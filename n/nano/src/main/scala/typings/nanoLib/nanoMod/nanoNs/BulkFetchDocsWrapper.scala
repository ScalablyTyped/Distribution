package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkFetchDocsWrapper extends js.Object {
  var keys: js.Array[java.lang.String]
}

object BulkFetchDocsWrapper {
  @scala.inline
  def apply(keys: js.Array[java.lang.String]): BulkFetchDocsWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keys")(keys)
    __obj.asInstanceOf[BulkFetchDocsWrapper]
  }
}


package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkFetchDocsWrapper extends js.Object {
  var keys: js.Array[String]
}

object BulkFetchDocsWrapper {
  @scala.inline
  def apply(keys: js.Array[String]): BulkFetchDocsWrapper = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BulkFetchDocsWrapper]
  }
}


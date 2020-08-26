package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkFetchDocsWrapper extends js.Object {
  var keys: js.Array[String] = js.native
}

object BulkFetchDocsWrapper {
  @scala.inline
  def apply(keys: js.Array[String]): BulkFetchDocsWrapper = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkFetchDocsWrapper]
  }
  @scala.inline
  implicit class BulkFetchDocsWrapperOps[Self <: BulkFetchDocsWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
  
}


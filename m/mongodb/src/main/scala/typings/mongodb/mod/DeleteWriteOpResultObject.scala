package typings.mongodb.mod

import typings.mongodb.anon.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWriteOpResultObject extends js.Object {
  //The connection object used for the operation.
  var connection: js.UndefOr[js.Any] = js.native
  //The number of documents deleted.
  var deletedCount: js.UndefOr[scala.Double] = js.native
  //The raw result returned from MongoDB, field will vary depending on server version.
  var result: N = js.native
}

object DeleteWriteOpResultObject {
  @scala.inline
  def apply(result: N): DeleteWriteOpResultObject = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWriteOpResultObject]
  }
  @scala.inline
  implicit class DeleteWriteOpResultObjectOps[Self <: DeleteWriteOpResultObject] (val x: Self) extends AnyVal {
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
    def setResult(value: N): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnection(value: js.Any): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setDeletedCount(value: scala.Double): Self = this.set("deletedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedCount: Self = this.set("deletedCount", js.undefined)
  }
  
}


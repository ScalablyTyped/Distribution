package typings.mongodb.mod

import typings.mongodb.anon.Id
import typings.mongodb.anon.NModified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWriteOpResult extends js.Object {
  var connection: js.Any = js.native
  var matchedCount: scala.Double = js.native
  var modifiedCount: scala.Double = js.native
  var result: NModified = js.native
  var upsertedCount: scala.Double = js.native
  var upsertedId: Id = js.native
}

object UpdateWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: NModified,
    upsertedCount: scala.Double,
    upsertedId: Id
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
  @scala.inline
  implicit class UpdateWriteOpResultOps[Self <: UpdateWriteOpResult] (val x: Self) extends AnyVal {
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
    def setConnection(value: js.Any): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchedCount(value: scala.Double): Self = this.set("matchedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedCount(value: scala.Double): Self = this.set("modifiedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: NModified): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpsertedCount(value: scala.Double): Self = this.set("upsertedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpsertedId(value: Id): Self = this.set("upsertedId", value.asInstanceOf[js.Any])
  }
  
}


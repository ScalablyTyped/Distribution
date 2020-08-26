package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOperatorsOrdered extends js.Object {
  def delete(): OrderedBulkOperation = js.native
  def deleteOne(): OrderedBulkOperation = js.native
  def replaceOne(doc: js.Object): OrderedBulkOperation = js.native
  def update(doc: js.Object): OrderedBulkOperation = js.native
  def updateOne(doc: js.Object): OrderedBulkOperation = js.native
  def upsert(): FindOperatorsOrdered = js.native
}

object FindOperatorsOrdered {
  @scala.inline
  def apply(
    delete: () => OrderedBulkOperation,
    deleteOne: () => OrderedBulkOperation,
    replaceOne: js.Object => OrderedBulkOperation,
    update: js.Object => OrderedBulkOperation,
    updateOne: js.Object => OrderedBulkOperation,
    upsert: () => FindOperatorsOrdered
  ): FindOperatorsOrdered = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteOne = js.Any.fromFunction0(deleteOne), replaceOne = js.Any.fromFunction1(replaceOne), update = js.Any.fromFunction1(update), updateOne = js.Any.fromFunction1(updateOne), upsert = js.Any.fromFunction0(upsert))
    __obj.asInstanceOf[FindOperatorsOrdered]
  }
  @scala.inline
  implicit class FindOperatorsOrderedOps[Self <: FindOperatorsOrdered] (val x: Self) extends AnyVal {
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
    def setDelete(value: () => OrderedBulkOperation): Self = this.set("delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteOne(value: () => OrderedBulkOperation): Self = this.set("deleteOne", js.Any.fromFunction0(value))
    @scala.inline
    def setReplaceOne(value: js.Object => OrderedBulkOperation): Self = this.set("replaceOne", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: js.Object => OrderedBulkOperation): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateOne(value: js.Object => OrderedBulkOperation): Self = this.set("updateOne", js.Any.fromFunction1(value))
    @scala.inline
    def setUpsert(value: () => FindOperatorsOrdered): Self = this.set("upsert", js.Any.fromFunction0(value))
  }
  
}


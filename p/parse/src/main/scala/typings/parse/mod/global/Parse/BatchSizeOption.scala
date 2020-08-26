package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchSizeOption extends js.Object {
  var batchSize: js.UndefOr[Double] = js.native
}

object BatchSizeOption {
  @scala.inline
  def apply(): BatchSizeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSizeOption]
  }
  @scala.inline
  implicit class BatchSizeOptionOps[Self <: BatchSizeOption] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
  }
  
}


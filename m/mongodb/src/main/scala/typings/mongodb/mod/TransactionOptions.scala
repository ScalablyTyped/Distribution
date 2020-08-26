package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionOptions extends js.Object {
  var readConcern: js.UndefOr[ReadConcern] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  var writeConcern: js.UndefOr[WriteConcern] = js.native
}

object TransactionOptions {
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  @scala.inline
  implicit class TransactionOptionsOps[Self <: TransactionOptions] (val x: Self) extends AnyVal {
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
    def setReadConcern(value: ReadConcern): Self = this.set("readConcern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadConcern: Self = this.set("readConcern", js.undefined)
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    @scala.inline
    def setWriteConcern(value: WriteConcern): Self = this.set("writeConcern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteConcern: Self = this.set("writeConcern", js.undefined)
  }
  
}


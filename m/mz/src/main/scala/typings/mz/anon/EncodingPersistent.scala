package typings.mz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingPersistent extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.native
  var persistent: js.UndefOr[Boolean] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
}

object EncodingPersistent {
  @scala.inline
  def apply(): EncodingPersistent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingPersistent]
  }
  @scala.inline
  implicit class EncodingPersistentOps[Self <: EncodingPersistent] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
  
}


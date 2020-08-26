package typings.mnemonist.hashedArrayTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashedArrayTreeOptions extends js.Object {
  var blockSize: js.UndefOr[Double] = js.native
  var initialCapacity: js.UndefOr[Double] = js.native
  var initialLength: js.UndefOr[Double] = js.native
}

object HashedArrayTreeOptions {
  @scala.inline
  def apply(): HashedArrayTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashedArrayTreeOptions]
  }
  @scala.inline
  implicit class HashedArrayTreeOptionsOps[Self <: HashedArrayTreeOptions] (val x: Self) extends AnyVal {
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
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
    @scala.inline
    def setInitialCapacity(value: Double): Self = this.set("initialCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialCapacity: Self = this.set("initialCapacity", js.undefined)
    @scala.inline
    def setInitialLength(value: Double): Self = this.set("initialLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialLength: Self = this.set("initialLength", js.undefined)
  }
  
}


package typings.memfs.volumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatOptions extends js.Object {
  var bigint: js.UndefOr[Boolean] = js.native
}

object IStatOptions {
  @scala.inline
  def apply(): IStatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatOptions]
  }
  @scala.inline
  implicit class IStatOptionsOps[Self <: IStatOptions] (val x: Self) extends AnyVal {
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
    def setBigint(value: Boolean): Self = this.set("bigint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigint: Self = this.set("bigint", js.undefined)
  }
  
}


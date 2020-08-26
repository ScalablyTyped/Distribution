package typings.memfs.volumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReadFileOptions extends IOptions {
  var flag: js.UndefOr[String] = js.native
}

object IReadFileOptions {
  @scala.inline
  def apply(): IReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadFileOptions]
  }
  @scala.inline
  implicit class IReadFileOptionsOps[Self <: IReadFileOptions] (val x: Self) extends AnyVal {
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
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
  }
  
}


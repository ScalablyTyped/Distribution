package typings.memfs.volumeMod

import typings.memfs.encodingMod.TEncodingExtended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRealpathOptions extends js.Object {
  var encoding: js.UndefOr[TEncodingExtended] = js.native
}

object IRealpathOptions {
  @scala.inline
  def apply(): IRealpathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRealpathOptions]
  }
  @scala.inline
  implicit class IRealpathOptionsOps[Self <: IRealpathOptions] (val x: Self) extends AnyVal {
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
    def setEncoding(value: TEncodingExtended): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
  }
  
}


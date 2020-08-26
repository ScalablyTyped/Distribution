package typings.naverWhale.whale.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PacScript extends js.Object {
  /** Optional. A PAC script. */
  var data: js.UndefOr[String] = js.native
  /** Optional. If true, an invalid PAC script will prevent the network stack from falling back to direct connections. Defaults to false. */
  var mandatory: js.UndefOr[Boolean] = js.native
  /** Optional. URL of the PAC file to be used. */
  var url: js.UndefOr[String] = js.native
}

object PacScript {
  @scala.inline
  def apply(): PacScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacScript]
  }
  @scala.inline
  implicit class PacScriptOps[Self <: PacScript] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}


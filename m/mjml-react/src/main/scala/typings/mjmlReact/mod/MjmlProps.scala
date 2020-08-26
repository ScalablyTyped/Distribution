package typings.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlProps extends js.Object {
  var lang: js.UndefOr[String] = js.native
  var owa: js.UndefOr[String] = js.native
}

object MjmlProps {
  @scala.inline
  def apply(): MjmlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlProps]
  }
  @scala.inline
  implicit class MjmlPropsOps[Self <: MjmlProps] (val x: Self) extends AnyVal {
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setOwa(value: String): Self = this.set("owa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwa: Self = this.set("owa", js.undefined)
  }
  
}


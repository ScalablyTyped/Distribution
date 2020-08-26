package typings.next.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends js.Object {
  val browser: Boolean = js.native
}

object Process {
  @scala.inline
  def apply(browser: Boolean): Process = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
  @scala.inline
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
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
    def setBrowser(value: Boolean): Self = this.set("browser", value.asInstanceOf[js.Any])
  }
  
}


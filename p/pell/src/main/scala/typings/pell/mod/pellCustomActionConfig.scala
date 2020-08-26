package typings.pell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pellCustomActionConfig extends pellAction {
  var icon: String = js.native
  var name: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  def result(): Unit = js.native
}

object pellCustomActionConfig {
  @scala.inline
  def apply(icon: String, result: () => Unit): pellCustomActionConfig = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], result = js.Any.fromFunction0(result))
    __obj.asInstanceOf[pellCustomActionConfig]
  }
  @scala.inline
  implicit class pellCustomActionConfigOps[Self <: pellCustomActionConfig] (val x: Self) extends AnyVal {
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: () => Unit): Self = this.set("result", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


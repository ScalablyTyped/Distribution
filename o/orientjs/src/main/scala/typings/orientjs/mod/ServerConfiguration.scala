package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerConfiguration extends js.Object {
  def get(name: String): String = js.native
  def list(): js.Any = js.native
  def set(key: String, value: String): String = js.native
}

object ServerConfiguration {
  @scala.inline
  def apply(get: String => String, list: () => js.Any, set: (String, String) => String): ServerConfiguration = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ServerConfiguration]
  }
  @scala.inline
  implicit class ServerConfigurationOps[Self <: ServerConfiguration] (val x: Self) extends AnyVal {
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
    def setGet(value: String => String): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: () => js.Any): Self = this.set("list", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (String, String) => String): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}


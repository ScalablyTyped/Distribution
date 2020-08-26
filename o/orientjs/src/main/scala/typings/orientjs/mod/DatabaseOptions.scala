package typings.orientjs.mod

import typings.orientjs.orientjsStrings.document
import typings.orientjs.orientjsStrings.graph
import typings.orientjs.orientjsStrings.memory
import typings.orientjs.orientjsStrings.plocal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseOptions extends js.Object {
  var name: String = js.native
  var password: js.UndefOr[String] = js.native
  var storage: js.UndefOr[plocal | memory] = js.native
  var `type`: js.UndefOr[graph | document] = js.native
  var username: js.UndefOr[String] = js.native
}

object DatabaseOptions {
  @scala.inline
  def apply(name: String): DatabaseOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseOptions]
  }
  @scala.inline
  implicit class DatabaseOptionsOps[Self <: DatabaseOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setStorage(value: plocal | memory): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    @scala.inline
    def setType(value: graph | document): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}


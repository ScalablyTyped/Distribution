package typings.plaidLink.anon

import typings.plaidLink.mod.Plaid.CreateConfig
import typings.plaidLink.mod.Plaid.LinkHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create extends js.Object {
  var version: String = js.native
  def create(params: CreateConfig): LinkHandler = js.native
}

object Create {
  @scala.inline
  def apply(create: CreateConfig => LinkHandler, version: String): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
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
    def setCreate(value: CreateConfig => LinkHandler): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


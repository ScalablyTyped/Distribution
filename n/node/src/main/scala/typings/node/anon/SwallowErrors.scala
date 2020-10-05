package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwallowErrors extends js.Object {
  var swallowErrors: js.UndefOr[Boolean] = js.native
}

object SwallowErrors {
  @scala.inline
  def apply(): SwallowErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwallowErrors]
  }
  @scala.inline
  implicit class SwallowErrorsOps[Self <: SwallowErrors] (val x: Self) extends AnyVal {
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
    def setSwallowErrors(value: Boolean): Self = this.set("swallowErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwallowErrors: Self = this.set("swallowErrors", js.undefined)
  }
  
}


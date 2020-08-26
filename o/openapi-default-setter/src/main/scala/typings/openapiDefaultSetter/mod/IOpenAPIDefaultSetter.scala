package typings.openapiDefaultSetter.mod

import typings.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpenAPIDefaultSetter extends js.Object {
  def handle(request: Request): Unit = js.native
}

object IOpenAPIDefaultSetter {
  @scala.inline
  def apply(handle: Request => Unit): IOpenAPIDefaultSetter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[IOpenAPIDefaultSetter]
  }
  @scala.inline
  implicit class IOpenAPIDefaultSetterOps[Self <: IOpenAPIDefaultSetter] (val x: Self) extends AnyVal {
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
    def setHandle(value: Request => Unit): Self = this.set("handle", js.Any.fromFunction1(value))
  }
  
}


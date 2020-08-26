package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  var api: String = js.native
  var software: String = js.native
}

object Api {
  @scala.inline
  def apply(api: String, software: String): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
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
    def setApi(value: String): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftware(value: String): Self = this.set("software", value.asInstanceOf[js.Any])
  }
  
}


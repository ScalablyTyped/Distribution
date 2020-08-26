package typings.neo4j.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpOptions extends js.Object {
  var body: js.Any = js.native
  var method: String = js.native
  var path: String = js.native
  var raw: js.Any = js.native
}

object HttpOptions {
  @scala.inline
  def apply(body: js.Any, method: String, path: String, raw: js.Any): HttpOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOptions]
  }
  @scala.inline
  implicit class HttpOptionsOps[Self <: HttpOptions] (val x: Self) extends AnyVal {
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: js.Any): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
  
}


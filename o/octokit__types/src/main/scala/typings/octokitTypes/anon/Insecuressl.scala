package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insecuressl extends js.Object {
  var content_type: String = js.native
  var insecure_ssl: String = js.native
  var url: String = js.native
}

object Insecuressl {
  @scala.inline
  def apply(content_type: String, insecure_ssl: String, url: String): Insecuressl = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], insecure_ssl = insecure_ssl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insecuressl]
  }
  @scala.inline
  implicit class InsecuresslOps[Self <: Insecuressl] (val x: Self) extends AnyVal {
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
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsecure_ssl(value: String): Self = this.set("insecure_ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}


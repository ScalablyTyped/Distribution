package typings.nconf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecureFileOptions extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var secret: String = js.native
}

object ISecureFileOptions {
  @scala.inline
  def apply(secret: String): ISecureFileOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISecureFileOptions]
  }
  @scala.inline
  implicit class ISecureFileOptionsOps[Self <: ISecureFileOptions] (val x: Self) extends AnyVal {
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
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
  }
  
}


package typings.passportSamlMetadata.readerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataConstructorOptions extends js.Object {
  var authnRequestBinding: String = js.native
  var throwExceptions: Boolean = js.native
}

object MetadataConstructorOptions {
  @scala.inline
  def apply(authnRequestBinding: String, throwExceptions: Boolean): MetadataConstructorOptions = {
    val __obj = js.Dynamic.literal(authnRequestBinding = authnRequestBinding.asInstanceOf[js.Any], throwExceptions = throwExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataConstructorOptions]
  }
  @scala.inline
  implicit class MetadataConstructorOptionsOps[Self <: MetadataConstructorOptions] (val x: Self) extends AnyVal {
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
    def setAuthnRequestBinding(value: String): Self = this.set("authnRequestBinding", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrowExceptions(value: Boolean): Self = this.set("throwExceptions", value.asInstanceOf[js.Any])
  }
  
}


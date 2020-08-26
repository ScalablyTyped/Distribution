package typings.passportSamlMetadata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/reader.MetadataConstructorOptions> */
@js.native
trait PartialMetadataConstructo extends js.Object {
  var authnRequestBinding: js.UndefOr[String] = js.native
  var throwExceptions: js.UndefOr[Boolean] = js.native
}

object PartialMetadataConstructo {
  @scala.inline
  def apply(): PartialMetadataConstructo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMetadataConstructo]
  }
  @scala.inline
  implicit class PartialMetadataConstructoOps[Self <: PartialMetadataConstructo] (val x: Self) extends AnyVal {
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
    def deleteAuthnRequestBinding: Self = this.set("authnRequestBinding", js.undefined)
    @scala.inline
    def setThrowExceptions(value: Boolean): Self = this.set("throwExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowExceptions: Self = this.set("throwExceptions", js.undefined)
  }
  
}


package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraOptions extends js.Object {
  var extraOptions: js.UndefOr[js.Any] = js.native
  var keyVaultNamespace: String = js.native
  var kmsProviders: js.Any = js.native
  var schemaMap: js.Any = js.native
}

object ExtraOptions {
  @scala.inline
  def apply(keyVaultNamespace: String, kmsProviders: js.Any, schemaMap: js.Any): ExtraOptions = {
    val __obj = js.Dynamic.literal(keyVaultNamespace = keyVaultNamespace.asInstanceOf[js.Any], kmsProviders = kmsProviders.asInstanceOf[js.Any], schemaMap = schemaMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraOptions]
  }
  @scala.inline
  implicit class ExtraOptionsOps[Self <: ExtraOptions] (val x: Self) extends AnyVal {
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
    def setKeyVaultNamespace(value: String): Self = this.set("keyVaultNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsProviders(value: js.Any): Self = this.set("kmsProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaMap(value: js.Any): Self = this.set("schemaMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraOptions(value: js.Any): Self = this.set("extraOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraOptions: Self = this.set("extraOptions", js.undefined)
  }
  
}


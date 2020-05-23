package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraOptions extends js.Object {
  var extraOptions: js.UndefOr[js.Any] = js.undefined
  var keyVaultNamespace: String
  var kmsProviders: js.Any
  var schemaMap: js.Any
}

object ExtraOptions {
  @scala.inline
  def apply(keyVaultNamespace: String, kmsProviders: js.Any, schemaMap: js.Any, extraOptions: js.Any = null): ExtraOptions = {
    val __obj = js.Dynamic.literal(keyVaultNamespace = keyVaultNamespace.asInstanceOf[js.Any], kmsProviders = kmsProviders.asInstanceOf[js.Any], schemaMap = schemaMap.asInstanceOf[js.Any])
    if (extraOptions != null) __obj.updateDynamic("extraOptions")(extraOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraOptions]
  }
}


package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtraOptions extends js.Object {
  var extraOptions: js.UndefOr[js.Any] = js.undefined
  var keyVaultNamespace: String
  var kmsProviders: js.Any
  var schemaMap: js.Any
}

object AnonExtraOptions {
  @scala.inline
  def apply(keyVaultNamespace: String, kmsProviders: js.Any, schemaMap: js.Any, extraOptions: js.Any = null): AnonExtraOptions = {
    val __obj = js.Dynamic.literal(keyVaultNamespace = keyVaultNamespace.asInstanceOf[js.Any], kmsProviders = kmsProviders.asInstanceOf[js.Any], schemaMap = schemaMap.asInstanceOf[js.Any])
    if (extraOptions != null) __obj.updateDynamic("extraOptions")(extraOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtraOptions]
  }
}


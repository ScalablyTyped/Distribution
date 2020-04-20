package typings.passportSamlMetadata.readerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataConstructorOptions extends js.Object {
  var authnRequestBinding: String
  var throwExceptions: Boolean
}

object MetadataConstructorOptions {
  @scala.inline
  def apply(authnRequestBinding: String, throwExceptions: Boolean): MetadataConstructorOptions = {
    val __obj = js.Dynamic.literal(authnRequestBinding = authnRequestBinding.asInstanceOf[js.Any], throwExceptions = throwExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataConstructorOptions]
  }
}


package typings.passportSamlMetadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/reader.MetadataConstructorOptions> */
trait PartialMetadataConstructo extends js.Object {
  var authnRequestBinding: js.UndefOr[String] = js.undefined
  var throwExceptions: js.UndefOr[Boolean] = js.undefined
}

object PartialMetadataConstructo {
  @scala.inline
  def apply(authnRequestBinding: String = null, throwExceptions: js.UndefOr[Boolean] = js.undefined): PartialMetadataConstructo = {
    val __obj = js.Dynamic.literal()
    if (authnRequestBinding != null) __obj.updateDynamic("authnRequestBinding")(authnRequestBinding.asInstanceOf[js.Any])
    if (!js.isUndefined(throwExceptions)) __obj.updateDynamic("throwExceptions")(throwExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMetadataConstructo]
  }
}


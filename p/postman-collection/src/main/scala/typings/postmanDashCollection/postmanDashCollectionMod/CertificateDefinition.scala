package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_Src
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateDefinition extends PropertyDefinition {
  var cert: js.UndefOr[Anon_Src | String] = js.undefined
  var key: js.UndefOr[Anon_Src | String] = js.undefined
  var matches: js.UndefOr[js.Array[String] | UrlMatchPatternList] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
}

object CertificateDefinition {
  @scala.inline
  def apply(
    cert: Anon_Src | String = null,
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    key: Anon_Src | String = null,
    matches: js.Array[String] | UrlMatchPatternList = null,
    name: String = null,
    passphrase: String = null
  ): CertificateDefinition = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateDefinition]
  }
}


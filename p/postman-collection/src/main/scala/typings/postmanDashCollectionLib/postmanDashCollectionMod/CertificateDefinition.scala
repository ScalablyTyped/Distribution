package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateDefinition extends PropertyDefinition {
  var cert: js.UndefOr[postmanDashCollectionLib.Anon_Src | java.lang.String] = js.undefined
  var key: js.UndefOr[postmanDashCollectionLib.Anon_Src | java.lang.String] = js.undefined
  var matches: js.UndefOr[js.Array[java.lang.String] | UrlMatchPatternList] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
}

object CertificateDefinition {
  @scala.inline
  def apply(
    cert: postmanDashCollectionLib.Anon_Src | java.lang.String = null,
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    key: postmanDashCollectionLib.Anon_Src | java.lang.String = null,
    matches: js.Array[java.lang.String] | UrlMatchPatternList = null,
    name: java.lang.String = null,
    passphrase: java.lang.String = null
  ): CertificateDefinition = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    __obj.asInstanceOf[CertificateDefinition]
  }
}


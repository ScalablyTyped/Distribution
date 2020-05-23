package typings.passportSamlMetadata.fetchMod

import typings.passportSamlMetadata.anon.Get
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  client ? :{get (url : string, params ? : std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig>): std.Promise<{  data  :string}>},   url  :string} & std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> */
trait FetchConfig extends js.Object {
  var backupStore: js.UndefOr[Map[String, String]] = js.undefined
  var client: js.UndefOr[Get] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
}

object FetchConfig {
  @scala.inline
  def apply(
    url: String,
    backupStore: Map[String, String] = null,
    client: Get = null,
    responseType: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): FetchConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (backupStore != null) __obj.updateDynamic("backupStore")(backupStore.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchConfig]
  }
}


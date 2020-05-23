package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.urlParamAdapter
import typings.oracleOraclejet.ojrouterMod.urlPathAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var rootInstanceName: js.UndefOr[String] = js.undefined
  var urlAdapter: js.UndefOr[urlPathAdapter | urlParamAdapter] = js.undefined
}

object BaseUrl {
  @scala.inline
  def apply(
    baseUrl: String = null,
    rootInstanceName: String = null,
    urlAdapter: urlPathAdapter | urlParamAdapter = null
  ): BaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (rootInstanceName != null) __obj.updateDynamic("rootInstanceName")(rootInstanceName.asInstanceOf[js.Any])
    if (urlAdapter != null) __obj.updateDynamic("urlAdapter")(urlAdapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
}


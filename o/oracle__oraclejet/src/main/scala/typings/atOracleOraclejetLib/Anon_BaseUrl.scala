package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var rootInstanceName: js.UndefOr[java.lang.String] = js.undefined
  var urlAdapter: js.UndefOr[
    atOracleOraclejetLib.ojrouterMod.urlPathAdapter | atOracleOraclejetLib.ojrouterMod.urlParamAdapter
  ] = js.undefined
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    baseUrl: java.lang.String = null,
    rootInstanceName: java.lang.String = null,
    urlAdapter: atOracleOraclejetLib.ojrouterMod.urlPathAdapter | atOracleOraclejetLib.ojrouterMod.urlParamAdapter = null
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (rootInstanceName != null) __obj.updateDynamic("rootInstanceName")(rootInstanceName)
    if (urlAdapter != null) __obj.updateDynamic("urlAdapter")(urlAdapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}


package typings.msDashRestDashAzure.msDashRestDashAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSIAppServiceOptions extends MSIOptions {
  /**
    * @property {string} [msiApiVersion] - The api-version of the local MSI agent. Default value is "2017-09-01".
    */
  var msiApiVersion: js.UndefOr[String] = js.undefined
  /**
    * @property {string} [msiEndpoint] - The local URL from which your app can request tokens.
    * Either provide this parameter or set the environment varaible `MSI_ENDPOINT`.
    * For example: `export MSI_ENDPOINT="http://127.0.0.1:41741/MSI/token/"`
    */
  var msiEndpoint: js.UndefOr[String] = js.undefined
  /**
    * @property {string} [msiSecret] - The secret used in communication between your code and the local MSI agent.
    * Either provide this parameter or set the environment varaible `MSI_SECRET`.
    * For example: `export MSI_SECRET="69418689F1E342DD946CB82994CDA3CB"`
    */
  var msiSecret: js.UndefOr[String] = js.undefined
}

object MSIAppServiceOptions {
  @scala.inline
  def apply(
    msiApiVersion: String = null,
    msiEndpoint: String = null,
    msiSecret: String = null,
    resource: String = null
  ): MSIAppServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (msiApiVersion != null) __obj.updateDynamic("msiApiVersion")(msiApiVersion)
    if (msiEndpoint != null) __obj.updateDynamic("msiEndpoint")(msiEndpoint)
    if (msiSecret != null) __obj.updateDynamic("msiSecret")(msiSecret)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[MSIAppServiceOptions]
  }
}


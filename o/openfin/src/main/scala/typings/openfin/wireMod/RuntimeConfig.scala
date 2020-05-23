package typings.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeConfig extends js.Object {
  var arguments: js.UndefOr[String] = js.undefined
  var fallbackVersion: js.UndefOr[String] = js.undefined
  var rvmDir: js.UndefOr[String] = js.undefined
  var securityRealm: js.UndefOr[String] = js.undefined
  var verboseLogging: js.UndefOr[Boolean] = js.undefined
  var version: String
}

object RuntimeConfig {
  @scala.inline
  def apply(
    version: String,
    arguments: String = null,
    fallbackVersion: String = null,
    rvmDir: String = null,
    securityRealm: String = null,
    verboseLogging: js.UndefOr[Boolean] = js.undefined
  ): RuntimeConfig = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (fallbackVersion != null) __obj.updateDynamic("fallbackVersion")(fallbackVersion.asInstanceOf[js.Any])
    if (rvmDir != null) __obj.updateDynamic("rvmDir")(rvmDir.asInstanceOf[js.Any])
    if (securityRealm != null) __obj.updateDynamic("securityRealm")(securityRealm.asInstanceOf[js.Any])
    if (!js.isUndefined(verboseLogging)) __obj.updateDynamic("verboseLogging")(verboseLogging.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeConfig]
  }
}


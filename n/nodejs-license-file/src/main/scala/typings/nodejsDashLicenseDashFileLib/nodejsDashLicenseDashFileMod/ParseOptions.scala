package typings
package nodejsDashLicenseDashFileLib.nodejsDashLicenseDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var licenseFile: js.UndefOr[java.lang.String] = js.undefined
  var licenseFilePath: js.UndefOr[java.lang.String] = js.undefined
  var publicKey: js.UndefOr[java.lang.String] = js.undefined
  var publicKeyPath: js.UndefOr[java.lang.String] = js.undefined
  var template: java.lang.String
}

object ParseOptions {
  @scala.inline
  def apply(
    template: java.lang.String,
    licenseFile: java.lang.String = null,
    licenseFilePath: java.lang.String = null,
    publicKey: java.lang.String = null,
    publicKeyPath: java.lang.String = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(template = template)
    if (licenseFile != null) __obj.updateDynamic("licenseFile")(licenseFile)
    if (licenseFilePath != null) __obj.updateDynamic("licenseFilePath")(licenseFilePath)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    if (publicKeyPath != null) __obj.updateDynamic("publicKeyPath")(publicKeyPath)
    __obj.asInstanceOf[ParseOptions]
  }
}


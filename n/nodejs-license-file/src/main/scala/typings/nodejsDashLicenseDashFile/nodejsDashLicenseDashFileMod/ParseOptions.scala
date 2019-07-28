package typings.nodejsDashLicenseDashFile.nodejsDashLicenseDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var licenseFile: js.UndefOr[String] = js.undefined
  var licenseFilePath: js.UndefOr[String] = js.undefined
  var publicKey: js.UndefOr[String] = js.undefined
  var publicKeyPath: js.UndefOr[String] = js.undefined
  var template: String
}

object ParseOptions {
  @scala.inline
  def apply(
    template: String,
    licenseFile: String = null,
    licenseFilePath: String = null,
    publicKey: String = null,
    publicKeyPath: String = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(template = template)
    if (licenseFile != null) __obj.updateDynamic("licenseFile")(licenseFile)
    if (licenseFilePath != null) __obj.updateDynamic("licenseFilePath")(licenseFilePath)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    if (publicKeyPath != null) __obj.updateDynamic("publicKeyPath")(publicKeyPath)
    __obj.asInstanceOf[ParseOptions]
  }
}


package typings.nodejsLicenseFile.mod

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
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (licenseFile != null) __obj.updateDynamic("licenseFile")(licenseFile.asInstanceOf[js.Any])
    if (licenseFilePath != null) __obj.updateDynamic("licenseFilePath")(licenseFilePath.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (publicKeyPath != null) __obj.updateDynamic("publicKeyPath")(publicKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}


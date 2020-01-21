package typings.nodejsLicenseFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var data: js.Any
  var privateKey: js.UndefOr[String] = js.undefined
  var privateKeyPath: js.UndefOr[String] = js.undefined
  var template: String
}

object GenerateOptions {
  @scala.inline
  def apply(data: js.Any, template: String, privateKey: String = null, privateKeyPath: String = null): GenerateOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (privateKeyPath != null) __obj.updateDynamic("privateKeyPath")(privateKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}


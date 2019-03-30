package typings
package nodejsDashLicenseDashFileLib.nodejsDashLicenseDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var data: js.Any
  var privateKey: js.UndefOr[java.lang.String] = js.undefined
  var privateKeyPath: js.UndefOr[java.lang.String] = js.undefined
  var template: java.lang.String
}

object GenerateOptions {
  @scala.inline
  def apply(
    data: js.Any,
    template: java.lang.String,
    privateKey: java.lang.String = null,
    privateKeyPath: java.lang.String = null
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal(data = data, template = template)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey)
    if (privateKeyPath != null) __obj.updateDynamic("privateKeyPath")(privateKeyPath)
    __obj.asInstanceOf[GenerateOptions]
  }
}


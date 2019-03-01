package typings
package pkgcloudLib.pkgcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderOptions extends js.Object {
  var provider: Providers
}

object BaseProviderOptions {
  @scala.inline
  def apply(provider: Providers): BaseProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[BaseProviderOptions]
  }
}


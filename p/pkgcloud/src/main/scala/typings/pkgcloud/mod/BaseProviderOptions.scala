package typings.pkgcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderOptions extends js.Object {
  var provider: Providers
}

object BaseProviderOptions {
  @scala.inline
  def apply(provider: Providers): BaseProviderOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderOptions]
  }
}


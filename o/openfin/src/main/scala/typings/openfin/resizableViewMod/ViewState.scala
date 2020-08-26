package typings.openfin.resizableViewMod

import typings.openfin.identityMod.Identity
import typings.openfin.viewViewMod.ViewCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewState extends ViewCreationOptions

object ViewState {
  @scala.inline
  def apply(name: String, target: Identity, url: String): ViewState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewState]
  }
}


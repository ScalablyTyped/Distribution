package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SwallowErrors extends js.Object {
  var swallowErrors: js.UndefOr[Boolean] = js.undefined
}

object Anon_SwallowErrors {
  @scala.inline
  def apply(swallowErrors: js.UndefOr[Boolean] = js.undefined): Anon_SwallowErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(swallowErrors)) __obj.updateDynamic("swallowErrors")(swallowErrors)
    __obj.asInstanceOf[Anon_SwallowErrors]
  }
}


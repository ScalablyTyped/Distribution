package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RejectUnauthorized extends js.Object {
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
   // Defaults to true
  var servername: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_RejectUnauthorized {
  @scala.inline
  def apply(rejectUnauthorized: js.UndefOr[Boolean] = js.undefined, servername: java.lang.String = null): Anon_RejectUnauthorized = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    __obj.asInstanceOf[Anon_RejectUnauthorized]
  }
}


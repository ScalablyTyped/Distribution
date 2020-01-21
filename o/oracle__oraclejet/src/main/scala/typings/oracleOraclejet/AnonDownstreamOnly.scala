package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownstreamOnly extends js.Object {
  var downstreamOnly: Boolean
  var expr: Null | String
}

object AnonDownstreamOnly {
  @scala.inline
  def apply(downstreamOnly: Boolean, expr: String = null): AnonDownstreamOnly = {
    val __obj = js.Dynamic.literal(downstreamOnly = downstreamOnly.asInstanceOf[js.Any])
    if (expr != null) __obj.updateDynamic("expr")(expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownstreamOnly]
  }
}


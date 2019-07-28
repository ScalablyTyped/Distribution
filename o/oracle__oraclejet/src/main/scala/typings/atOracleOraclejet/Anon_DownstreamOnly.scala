package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DownstreamOnly extends js.Object {
  var downstreamOnly: Boolean
  var expr: Null | String
}

object Anon_DownstreamOnly {
  @scala.inline
  def apply(downstreamOnly: Boolean, expr: String = null): Anon_DownstreamOnly = {
    val __obj = js.Dynamic.literal(downstreamOnly = downstreamOnly)
    if (expr != null) __obj.updateDynamic("expr")(expr)
    __obj.asInstanceOf[Anon_DownstreamOnly]
  }
}


package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownstreamOnly extends js.Object {
  var downstreamOnly: Boolean
  var expr: Null | String
}

object DownstreamOnly {
  @scala.inline
  def apply(downstreamOnly: Boolean, expr: String = null): DownstreamOnly = {
    val __obj = js.Dynamic.literal(downstreamOnly = downstreamOnly.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownstreamOnly]
  }
}


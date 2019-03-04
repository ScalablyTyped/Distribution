package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DownstreamOnly extends js.Object {
  var downstreamOnly: scala.Boolean
  var expr: scala.Null | java.lang.String
}

object Anon_DownstreamOnly {
  @scala.inline
  def apply(downstreamOnly: scala.Boolean, expr: java.lang.String = null): Anon_DownstreamOnly = {
    val __obj = js.Dynamic.literal(downstreamOnly = downstreamOnly)
    if (expr != null) __obj.updateDynamic("expr")(expr)
    __obj.asInstanceOf[Anon_DownstreamOnly]
  }
}


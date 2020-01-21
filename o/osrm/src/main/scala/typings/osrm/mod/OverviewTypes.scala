package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.osrm.osrmStrings.full
  - typings.osrm.osrmStrings.simplified
  - typings.osrm.osrmStrings.`false`
*/
trait OverviewTypes extends js.Object

object OverviewTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typings.osrm.osrmStrings.`false` = this.cast("false")
  @scala.inline
  def full: typings.osrm.osrmStrings.full = this.cast("full")
  @scala.inline
  def simplified: typings.osrm.osrmStrings.simplified = this.cast("simplified")
}


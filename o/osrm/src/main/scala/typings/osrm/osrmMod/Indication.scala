package typings.osrm.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.osrm.osrmStrings.uturn
  - typings.osrm.osrmStrings.`sharp right`
  - typings.osrm.osrmStrings.right
  - typings.osrm.osrmStrings.`slight rigth`
  - typings.osrm.osrmStrings.straight
  - typings.osrm.osrmStrings.`slight left`
  - typings.osrm.osrmStrings.left
  - typings.osrm.osrmStrings.`sharp left`
*/
trait Indication extends js.Object

object Indication {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.osrm.osrmStrings.left = this.cast("left")
  @scala.inline
  def right: typings.osrm.osrmStrings.right = this.cast("right")
  @scala.inline
  def `sharp left`: typings.osrm.osrmStrings.`sharp left` = this.cast("sharp left")
  @scala.inline
  def `sharp right`: typings.osrm.osrmStrings.`sharp right` = this.cast("sharp right")
  @scala.inline
  def `slight left`: typings.osrm.osrmStrings.`slight left` = this.cast("slight left")
  @scala.inline
  def `slight rigth`: typings.osrm.osrmStrings.`slight rigth` = this.cast("slight rigth")
  @scala.inline
  def straight: typings.osrm.osrmStrings.straight = this.cast("straight")
  @scala.inline
  def uturn: typings.osrm.osrmStrings.uturn = this.cast("uturn")
}


package typings
package nedbLib.nedbMod.NedbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistence extends js.Object {
  def compactDatafile(): scala.Unit
  def setAutocompactionInterval(interval: scala.Double): scala.Unit
  def stopAutocompaction(): scala.Unit
}


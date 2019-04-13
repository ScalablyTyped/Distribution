package typings
package nedbLib.nedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistence extends js.Object {
  def compactDatafile(): scala.Unit
  def setAutocompactionInterval(interval: scala.Double): scala.Unit
  def stopAutocompaction(): scala.Unit
}

object Persistence {
  @scala.inline
  def apply(
    compactDatafile: () => scala.Unit,
    setAutocompactionInterval: scala.Double => scala.Unit,
    stopAutocompaction: () => scala.Unit
  ): Persistence = {
    val __obj = js.Dynamic.literal(compactDatafile = js.Any.fromFunction0(compactDatafile), setAutocompactionInterval = js.Any.fromFunction1(setAutocompactionInterval), stopAutocompaction = js.Any.fromFunction0(stopAutocompaction))
  
    __obj.asInstanceOf[Persistence]
  }
}


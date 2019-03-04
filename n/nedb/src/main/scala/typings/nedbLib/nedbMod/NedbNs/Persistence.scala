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

object Persistence {
  @scala.inline
  def apply(
    compactDatafile: js.Function0[scala.Unit],
    setAutocompactionInterval: js.Function1[scala.Double, scala.Unit],
    stopAutocompaction: js.Function0[scala.Unit]
  ): Persistence = {
    val __obj = js.Dynamic.literal(compactDatafile = compactDatafile, setAutocompactionInterval = setAutocompactionInterval, stopAutocompaction = stopAutocompaction)
  
    __obj.asInstanceOf[Persistence]
  }
}


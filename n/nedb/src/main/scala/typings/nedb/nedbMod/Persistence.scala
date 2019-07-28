package typings.nedb.nedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistence extends js.Object {
  def compactDatafile(): Unit
  def setAutocompactionInterval(interval: Double): Unit
  def stopAutocompaction(): Unit
}

object Persistence {
  @scala.inline
  def apply(
    compactDatafile: () => Unit,
    setAutocompactionInterval: Double => Unit,
    stopAutocompaction: () => Unit
  ): Persistence = {
    val __obj = js.Dynamic.literal(compactDatafile = js.Any.fromFunction0(compactDatafile), setAutocompactionInterval = js.Any.fromFunction1(setAutocompactionInterval), stopAutocompaction = js.Any.fromFunction0(stopAutocompaction))
  
    __obj.asInstanceOf[Persistence]
  }
}


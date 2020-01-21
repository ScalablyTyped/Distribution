package typings.modesl.mod

import typings.modesl.AnonHIGH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("modesl", "Event")
@js.native
class Event protected () extends js.Object {
  def this(`type`: js.Any, subclass: js.Any) = this()
  var headers: js.Array[Header] = js.native
  def addBody(value: js.Any): js.Any = js.native
  def addHeader(name: js.Any, value: js.Any): js.Any = js.native
  def delHeader(name: js.Any): js.Any = js.native
  def firstHeader(): js.Any = js.native
  def getBody(): js.Any = js.native
  def getHeader(name: js.Any): String = js.native
  def getType(): js.Any = js.native
  def nextHeader(): js.Any = js.native
  def serialize(format: js.Any): js.Any = js.native
  def setPriority(priority: js.Any): Unit = js.native
}

/* static members */
@JSImport("modesl", "Event")
@js.native
object Event extends js.Object {
  val PRIORITY: AnonHIGH = js.native
}


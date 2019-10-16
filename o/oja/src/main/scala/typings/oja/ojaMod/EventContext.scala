package typings.oja.ojaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "EventContext")
@js.native
class EventContext protected () extends js.Object {
  def this(context: js.Object) = this()
  def this(context: EventContext) = this()
  def emit(name: String, value: js.Any): this.type = js.native
  def get(name: String): js.Any = js.native
  def on(`type`: String, handler: js.Function1[/* event */ js.Any, Unit]): this.type = js.native
  def once(`type`: String, handler: js.Function1[/* event */ js.Any, Unit]): this.type = js.native
  def repub(`type`: String, handler: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
  def stageContext(topics: String): StageContext = js.native
  def stageContext(topics: js.Array[String]): StageContext = js.native
  def state(): State = js.native
}


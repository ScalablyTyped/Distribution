package typings
package ojaLib.ojaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "EventContext")
@js.native
class EventContext ()
  extends org.scalablytyped.runtime.Instantiable1[(/* context */ EventContext) | (/* context */ js.Object), EventContext] {
  def emit(name: java.lang.String, value: js.Any): this.type = js.native
  def get(name: java.lang.String): js.Any = js.native
  def on(`type`: java.lang.String, handler: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  def once(`type`: java.lang.String, handler: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  def repub(`type`: java.lang.String, handler: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  def stageContext(topics: java.lang.String): StageContext = js.native
  def stageContext(topics: js.Array[java.lang.String]): StageContext = js.native
  def state(): State = js.native
}


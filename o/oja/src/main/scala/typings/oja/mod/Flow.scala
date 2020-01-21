package typings.oja.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oja.AnonNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "Flow")
@js.native
class Flow () extends js.Object {
  def this(baseFlow: Flow) = this()
  def `catch`(callback: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  def consume(topic: String): js.Promise[_] = js.native
  def consume(topic: String, callback: ConsumerCallback): this.type = js.native
  def consume(topic: js.Array[String], callback: ConsumerCallback): this.type = js.native
  def consume(topics: js.Array[String]): js.Promise[StringDictionary[String]] = js.native
  def consumeStream(topic: String): ReadableStream = js.native
  def consumeStream(topic: String, callback: js.Function1[/* stream */ ReadableStream, Unit]): this.type = js.native
  def define(topic: String, data: js.Object): this.type = js.native
  def define(topic: String, data: js.Promise[Primitive]): this.type = js.native
  def define(topic: String, data: DefinitionFunction): this.type = js.native
  def define(topic: String, data: Primitive): this.type = js.native
  def define(topics: String): StageContext = js.native
  def define(topics: js.Array[String]): StageContext = js.native
  def getReader(topic: String): AnonNext = js.native
  def state(): State = js.native
  def timeout(topics: String, ms: Double): this.type = js.native
  def timeout(topics: js.Array[String], ms: Double): this.type = js.native
}


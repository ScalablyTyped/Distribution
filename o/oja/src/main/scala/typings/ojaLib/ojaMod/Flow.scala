package typings
package ojaLib.ojaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "Flow")
@js.native
class Flow () extends js.Object {
  def this(baseFlow: Flow) = this()
  def `catch`(callback: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
  def consume(topic: java.lang.String): js.Promise[_] = js.native
  def consume(topic: java.lang.String, callback: ConsumerCallback): this.type = js.native
  def consume(topic: js.Array[java.lang.String], callback: ConsumerCallback): this.type = js.native
  def consume(topics: js.Array[java.lang.String]): js.Promise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def consumeStream(topic: java.lang.String): ReadableStream = js.native
  def consumeStream(topic: java.lang.String, callback: js.Function1[/* stream */ ReadableStream, scala.Unit]): this.type = js.native
  def define(topic: java.lang.String, data: js.Object): this.type = js.native
  def define(topic: java.lang.String, data: js.Promise[Primitive]): this.type = js.native
  def define(topic: java.lang.String, data: DefinitionFunction): this.type = js.native
  def define(topic: java.lang.String, data: Primitive): this.type = js.native
  def define(topics: java.lang.String): StageContext = js.native
  def define(topics: js.Array[java.lang.String]): StageContext = js.native
  def getReader(topic: java.lang.String): ojaLib.Anon_Next = js.native
  def state(): State = js.native
  def timeout(topics: java.lang.String, ms: scala.Double): this.type = js.native
  def timeout(topics: js.Array[java.lang.String], ms: scala.Double): this.type = js.native
}


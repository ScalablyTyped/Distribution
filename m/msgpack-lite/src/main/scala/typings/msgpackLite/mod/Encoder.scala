package typings.msgpackLite.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  var bufferish: js.Any
  var maxBufferSize: Double
  var minBufferSize: Double
  var offset: Double
  var start: Double
  def encode(chunk: js.Any): Unit
  def end(chunk: js.Any): Unit
  def fetch(): Unit
  def flush(): Unit
  def pull(): Double
  def push(chunk: js.Any): Unit
  def read(): Double
  def reserve(length: Double): Double
  def send(buffer: Buffer): Unit
  def write(chunk: js.Any): Unit
}

object Encoder {
  @scala.inline
  def apply(
    bufferish: js.Any,
    encode: js.Any => Unit,
    end: js.Any => Unit,
    fetch: () => Unit,
    flush: () => Unit,
    maxBufferSize: Double,
    minBufferSize: Double,
    offset: Double,
    pull: () => Double,
    push: js.Any => Unit,
    read: () => Double,
    reserve: Double => Double,
    send: Buffer => Unit,
    start: Double,
    write: js.Any => Unit
  ): Encoder = {
    val __obj = js.Dynamic.literal(bufferish = bufferish.asInstanceOf[js.Any], encode = js.Any.fromFunction1(encode), end = js.Any.fromFunction1(end), fetch = js.Any.fromFunction0(fetch), flush = js.Any.fromFunction0(flush), maxBufferSize = maxBufferSize.asInstanceOf[js.Any], minBufferSize = minBufferSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pull = js.Any.fromFunction0(pull), push = js.Any.fromFunction1(push), read = js.Any.fromFunction0(read), reserve = js.Any.fromFunction1(reserve), send = js.Any.fromFunction1(send), start = start.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Encoder]
  }
}


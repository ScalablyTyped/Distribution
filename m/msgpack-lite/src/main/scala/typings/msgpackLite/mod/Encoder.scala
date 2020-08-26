package typings.msgpackLite.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoder extends js.Object {
  var bufferish: js.Any = js.native
  var maxBufferSize: Double = js.native
  var minBufferSize: Double = js.native
  var offset: Double = js.native
  var start: Double = js.native
  def encode(chunk: js.Any): Unit = js.native
  def end(chunk: js.Any): Unit = js.native
  def fetch(): Unit = js.native
  def flush(): Unit = js.native
  def pull(): Double = js.native
  def push(chunk: js.Any): Unit = js.native
  def read(): Double = js.native
  def reserve(length: Double): Double = js.native
  def send(buffer: Buffer): Unit = js.native
  def write(chunk: js.Any): Unit = js.native
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
  @scala.inline
  implicit class EncoderOps[Self <: Encoder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBufferish(value: js.Any): Self = this.set("bufferish", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncode(value: js.Any => Unit): Self = this.set("encode", js.Any.fromFunction1(value))
    @scala.inline
    def setEnd(value: js.Any => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def setFetch(value: () => Unit): Self = this.set("fetch", js.Any.fromFunction0(value))
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setMaxBufferSize(value: Double): Self = this.set("maxBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinBufferSize(value: Double): Self = this.set("minBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull(value: () => Double): Self = this.set("pull", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: js.Any => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: () => Double): Self = this.set("read", js.Any.fromFunction0(value))
    @scala.inline
    def setReserve(value: Double => Double): Self = this.set("reserve", js.Any.fromFunction1(value))
    @scala.inline
    def setSend(value: Buffer => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: js.Any => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}


package typings.nodelibFsWalk.streamMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProvider extends js.Object {
  val _reader: typings.nodelibFsWalk.readersAsyncMod.default = js.native
  val _root: js.Any = js.native
  val _settings: js.Any = js.native
  val _stream: Readable = js.native
  def read(): Readable = js.native
}

object StreamProvider {
  @scala.inline
  def apply(
    _reader: typings.nodelibFsWalk.readersAsyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    _stream: Readable,
    read: () => Readable
  ): StreamProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _stream = _stream.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[StreamProvider]
  }
  @scala.inline
  implicit class StreamProviderOps[Self <: StreamProvider] (val x: Self) extends AnyVal {
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
    def set_reader(value: typings.nodelibFsWalk.readersAsyncMod.default): Self = this.set("_reader", value.asInstanceOf[js.Any])
    @scala.inline
    def set_root(value: js.Any): Self = this.set("_root", value.asInstanceOf[js.Any])
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def set_stream(value: Readable): Self = this.set("_stream", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: () => Readable): Self = this.set("read", js.Any.fromFunction0(value))
  }
  
}


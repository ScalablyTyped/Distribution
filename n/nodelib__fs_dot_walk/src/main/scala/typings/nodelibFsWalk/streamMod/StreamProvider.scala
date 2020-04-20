package typings.nodelibFsWalk.streamMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamProvider extends js.Object {
  val _reader: typings.nodelibFsWalk.readersAsyncMod.default
  val _root: js.Any
  val _settings: js.Any
  val _stream: Readable
  def read(): Readable
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
}


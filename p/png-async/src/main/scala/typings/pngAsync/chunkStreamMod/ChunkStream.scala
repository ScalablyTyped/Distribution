package typings.pngAsync.chunkStreamMod

import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkStream extends Duplex {
  var _buffered: js.Any = js.native
  var _buffers: js.Any = js.native
  var _encoding: js.Any = js.native
  var _end: js.Any = js.native
  var _paused: js.Any = js.native
  var _process: js.Any = js.native
  var _reads: js.Any = js.native
  def _read(size: js.Any): Unit = js.native
  def _write(data: js.Any, encoding: js.Any, cb: js.Any): Boolean = js.native
  def destroySoon(): Unit = js.native
  def destroySoon(data: js.Any): Unit = js.native
  def read(length: js.Any): Unit = js.native
  def read(length: js.Any, callback: js.Any): Unit = js.native
}


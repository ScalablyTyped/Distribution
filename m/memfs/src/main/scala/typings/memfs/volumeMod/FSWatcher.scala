package typings.memfs.volumeMod

import typings.memfs.encodingMod.TDataOut
import typings.memfs.nodeMod.Link
import typings.node.BufferEncoding
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/volume", "FSWatcher")
@js.native
class FSWatcher protected () extends EventEmitter {
  def this(vol: Volume) = this()
  var _emit: js.Any = js.native
  var _encoding: BufferEncoding = js.native
  var _filename: String = js.native
  var _filenameEncoded: TDataOut = js.native
  var _getName: js.Any = js.native
  var _link: Link = js.native
  var _onNodeChange: js.Any = js.native
  var _onParentChild: js.Any = js.native
  var _persist: js.Any = js.native
  var _recursive: Boolean = js.native
  var _steps: js.Array[String] = js.native
  var _timer: js.Any = js.native
  var _vol: Volume = js.native
  def close(): Unit = js.native
  def start(path: PathLike): Unit = js.native
  def start(
    path: PathLike,
    persistent: js.UndefOr[scala.Nothing],
    recursive: js.UndefOr[scala.Nothing],
    encoding: BufferEncoding
  ): Unit = js.native
  def start(path: PathLike, persistent: js.UndefOr[scala.Nothing], recursive: Boolean): Unit = js.native
  def start(
    path: PathLike,
    persistent: js.UndefOr[scala.Nothing],
    recursive: Boolean,
    encoding: BufferEncoding
  ): Unit = js.native
  def start(path: PathLike, persistent: Boolean): Unit = js.native
  def start(
    path: PathLike,
    persistent: Boolean,
    recursive: js.UndefOr[scala.Nothing],
    encoding: BufferEncoding
  ): Unit = js.native
  def start(path: PathLike, persistent: Boolean, recursive: Boolean): Unit = js.native
  def start(path: PathLike, persistent: Boolean, recursive: Boolean, encoding: BufferEncoding): Unit = js.native
}


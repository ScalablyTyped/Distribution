package typings.memfs.volumeMod

import typings.memfs.encodingMod.TDataOut
import typings.memfs.nodeMod.Link
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/volume", "FSWatcher")
@js.native
open class FSWatcher protected () extends EventEmitter {
  def this(vol: Volume) = this()
  
  /* private */ var _emit: Any = js.native
  
  var _encoding: BufferEncoding = js.native
  
  var _filename: String = js.native
  
  var _filenameEncoded: TDataOut = js.native
  
  /* private */ var _getName: Any = js.native
  
  var _link: Link = js.native
  
  /* private */ var _onNodeChange: Any = js.native
  
  /* private */ var _onParentChild: Any = js.native
  
  /* private */ var _persist: Any = js.native
  
  var _recursive: Boolean = js.native
  
  var _steps: js.Array[String] = js.native
  
  var _timer: Any = js.native
  
  var _vol: Volume = js.native
  
  def close(): Unit = js.native
  
  def start(path: PathLike): Unit = js.native
  def start(path: PathLike, persistent: Boolean): Unit = js.native
  def start(path: PathLike, persistent: Boolean, recursive: Boolean): Unit = js.native
  def start(path: PathLike, persistent: Boolean, recursive: Boolean, encoding: BufferEncoding): Unit = js.native
  def start(path: PathLike, persistent: Boolean, recursive: Unit, encoding: BufferEncoding): Unit = js.native
  def start(path: PathLike, persistent: Unit, recursive: Boolean): Unit = js.native
  def start(path: PathLike, persistent: Unit, recursive: Boolean, encoding: BufferEncoding): Unit = js.native
  def start(path: PathLike, persistent: Unit, recursive: Unit, encoding: BufferEncoding): Unit = js.native
}

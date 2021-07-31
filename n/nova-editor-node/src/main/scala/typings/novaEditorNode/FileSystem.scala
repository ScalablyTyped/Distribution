package typings.novaEditorNode

import typings.novaEditorNode.anon.CURRENT
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystem extends StObject {
  
  var CURRENT: FileSystemBitField = js.native
  
  var END: FileSystemBitField = js.native
  
  var F_OK: FileSystemBitField = js.native
  
  var R_OK: FileSystemBitField = js.native
  
  var START: FileSystemBitField = js.native
  
  var W_OK: FileSystemBitField = js.native
  
  var X_OK: FileSystemBitField = js.native
  
  def access(path: String, modes: Double): Boolean = js.native
  
  var constants: CURRENT = js.native
  
  def copy(src: String, dest: String): Unit = js.native
  
  def copyAsync(src: String, dest: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def copyAsync[T](
    src: String,
    dest: String,
    callback: js.ThisFunction1[/* this */ T, /* err */ js.UndefOr[Error], Unit],
    thisValue: T
  ): Unit = js.native
  
  def eject(path: String): Unit = js.native
  
  def listdir(path: String): js.Array[String] = js.native
  
  def mkdir(path: String): Unit = js.native
  
  def move(src: String, dest: String): Unit = js.native
  
  def moveAsync(src: String, dest: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def moveAsync[T](
    src: String,
    dest: String,
    callback: js.ThisFunction1[/* this */ T, /* err */ js.UndefOr[Error], Unit],
    thisValue: T
  ): Unit = js.native
  
  def open(path: String): FileBinaryMode | FileTextMode = js.native
  def open(path: String, mode: String): FileBinaryMode | FileTextMode = js.native
  def open(path: String, mode: String, encoding: Encoding): FileBinaryMode | FileTextMode = js.native
  def open(path: String, mode: Unit, encoding: Encoding): FileBinaryMode | FileTextMode = js.native
  
  def remove(path: String): Unit = js.native
  
  def reveal(path: String): Unit = js.native
  
  def rmdir(path: String): Unit = js.native
  
  def stat(path: String): FileStats | Null = js.native
  
  def watch(pattern: String, callable: js.Function1[/* path */ String, Unit]): FileSystemWatcher = js.native
  def watch(pattern: Null, callable: js.Function1[/* path */ String, Unit]): FileSystemWatcher = js.native
}

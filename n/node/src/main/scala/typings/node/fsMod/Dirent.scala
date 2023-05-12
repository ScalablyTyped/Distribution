package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "Dirent")
@js.native
open class Dirent () extends StObject {
  
  /**
    * Returns `true` if the `fs.Dirent` object describes a block device.
    * @since v10.10.0
    */
  def isBlockDevice(): Boolean = js.native
  
  /**
    * Returns `true` if the `fs.Dirent` object describes a character device.
    * @since v10.10.0
    */
  def isCharacterDevice(): Boolean = js.native
  
  /**
    * Returns `true` if the `fs.Dirent` object describes a file system
    * directory.
    * @since v10.10.0
    */
  def isDirectory(): Boolean = js.native
  
  /**
    * Returns `true` if the `fs.Dirent` object describes a first-in-first-out
    * (FIFO) pipe.
    * @since v10.10.0
    */
  def isFIFO(): Boolean = js.native
  
  /**
    * Returns `true` if the `fs.Dirent` object describes a regular file.
    * @since v10.10.0
    */
  def isFile(): Boolean = js.native
  
  /**
    * Returns `true` if the `fs.Dirent` object describes a socket.
    * @since v10.10.0
    */
  def isSocket(): Boolean = js.native
  
  /**
    * Returns `true` if the `fs.Dirent` object describes a symbolic link.
    * @since v10.10.0
    */
  def isSymbolicLink(): Boolean = js.native
  
  /**
    * The file name that this `fs.Dirent` object refers to. The type of this
    * value is determined by the `options.encoding` passed to {@link readdir} or {@link readdirSync}.
    * @since v10.10.0
    */
  var name: String = js.native
  
  /**
    * The base path that this `fs.Dirent` object refers to.
    * @since v20.1.0
    */
  var path: String = js.native
}

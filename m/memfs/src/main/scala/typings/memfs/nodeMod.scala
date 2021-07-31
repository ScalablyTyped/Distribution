package typings.memfs

import org.scalablytyped.runtime.StringDictionary
import typings.memfs.anon.Atime
import typings.memfs.anon.Children
import typings.memfs.statsMod.default
import typings.memfs.volumeMod.Volume
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("memfs/lib/node", "File")
  @js.native
  class File protected () extends StObject {
    /**
      * Open a Link-Node pair. `node` is provided separately as that might be a different node
      * rather the one `link` points to, because it might be a symlink.
      * @param link
      * @param node
      * @param flags
      * @param fd
      */
    def this(link: Link, node: Node, flags: Double, fd: Double) = this()
    
    def chmod(perm: Double): Unit = js.native
    
    def chown(uid: Double, gid: Double): Unit = js.native
    
    var fd: Double = js.native
    
    var flags: Double = js.native
    
    def getBuffer(): Buffer = js.native
    
    def getSize(): Double = js.native
    
    def getString(): String = js.native
    def getString(encoding: String): String = js.native
    
    /**
      * Hard link that this file opened.
      * @type {any}
      */
    var link: Link = js.native
    
    /**
      * Reference to a `Node`.
      * @type {Node}
      */
    var node: Node = js.native
    
    /**
      * A cursor/offset position in a file, where data will be written on write.
      * User can "seek" this position.
      */
    var position: Double = js.native
    
    def read(buf: Buffer): Double = js.native
    def read(buf: Buffer, offset: Double): Double = js.native
    def read(buf: Buffer, offset: Double, length: Double): Double = js.native
    def read(buf: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    def read(buf: Buffer, offset: Double, length: Unit, position: Double): Double = js.native
    def read(buf: Buffer, offset: Unit, length: Double): Double = js.native
    def read(buf: Buffer, offset: Unit, length: Double, position: Double): Double = js.native
    def read(buf: Buffer, offset: Unit, length: Unit, position: Double): Double = js.native
    def read(buf: Uint8Array): Double = js.native
    def read(buf: Uint8Array, offset: Double): Double = js.native
    def read(buf: Uint8Array, offset: Double, length: Double): Double = js.native
    def read(buf: Uint8Array, offset: Double, length: Double, position: Double): Double = js.native
    def read(buf: Uint8Array, offset: Double, length: Unit, position: Double): Double = js.native
    def read(buf: Uint8Array, offset: Unit, length: Double): Double = js.native
    def read(buf: Uint8Array, offset: Unit, length: Double, position: Double): Double = js.native
    def read(buf: Uint8Array, offset: Unit, length: Unit, position: Double): Double = js.native
    
    def seekTo(position: Double): Unit = js.native
    
    def setBuffer(buf: Buffer): Unit = js.native
    
    def setString(str: String): Unit = js.native
    
    def stats(): default[Double] = js.native
    
    def truncate(): Unit = js.native
    def truncate(len: Double): Unit = js.native
    
    def write(buf: Buffer): Double = js.native
    def write(buf: Buffer, offset: Double): Double = js.native
    def write(buf: Buffer, offset: Double, length: Double): Double = js.native
    def write(buf: Buffer, offset: Double, length: Double, position: Double): Double = js.native
    def write(buf: Buffer, offset: Double, length: Unit, position: Double): Double = js.native
    def write(buf: Buffer, offset: Unit, length: Double): Double = js.native
    def write(buf: Buffer, offset: Unit, length: Double, position: Double): Double = js.native
    def write(buf: Buffer, offset: Unit, length: Unit, position: Double): Double = js.native
  }
  
  @JSImport("memfs/lib/node", "Link")
  @js.native
  class Link protected () extends EventEmitter {
    def this(vol: Volume, parent: Link, name: String) = this()
    
    var children: StringDictionary[js.UndefOr[Link]] = js.native
    
    def createChild(name: String): Link = js.native
    def createChild(name: String, node: Node): Link = js.native
    
    def deleteChild(link: Link): Unit = js.native
    
    def getChild(name: String): js.UndefOr[Link] = js.native
    
    def getName(): String = js.native
    
    def getNode(): Node = js.native
    
    def getPath(): String = js.native
    
    var ino: Double = js.native
    
    var length: Double = js.native
    
    var node: Node = js.native
    
    var parent: Link = js.native
    
    def setChild(name: String): Link = js.native
    def setChild(name: String, link: Link): Link = js.native
    
    def setNode(node: Node): Unit = js.native
    
    var steps: js.Array[String] = js.native
    
    def toJSON(): Children = js.native
    
    var vol: Volume = js.native
    
    /**
      * Walk the tree path and return the `Link` at that location, if any.
      * @param steps {string[]} Desired location.
      * @param stop {number} Max steps to go into.
      * @param i {number} Current step in the `steps` array.
      *
      * @return {Link|null}
      */
    def walk(steps: js.Array[String]): Link | Null = js.native
    def walk(steps: js.Array[String], stop: Double): Link | Null = js.native
    def walk(steps: js.Array[String], stop: Double, i: Double): Link | Null = js.native
    def walk(steps: js.Array[String], stop: Unit, i: Double): Link | Null = js.native
  }
  
  @JSImport("memfs/lib/node", "Node")
  @js.native
  class Node protected () extends EventEmitter {
    def this(ino: Double) = this()
    def this(ino: Double, perm: Double) = this()
    
    var atime: Date = js.native
    
    var buf: Buffer = js.native
    
    def canRead(): Boolean = js.native
    def canRead(uid: Double): Boolean = js.native
    def canRead(uid: Double, gid: Double): Boolean = js.native
    def canRead(uid: Unit, gid: Double): Boolean = js.native
    
    def canWrite(): Boolean = js.native
    def canWrite(uid: Double): Boolean = js.native
    def canWrite(uid: Double, gid: Double): Boolean = js.native
    def canWrite(uid: Unit, gid: Double): Boolean = js.native
    
    def chmod(perm: Double): Unit = js.native
    
    def chown(uid: Double, gid: Double): Unit = js.native
    
    var ctime: Date = js.native
    
    def del(): Unit = js.native
    
    def getBuffer(): Buffer = js.native
    
    def getSize(): Double = js.native
    
    def getString(): String = js.native
    def getString(encoding: String): String = js.native
    
    var gid: Double = js.native
    
    var ino: Double = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSymlink(): Boolean = js.native
    
    def makeSymlink(steps: js.Array[String]): Unit = js.native
    
    var mode: Double = js.native
    
    var mtime: Date = js.native
    
    var nlink: Double = js.native
    
    var perm: Double = js.native
    
    def read(buf: Buffer): Double = js.native
    def read(buf: Buffer, off: Double): Double = js.native
    def read(buf: Buffer, off: Double, len: Double): Double = js.native
    def read(buf: Buffer, off: Double, len: Double, pos: Double): Double = js.native
    def read(buf: Buffer, off: Double, len: Unit, pos: Double): Double = js.native
    def read(buf: Buffer, off: Unit, len: Double): Double = js.native
    def read(buf: Buffer, off: Unit, len: Double, pos: Double): Double = js.native
    def read(buf: Buffer, off: Unit, len: Unit, pos: Double): Double = js.native
    def read(buf: Uint8Array): Double = js.native
    def read(buf: Uint8Array, off: Double): Double = js.native
    def read(buf: Uint8Array, off: Double, len: Double): Double = js.native
    def read(buf: Uint8Array, off: Double, len: Double, pos: Double): Double = js.native
    def read(buf: Uint8Array, off: Double, len: Unit, pos: Double): Double = js.native
    def read(buf: Uint8Array, off: Unit, len: Double): Double = js.native
    def read(buf: Uint8Array, off: Unit, len: Double, pos: Double): Double = js.native
    def read(buf: Uint8Array, off: Unit, len: Unit, pos: Double): Double = js.native
    
    def setBuffer(buf: Buffer): Unit = js.native
    
    def setIsDirectory(): Unit = js.native
    
    def setIsFile(): Unit = js.native
    
    def setIsSymlink(): Unit = js.native
    
    def setModeProperty(property: Double): Unit = js.native
    
    def setString(str: String): Unit = js.native
    
    var symlink: js.Array[String] = js.native
    
    def toJSON(): Atime = js.native
    
    def touch(): Unit = js.native
    
    def truncate(): Unit = js.native
    def truncate(len: Double): Unit = js.native
    
    var uid: Double = js.native
    
    def write(buf: Buffer): Double = js.native
    def write(buf: Buffer, off: Double): Double = js.native
    def write(buf: Buffer, off: Double, len: Double): Double = js.native
    def write(buf: Buffer, off: Double, len: Double, pos: Double): Double = js.native
    def write(buf: Buffer, off: Double, len: Unit, pos: Double): Double = js.native
    def write(buf: Buffer, off: Unit, len: Double): Double = js.native
    def write(buf: Buffer, off: Unit, len: Double, pos: Double): Double = js.native
    def write(buf: Buffer, off: Unit, len: Unit, pos: Double): Double = js.native
  }
  
  @JSImport("memfs/lib/node", "SEP")
  @js.native
  val SEP: /* "/" */ String = js.native
}

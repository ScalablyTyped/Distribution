package typings.memfs

import typings.memfs.memfsBooleans.`false`
import typings.memfs.memfsBooleans.`true`
import typings.memfs.nodeMod.Node
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/Stats", JSImport.Namespace)
@js.native
object statsMod extends js.Object {
  
  @js.native
  class Stats[T] () extends js.Object {
    
    var _checkModeProperty: js.Any = js.native
    
    var atime: Date = js.native
    
    var atimeMs: T = js.native
    
    var birthtime: Date = js.native
    
    var birthtimeMs: T = js.native
    
    var blksize: T = js.native
    
    var blocks: T = js.native
    
    var ctime: Date = js.native
    
    var ctimeMs: T = js.native
    
    var dev: T = js.native
    
    var gid: T = js.native
    
    var ino: T = js.native
    
    def isBlockDevice(): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    
    var mode: T = js.native
    
    var mtime: Date = js.native
    
    var mtimeMs: T = js.native
    
    var nlink: T = js.native
    
    var rdev: T = js.native
    
    var size: T = js.native
    
    var uid: T = js.native
  }
  /* static members */
  @js.native
  object Stats extends js.Object {
    
    def build(node: Node): Stats[TStatNumber] = js.native
    def build(node: Node, bigint: Boolean): Stats[TStatNumber] = js.native
    @JSName("build")
    def build_false(node: Node, bigint: `false`): Stats[Double] = js.native
    @JSName("build")
    def build_true(node: Node, bigint: `true`): Stats[js.BigInt] = js.native
  }
  
  @js.native
  class default[T] () extends Stats[T]
  /* static members */
  @js.native
  object default extends js.Object {
    
    def build(node: Node): Stats[TStatNumber] = js.native
    def build(node: Node, bigint: Boolean): Stats[TStatNumber] = js.native
    @JSName("build")
    def build_false(node: Node, bigint: `false`): Stats[Double] = js.native
    @JSName("build")
    def build_true(node: Node, bigint: `true`): Stats[js.BigInt] = js.native
  }
  
  type TStatNumber = Double | js.BigInt
}

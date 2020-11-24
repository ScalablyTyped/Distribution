package typings.memfs

import typings.memfs.encodingMod.TDataOut
import typings.memfs.encodingMod.TEncodingExtended
import typings.memfs.nodeMod.Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/Dirent", JSImport.Namespace)
@js.native
object direntMod extends js.Object {
  
  @js.native
  class Dirent () extends js.Object {
    
    var _checkModeProperty: js.Any = js.native
    
    def isBlockDevice(): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    
    var mode: js.Any = js.native
    
    var name: TDataOut = js.native
  }
  /* static members */
  @js.native
  object Dirent extends js.Object {
    
    def build(link: Link): Dirent = js.native
    def build(link: Link, encoding: TEncodingExtended): Dirent = js.native
  }
  
  @js.native
  class default () extends Dirent
  /* static members */
  @js.native
  object default extends js.Object {
    
    def build(link: Link): Dirent = js.native
    def build(link: Link, encoding: TEncodingExtended): Dirent = js.native
  }
}

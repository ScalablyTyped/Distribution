package typings.memfs

import typings.memfs.encodingMod.TDataOut
import typings.memfs.encodingMod.TEncodingExtended
import typings.memfs.nodeMod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object direntMod {
  
  @JSImport("memfs/lib/Dirent", JSImport.Default)
  @js.native
  class default () extends Dirent
  /* static members */
  object default {
    
    @JSImport("memfs/lib/Dirent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(link: Link): Dirent = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(link.asInstanceOf[js.Any]).asInstanceOf[Dirent]
    inline def build(link: Link, encoding: TEncodingExtended): Dirent = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(link.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Dirent]
  }
  
  @JSImport("memfs/lib/Dirent", "Dirent")
  @js.native
  class Dirent () extends StObject {
    
    /* private */ var _checkModeProperty: js.Any = js.native
    
    def isBlockDevice(): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    
    /* private */ var mode: js.Any = js.native
    
    var name: TDataOut = js.native
  }
  /* static members */
  object Dirent {
    
    @JSImport("memfs/lib/Dirent", "Dirent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(link: Link): Dirent = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(link.asInstanceOf[js.Any]).asInstanceOf[Dirent]
    inline def build(link: Link, encoding: TEncodingExtended): Dirent = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(link.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Dirent]
  }
}

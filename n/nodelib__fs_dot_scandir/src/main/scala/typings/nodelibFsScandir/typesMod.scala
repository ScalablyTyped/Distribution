package typings.nodelibFsScandir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Dirent extends StObject {
    
    def isBlockDevice(): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    
    var name: String = js.native
  }
  object Dirent {
    
    @scala.inline
    def apply(
      isBlockDevice: () => Boolean,
      isCharacterDevice: () => Boolean,
      isDirectory: () => Boolean,
      isFIFO: () => Boolean,
      isFile: () => Boolean,
      isSocket: () => Boolean,
      isSymbolicLink: () => Boolean,
      name: String
    ): Dirent = {
      val __obj = js.Dynamic.literal(isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dirent]
    }
    
    @scala.inline
    implicit class DirentMutableBuilder[Self <: Dirent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsBlockDevice(value: () => Boolean): Self = StObject.set(x, "isBlockDevice", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCharacterDevice(value: () => Boolean): Self = StObject.set(x, "isCharacterDevice", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFIFO(value: () => Boolean): Self = StObject.set(x, "isFIFO", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSocket(value: () => Boolean): Self = StObject.set(x, "isSocket", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Entry extends StObject {
    
    var dirent: Dirent = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var stats: js.UndefOr[Stats] = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(dirent: Dirent, name: String, path: String): Entry = {
      val __obj = js.Dynamic.literal(dirent = dirent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirent(value: Dirent): Self = StObject.set(x, "dirent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  type Stats = typings.node.fsMod.Stats
}

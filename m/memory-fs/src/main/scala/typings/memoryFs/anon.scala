package typings.memoryFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    @scala.inline
    def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsBlockDevice extends StObject {
    
    def isBlockDevice(): Boolean
    
    def isCharacterDevice(): Boolean
    
    def isDirectory(): Boolean
    
    def isFIFO(): Boolean
    
    def isFile(): Boolean
    
    def isSocket(): Boolean
    
    def isSymbolicLink(): Boolean
  }
  object IsBlockDevice {
    
    @scala.inline
    def apply(
      isBlockDevice: () => Boolean,
      isCharacterDevice: () => Boolean,
      isDirectory: () => Boolean,
      isFIFO: () => Boolean,
      isFile: () => Boolean,
      isSocket: () => Boolean,
      isSymbolicLink: () => Boolean
    ): IsBlockDevice = {
      val __obj = js.Dynamic.literal(isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink))
      __obj.asInstanceOf[IsBlockDevice]
    }
    
    @scala.inline
    implicit class IsBlockDeviceMutableBuilder[Self <: IsBlockDevice] (val x: Self) extends AnyVal {
      
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
    }
  }
}

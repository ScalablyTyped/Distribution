package typings.nodegit

import typings.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexEntryMod {
  
  @JSImport("nodegit/index-entry", "IndexEntry")
  @js.native
  class IndexEntry () extends StObject {
    
    var ctime: IndexTime = js.native
    
    var dev: Double = js.native
    
    var fileSize: Double = js.native
    
    var flags: Double = js.native
    
    var flagsExtended: Double = js.native
    
    var gid: Double = js.native
    
    var id: Oid = js.native
    
    var ino: Double = js.native
    
    var mode: Double = js.native
    
    var mtime: IndexTime = js.native
    
    var path: String = js.native
    
    var uid: Double = js.native
  }
  
  trait IndexTime extends StObject {
    
    def nanoseconds(): Double
    
    def seconds(): Double
  }
  object IndexTime {
    
    @scala.inline
    def apply(nanoseconds: () => Double, seconds: () => Double): IndexTime = {
      val __obj = js.Dynamic.literal(nanoseconds = js.Any.fromFunction0(nanoseconds), seconds = js.Any.fromFunction0(seconds))
      __obj.asInstanceOf[IndexTime]
    }
    
    @scala.inline
    implicit class IndexTimeMutableBuilder[Self <: IndexTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNanoseconds(value: () => Double): Self = StObject.set(x, "nanoseconds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSeconds(value: () => Double): Self = StObject.set(x, "seconds", js.Any.fromFunction0(value))
    }
  }
}

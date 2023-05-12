package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvAutoBufferMod {
  
  @JSImport("mirada/dist/src/types/opencv/AutoBuffer", "AutoBuffer")
  @js.native
  open class AutoBuffer () extends StObject {
    def this(_size: sizeT) = this()
    def this(buf: AutoBuffer) = this()
    
    def allocate(_size: sizeT): Unit = js.native
    
    def data(): Any = js.native
    
    def deallocate(): Unit = js.native
    
    def resize(_size: sizeT): Unit = js.native
    
    def size(): sizeT = js.native
  }
}

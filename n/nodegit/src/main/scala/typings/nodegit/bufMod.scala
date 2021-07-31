package typings.nodegit

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufMod {
  
  @JSImport("nodegit/buf", "Buf")
  @js.native
  class Buf () extends StObject {
    
    var asize: Double = js.native
    
    def containsNul(): Double = js.native
    
    def free(): Unit = js.native
    
    def grow(targetSize: Double): js.Promise[Buf] = js.native
    
    def isBinary(): Double = js.native
    
    var ptr: String = js.native
    
    def set(data: Buffer, datalen: Double): js.Promise[Buf] = js.native
    
    var size: Double = js.native
  }
}

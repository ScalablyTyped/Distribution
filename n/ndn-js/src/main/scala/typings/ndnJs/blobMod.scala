package typings.ndnJs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js/blob", JSImport.Namespace)
@js.native
object blobMod extends js.Object {
  
  @js.native
  class Blob () extends js.Object {
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: Blob) = this()
    def this(value: Buffer) = this()
    def this(value: Buffer, copy: Boolean) = this()
    
    def buf(): Buffer = js.native
    
    def equals(other: Blob): Boolean = js.native
    
    def isNull(): Boolean = js.native
    
    def size(): Double = js.native
  }
  
  @js.native
  class SignedBlob () extends Blob {
    def this(value: js.Array[Double], signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
    def this(value: Blob, signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
    def this(value: Buffer, signedPortionBeginOffset: Double, signedPortionEndOffset: Double) = this()
    
    def getSignedPortionBeginOffset(): Double = js.native
    
    def getSignedPortionEndOffset(): Double = js.native
    
    def signedBuf(): Buffer = js.native
    
    def signedSize(): Double = js.native
  }
}

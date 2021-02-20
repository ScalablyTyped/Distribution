package typings.ndnJs

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blobMod {
  
  @JSImport("ndn-js/blob", "Blob")
  @js.native
  class Blob () extends StObject {
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
  
  @JSImport("ndn-js/blob", "SignedBlob")
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

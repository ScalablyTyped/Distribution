package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  def exportChallenge(spkac: BinaryLike): Buffer
  
  def exportPublicKey(spkac: BinaryLike): Buffer
  
  def verifySpkac(spkac: ArrayBufferView): Boolean
}
object Certificate {
  
  @JSImport("crypto", "Certificate")
  @js.native
  def apply(): Certificate = js.native
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportChallenge(value: BinaryLike => Buffer): Self = StObject.set(x, "exportChallenge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExportPublicKey(value: BinaryLike => Buffer): Self = StObject.set(x, "exportPublicKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerifySpkac(value: ArrayBufferView => Boolean): Self = StObject.set(x, "verifySpkac", js.Any.fromFunction1(value))
  }
}

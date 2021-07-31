package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("crypto", "Certificate")
@js.native
class CertificateCls ()
  extends StObject
     with Certificate {
  
  /* CompleteClass */
  override def exportChallenge(spkac: BinaryLike): Buffer = js.native
  
  /* CompleteClass */
  override def exportPublicKey(spkac: BinaryLike): Buffer = js.native
  
  /* CompleteClass */
  override def verifySpkac(spkac: ArrayBufferView): Boolean = js.native
}

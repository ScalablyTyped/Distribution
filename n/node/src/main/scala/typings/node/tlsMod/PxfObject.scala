package typings.node.tlsMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PxfObject extends StObject {
  
  /**
    * PFX or PKCS12 encoded private key and certificate chain.
    */
  var buf: String | Buffer = js.native
  
  /**
    * Optional passphrase.
    */
  var passphrase: js.UndefOr[String] = js.native
}
object PxfObject {
  
  @scala.inline
  def apply(buf: String | Buffer): PxfObject = {
    val __obj = js.Dynamic.literal(buf = buf.asInstanceOf[js.Any])
    __obj.asInstanceOf[PxfObject]
  }
  
  @scala.inline
  implicit class PxfObjectMutableBuilder[Self <: PxfObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuf(value: String | Buffer): Self = StObject.set(x, "buf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}

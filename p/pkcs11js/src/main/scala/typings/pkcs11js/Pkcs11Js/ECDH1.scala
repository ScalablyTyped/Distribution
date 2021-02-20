package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECDH1 extends IParams {
  
  var kdf: Double = js.native
  
  var publicData: Buffer = js.native
  
  var sharedData: js.UndefOr[Buffer] = js.native
}
object ECDH1 {
  
  @scala.inline
  def apply(kdf: Double, publicData: Buffer, `type`: Double): ECDH1 = {
    val __obj = js.Dynamic.literal(kdf = kdf.asInstanceOf[js.Any], publicData = publicData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDH1]
  }
  
  @scala.inline
  implicit class ECDH1MutableBuilder[Self <: ECDH1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKdf(value: Double): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicData(value: Buffer): Self = StObject.set(x, "publicData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedData(value: Buffer): Self = StObject.set(x, "sharedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDataUndefined: Self = StObject.set(x, "sharedData", js.undefined)
  }
}

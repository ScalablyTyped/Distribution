package typings.onflowFlowJsTesting

import typings.node.bufferMod.global.Buffer
import typings.onflowFlowJsTesting.onflowFlowJsTestingInts.`1`
import typings.onflowFlowJsTesting.onflowFlowJsTestingInts.`2`
import typings.onflowFlowJsTesting.onflowFlowJsTestingInts.`3`
import typings.onflowFlowJsTesting.srcAccountMod.KeyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCryptoMod {
  
  @JSImport("@onflow/flow-js-testing/src/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HashAlgorithm extends StObject {
    
    var SHA2_256: `1`
    
    var SHA3_256: `3`
  }
  object HashAlgorithm {
    
    @JSImport("@onflow/flow-js-testing/src/crypto", "HashAlgorithm")
    @js.native
    val ^ : HashAlgorithm = js.native
    
    extension [Self <: HashAlgorithm](x: Self) {
      
      inline def setSHA2_256(value: `1`): Self = StObject.set(x, "SHA2_256", value.asInstanceOf[js.Any])
      
      inline def setSHA3_256(value: `3`): Self = StObject.set(x, "SHA3_256", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignatureAlgorithm extends StObject {
    
    var ECDSA_P256: `2`
    
    var ECDSA_secp256k1: `3`
  }
  object SignatureAlgorithm {
    
    @JSImport("@onflow/flow-js-testing/src/crypto", "SignatureAlgorithm")
    @js.native
    val ^ : SignatureAlgorithm = js.native
    
    extension [Self <: SignatureAlgorithm](x: Self) {
      
      inline def setECDSA_P256(value: `2`): Self = StObject.set(x, "ECDSA_P256", value.asInstanceOf[js.Any])
      
      inline def setECDSA_secp256k1(value: `3`): Self = StObject.set(x, "ECDSA_secp256k1", value.asInstanceOf[js.Any])
    }
  }
  
  inline def pubFlowKey(keyObject: KeyObject): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("pubFlowKey")(keyObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
}

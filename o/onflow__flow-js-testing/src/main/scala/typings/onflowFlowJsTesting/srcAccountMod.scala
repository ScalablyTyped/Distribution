package typings.onflowFlowJsTesting

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.onflowFlowJsTesting.anon.Keys
import typings.onflowFlowJsTesting.srcCryptoMod.HashAlgorithm
import typings.onflowFlowJsTesting.srcCryptoMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAccountMod {
  
  @JSImport("@onflow/flow-js-testing/src/account", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAccount(props: Keys): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getAccountAddress(alias: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountAddress")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  type Address = String
  
  type AddressMap = StringDictionary[Address]
  
  trait KeyObject extends StObject {
    
    var hashAlgorithm: js.UndefOr[ValueOf[HashAlgorithm]] = js.undefined
    
    var privateKey: String
    
    var signatureAlgorithm: js.UndefOr[ValueOf[SignatureAlgorithm]] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object KeyObject {
    
    inline def apply(privateKey: String): KeyObject = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyObject]
    }
    
    extension [Self <: KeyObject](x: Self) {
      
      inline def setHashAlgorithm(value: ValueOf[HashAlgorithm]): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithm(value: ValueOf[SignatureAlgorithm]): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type PublicKey = Buffer
  
  trait SignerInfo extends StObject {
    
    var addr: Address
    
    var hashAlgorithm: js.UndefOr[ValueOf[HashAlgorithm]] = js.undefined
    
    var keyId: js.UndefOr[Double] = js.undefined
    
    var privateKey: js.UndefOr[String] = js.undefined
    
    var signatureAlgorithm: js.UndefOr[ValueOf[SignatureAlgorithm]] = js.undefined
  }
  object SignerInfo {
    
    inline def apply(addr: Address): SignerInfo = {
      val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignerInfo]
    }
    
    extension [Self <: SignerInfo](x: Self) {
      
      inline def setAddr(value: Address): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithm(value: ValueOf[HashAlgorithm]): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
      
      inline def setKeyId(value: Double): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setSignatureAlgorithm(value: ValueOf[SignatureAlgorithm]): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    }
  }
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

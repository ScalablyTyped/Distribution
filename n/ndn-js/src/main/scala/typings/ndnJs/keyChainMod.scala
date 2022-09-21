package typings.ndnJs

import typings.ndnJs.dataMod.Data
import typings.ndnJs.interestMod.Interest
import typings.ndnJs.keyChainMod.SigningInfo.SignerType
import typings.ndnJs.nameMod.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyChainMod {
  
  @JSImport("ndn-js/key-chain", "CertificateV2")
  @js.native
  open class CertificateV2 () extends StObject
  
  @JSImport("ndn-js/key-chain", "KeyChain")
  @js.native
  open class KeyChain () extends StObject {
    def this(pibLocator: String, tpmLocator: String) = this()
    def this(pibLocator: String, tpmLocator: String, allowReset: Boolean) = this()
    
    def addCertificate(key: PibKey, certificate: CertificateV2): Unit = js.native
    def addCertificate(key: PibKey, certificate: CertificateV2, onComplete: js.Function0[Any]): Unit = js.native
    def addCertificate(
      key: PibKey,
      certificate: CertificateV2,
      onComplete: js.Function0[Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def addCertificate(
      key: PibKey,
      certificate: CertificateV2,
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    
    def createIdentityV2(identityName: Name): PibIdentity = js.native
    def createIdentityV2(identityName: Name, onComplete: js.Function1[/* identity */ PibIdentity, Any]): Unit = js.native
    def createIdentityV2(
      identityName: Name,
      onComplete: js.Function1[/* identity */ PibIdentity, Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def createIdentityV2(identityName: Name, params: KeyParams): PibIdentity = js.native
    def createIdentityV2(identityName: Name, params: KeyParams, onComplete: js.Function1[/* identity */ PibIdentity, Any]): Unit = js.native
    def createIdentityV2(
      identityName: Name,
      params: KeyParams,
      onComplete: js.Function1[/* identity */ PibIdentity, Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    
    def createKey(identity: PibIdentity): PibKey = js.native
    def createKey(identity: PibIdentity, onComplete: js.Function1[/* key */ PibKey, Any]): Unit = js.native
    def createKey(
      identity: PibIdentity,
      onComplete: js.Function1[/* key */ PibKey, Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def createKey(identity: PibIdentity, params: KeyParams): PibKey = js.native
    def createKey(identity: PibIdentity, params: KeyParams, onComplete: js.Function1[/* key */ PibKey, Any]): Unit = js.native
    def createKey(
      identity: PibIdentity,
      params: KeyParams,
      onComplete: js.Function1[/* key */ PibKey, Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    
    def deleteCertificate(key: PibKey, certificateName: Name): Unit = js.native
    def deleteCertificate(key: PibKey, certificateName: Name, onComplete: js.Function0[Any]): Unit = js.native
    def deleteCertificate(
      key: PibKey,
      certificateName: Name,
      onComplete: js.Function0[Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def deleteCertificate(key: PibKey, certificateName: Name, onComplete: Unit, onError: js.Function1[/* err */ Any, Any]): Unit = js.native
    
    def deleteIdentity(identity: PibIdentity): Unit = js.native
    def deleteIdentity(identity: PibIdentity, onComplete: js.Function0[Any]): Unit = js.native
    def deleteIdentity(identity: PibIdentity, onComplete: js.Function0[Any], onError: js.Function1[/* err */ Any, Any]): Unit = js.native
    def deleteIdentity(identity: PibIdentity, onComplete: Unit, onError: js.Function1[/* err */ Any, Any]): Unit = js.native
    
    def deleteKey(identity: PibIdentity, key: PibKey): Unit = js.native
    def deleteKey(identity: PibIdentity, key: PibKey, onComplete: js.Function0[Any]): Unit = js.native
    def deleteKey(
      identity: PibIdentity,
      key: PibKey,
      onComplete: js.Function0[Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def deleteKey(identity: PibIdentity, key: PibKey, onComplete: Unit, onError: js.Function1[/* err */ Any, Any]): Unit = js.native
    
    def getPib(): Pib = js.native
    
    def getTpm(): Tpm = js.native
    
    def setDefaultCertificate(key: PibKey, certificate: CertificateV2): Unit = js.native
    def setDefaultCertificate(key: PibKey, certificate: CertificateV2, onComplete: js.Function0[Any]): Unit = js.native
    def setDefaultCertificate(
      key: PibKey,
      certificate: CertificateV2,
      onComplete: js.Function0[Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def setDefaultCertificate(
      key: PibKey,
      certificate: CertificateV2,
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    
    def setDefaultIdentity(identity: PibIdentity): Unit = js.native
    def setDefaultIdentity(identity: PibIdentity, onComplete: js.Function0[Any]): Unit = js.native
    def setDefaultIdentity(identity: PibIdentity, onComplete: js.Function0[Any], onError: js.Function1[/* err */ Any, Any]): Unit = js.native
    def setDefaultIdentity(identity: PibIdentity, onComplete: Unit, onError: js.Function1[/* err */ Any, Any]): Unit = js.native
    
    def setDefaultKey(identity: PibIdentity, key: PibKey): Unit = js.native
    def setDefaultKey(identity: PibIdentity, key: PibKey, onComplete: js.Function0[Any]): Unit = js.native
    def setDefaultKey(
      identity: PibIdentity,
      key: PibKey,
      onComplete: js.Function0[Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def setDefaultKey(identity: PibIdentity, key: PibKey, onComplete: Unit, onError: js.Function1[/* err */ Any, Any]): Unit = js.native
    
    def sign(data: Data, params: SigningInfo): Unit = js.native
    def sign(data: Data, params: SigningInfo, onComplete: js.Function1[/* data */ Data, Any]): Unit = js.native
    def sign(
      data: Data,
      params: SigningInfo,
      onComplete: js.Function1[/* data */ Data, Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def sign(data: Data, params: SigningInfo, onComplete: Unit, onError: js.Function1[/* err */ Any, Any]): Unit = js.native
    def sign(interest: Interest, params: SigningInfo): Unit = js.native
    def sign(interest: Interest, params: SigningInfo, onComplete: js.Function1[/* interest */ Interest, Any]): Unit = js.native
    def sign(
      interest: Interest,
      params: SigningInfo,
      onComplete: js.Function1[/* interest */ Interest, Any],
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def sign(
      interest: Interest,
      params: SigningInfo,
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    
    def signWithSha256(packet: Data): Unit = js.native
    def signWithSha256(packet: Interest): Unit = js.native
  }
  /* static members */
  object KeyChain {
    
    @JSImport("ndn-js/key-chain", "KeyChain")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultKeyParams(): KeyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKeyParams")().asInstanceOf[KeyParams]
  }
  
  @JSImport("ndn-js/key-chain", "KeyParams")
  @js.native
  open class KeyParams () extends StObject
  
  @JSImport("ndn-js/key-chain", "Pib")
  @js.native
  open class Pib () extends StObject
  
  @JSImport("ndn-js/key-chain", "PibIdentity")
  @js.native
  open class PibIdentity () extends StObject
  
  @JSImport("ndn-js/key-chain", "PibKey")
  @js.native
  open class PibKey () extends StObject
  
  @JSImport("ndn-js/key-chain", "SigningInfo")
  @js.native
  open class SigningInfo () extends StObject {
    def this(arg: String) = this()
    def this(arg: PibIdentity) = this()
    def this(arg: PibKey) = this()
    def this(arg: SigningInfo) = this()
    def this(signerType: SignerType, signerName: Name) = this()
    
    def getSignerName(): Name = js.native
    
    def getSignerType(): SignerType = js.native
  }
  object SigningInfo {
    
    @js.native
    sealed trait SignerType extends StObject
    @JSImport("ndn-js/key-chain", "SigningInfo.SignerType")
    @js.native
    object SignerType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[SignerType & Double] = js.native
      
      @js.native
      sealed trait CERT
        extends StObject
           with SignerType
      /* 3 */ val CERT: typings.ndnJs.keyChainMod.SigningInfo.SignerType.CERT & Double = js.native
      
      @js.native
      sealed trait ID
        extends StObject
           with SignerType
      /* 1 */ val ID: typings.ndnJs.keyChainMod.SigningInfo.SignerType.ID & Double = js.native
      
      @js.native
      sealed trait KEY
        extends StObject
           with SignerType
      /* 2 */ val KEY: typings.ndnJs.keyChainMod.SigningInfo.SignerType.KEY & Double = js.native
      
      @js.native
      sealed trait NULL
        extends StObject
           with SignerType
      /* 0 */ val NULL: typings.ndnJs.keyChainMod.SigningInfo.SignerType.NULL & Double = js.native
      
      @js.native
      sealed trait SHA256
        extends StObject
           with SignerType
      /* 4 */ val SHA256: typings.ndnJs.keyChainMod.SigningInfo.SignerType.SHA256 & Double = js.native
    }
  }
  
  @JSImport("ndn-js/key-chain", "Tpm")
  @js.native
  open class Tpm () extends StObject
}

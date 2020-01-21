package typings.ndnJs

import org.scalablytyped.runtime.TopLevel
import typings.ndnJs.dataMod.Data
import typings.ndnJs.interestMod.Interest
import typings.ndnJs.keyChainMod.SigningInfo.SignerType
import typings.ndnJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/key-chain", JSImport.Namespace)
@js.native
object keyChainMod extends js.Object {
  @js.native
  class CertificateV2 () extends js.Object
  
  @js.native
  class KeyChain () extends js.Object {
    def this(pibLocator: String, tpmLocator: String) = this()
    def this(pibLocator: String, tpmLocator: String, allowReset: Boolean) = this()
    def addCertificate(key: PibKey, certificate: CertificateV2): Unit = js.native
    def addCertificate(key: PibKey, certificate: CertificateV2, onComplete: js.Function0[_]): Unit = js.native
    def addCertificate(
      key: PibKey,
      certificate: CertificateV2,
      onComplete: js.Function0[_],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def createIdentityV2(identityName: Name): PibIdentity = js.native
    def createIdentityV2(identityName: Name, onComplete: js.Function1[/* identity */ PibIdentity, _]): Unit = js.native
    def createIdentityV2(
      identityName: Name,
      onComplete: js.Function1[/* identity */ PibIdentity, _],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def createIdentityV2(identityName: Name, params: KeyParams): PibIdentity = js.native
    def createIdentityV2(identityName: Name, params: KeyParams, onComplete: js.Function1[/* identity */ PibIdentity, _]): Unit = js.native
    def createIdentityV2(
      identityName: Name,
      params: KeyParams,
      onComplete: js.Function1[/* identity */ PibIdentity, _],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def createKey(identity: PibIdentity): PibKey = js.native
    def createKey(identity: PibIdentity, onComplete: js.Function1[/* key */ PibKey, _]): Unit = js.native
    def createKey(
      identity: PibIdentity,
      onComplete: js.Function1[/* key */ PibKey, _],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def createKey(identity: PibIdentity, params: KeyParams): PibKey = js.native
    def createKey(identity: PibIdentity, params: KeyParams, onComplete: js.Function1[/* key */ PibKey, _]): Unit = js.native
    def createKey(
      identity: PibIdentity,
      params: KeyParams,
      onComplete: js.Function1[/* key */ PibKey, _],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def deleteCertificate(key: PibKey, certificateName: Name): Unit = js.native
    def deleteCertificate(key: PibKey, certificateName: Name, onComplete: js.Function0[_]): Unit = js.native
    def deleteCertificate(
      key: PibKey,
      certificateName: Name,
      onComplete: js.Function0[_],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def deleteIdentity(identity: PibIdentity): Unit = js.native
    def deleteIdentity(identity: PibIdentity, onComplete: js.Function0[_]): Unit = js.native
    def deleteIdentity(identity: PibIdentity, onComplete: js.Function0[_], onError: js.Function1[/* err */ js.Any, _]): Unit = js.native
    def deleteKey(identity: PibIdentity, key: PibKey): Unit = js.native
    def deleteKey(identity: PibIdentity, key: PibKey, onComplete: js.Function0[_]): Unit = js.native
    def deleteKey(
      identity: PibIdentity,
      key: PibKey,
      onComplete: js.Function0[_],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def getPib(): Pib = js.native
    def getTpm(): Tpm = js.native
    def setDefaultCertificate(key: PibKey, certificate: CertificateV2): Unit = js.native
    def setDefaultCertificate(key: PibKey, certificate: CertificateV2, onComplete: js.Function0[_]): Unit = js.native
    def setDefaultCertificate(
      key: PibKey,
      certificate: CertificateV2,
      onComplete: js.Function0[_],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def setDefaultIdentity(identity: PibIdentity): Unit = js.native
    def setDefaultIdentity(identity: PibIdentity, onComplete: js.Function0[_]): Unit = js.native
    def setDefaultIdentity(identity: PibIdentity, onComplete: js.Function0[_], onError: js.Function1[/* err */ js.Any, _]): Unit = js.native
    def setDefaultKey(identity: PibIdentity, key: PibKey): Unit = js.native
    def setDefaultKey(identity: PibIdentity, key: PibKey, onComplete: js.Function0[_]): Unit = js.native
    def setDefaultKey(
      identity: PibIdentity,
      key: PibKey,
      onComplete: js.Function0[_],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def sign(data: Data, params: SigningInfo): Unit = js.native
    def sign(data: Data, params: SigningInfo, onComplete: js.Function1[/* data */ Data, _]): Unit = js.native
    def sign(
      data: Data,
      params: SigningInfo,
      onComplete: js.Function1[/* data */ Data, _],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def sign(interest: Interest, params: SigningInfo): Unit = js.native
    def sign(interest: Interest, params: SigningInfo, onComplete: js.Function1[/* interest */ Interest, _]): Unit = js.native
    def sign(
      interest: Interest,
      params: SigningInfo,
      onComplete: js.Function1[/* interest */ Interest, _],
      onError: js.Function1[/* err */ js.Any, _]
    ): Unit = js.native
    def signWithSha256(packet: Data): Unit = js.native
    def signWithSha256(packet: Interest): Unit = js.native
  }
  
  @js.native
  class KeyParams () extends js.Object
  
  @js.native
  class Pib () extends js.Object
  
  @js.native
  class PibIdentity () extends js.Object
  
  @js.native
  class PibKey () extends js.Object
  
  @js.native
  class SigningInfo () extends js.Object {
    def this(arg: String) = this()
    def this(arg: PibIdentity) = this()
    def this(arg: PibKey) = this()
    def this(arg: SigningInfo) = this()
    def this(signerType: SignerType, signerName: Name) = this()
    def getSignerName(): Name = js.native
    def getSignerType(): SignerType = js.native
  }
  
  @js.native
  class Tpm () extends js.Object
  
  /* static members */
  @js.native
  object KeyChain extends js.Object {
    def getDefaultKeyParams(): KeyParams = js.native
  }
  
  @js.native
  object SigningInfo extends js.Object {
    @js.native
    sealed trait SignerType extends js.Object
    
    @js.native
    object SignerType extends js.Object {
      @js.native
      sealed trait CERT extends SignerType
      
      @js.native
      sealed trait ID extends SignerType
      
      @js.native
      sealed trait KEY extends SignerType
      
      @js.native
      sealed trait NULL extends SignerType
      
      @js.native
      sealed trait SHA256 extends SignerType
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[SignerType with Double] = js.native
      /* 3 */ @js.native
      object CERT extends TopLevel[CERT with Double]
      
      /* 1 */ @js.native
      object ID extends TopLevel[ID with Double]
      
      /* 2 */ @js.native
      object KEY extends TopLevel[KEY with Double]
      
      /* 0 */ @js.native
      object NULL extends TopLevel[NULL with Double]
      
      /* 4 */ @js.native
      object SHA256 extends TopLevel[SHA256 with Double]
      
    }
    
  }
  
}


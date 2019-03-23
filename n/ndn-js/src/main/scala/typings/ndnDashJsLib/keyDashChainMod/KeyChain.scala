package typings
package ndnDashJsLib.keyDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/key-chain", "KeyChain")
@js.native
class KeyChain () extends js.Object {
  def this(pibLocator: java.lang.String, tpmLocator: java.lang.String) = this()
  def this(pibLocator: java.lang.String, tpmLocator: java.lang.String, allowReset: scala.Boolean) = this()
  def addCertificate(key: PibKey, certificate: CertificateV2): scala.Unit = js.native
  def addCertificate(key: PibKey, certificate: CertificateV2, onComplete: js.Function0[_]): scala.Unit = js.native
  def addCertificate(
    key: PibKey,
    certificate: CertificateV2,
    onComplete: js.Function0[_],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def createIdentityV2(identityName: ndnDashJsLib.nameMod.Name): PibIdentity = js.native
  def createIdentityV2(identityName: ndnDashJsLib.nameMod.Name, onComplete: js.Function1[/* identity */ PibIdentity, _]): scala.Unit = js.native
  def createIdentityV2(
    identityName: ndnDashJsLib.nameMod.Name,
    onComplete: js.Function1[/* identity */ PibIdentity, _],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def createIdentityV2(identityName: ndnDashJsLib.nameMod.Name, params: KeyParams): PibIdentity = js.native
  def createIdentityV2(
    identityName: ndnDashJsLib.nameMod.Name,
    params: KeyParams,
    onComplete: js.Function1[/* identity */ PibIdentity, _]
  ): scala.Unit = js.native
  def createIdentityV2(
    identityName: ndnDashJsLib.nameMod.Name,
    params: KeyParams,
    onComplete: js.Function1[/* identity */ PibIdentity, _],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def createKey(identity: PibIdentity): PibKey = js.native
  def createKey(identity: PibIdentity, onComplete: js.Function1[/* key */ PibKey, _]): scala.Unit = js.native
  def createKey(
    identity: PibIdentity,
    onComplete: js.Function1[/* key */ PibKey, _],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def createKey(identity: PibIdentity, params: KeyParams): PibKey = js.native
  def createKey(identity: PibIdentity, params: KeyParams, onComplete: js.Function1[/* key */ PibKey, _]): scala.Unit = js.native
  def createKey(
    identity: PibIdentity,
    params: KeyParams,
    onComplete: js.Function1[/* key */ PibKey, _],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def deleteCertificate(key: PibKey, certificateName: ndnDashJsLib.nameMod.Name): scala.Unit = js.native
  def deleteCertificate(key: PibKey, certificateName: ndnDashJsLib.nameMod.Name, onComplete: js.Function0[_]): scala.Unit = js.native
  def deleteCertificate(
    key: PibKey,
    certificateName: ndnDashJsLib.nameMod.Name,
    onComplete: js.Function0[_],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def deleteIdentity(identity: PibIdentity): scala.Unit = js.native
  def deleteIdentity(identity: PibIdentity, onComplete: js.Function0[_]): scala.Unit = js.native
  def deleteIdentity(identity: PibIdentity, onComplete: js.Function0[_], onError: js.Function1[/* err */ js.Any, _]): scala.Unit = js.native
  def deleteKey(identity: PibIdentity, key: PibKey): scala.Unit = js.native
  def deleteKey(identity: PibIdentity, key: PibKey, onComplete: js.Function0[_]): scala.Unit = js.native
  def deleteKey(
    identity: PibIdentity,
    key: PibKey,
    onComplete: js.Function0[_],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def getPib(): Pib = js.native
  def getTpm(): Tpm = js.native
  def setDefaultCertificate(key: PibKey, certificate: CertificateV2): scala.Unit = js.native
  def setDefaultCertificate(key: PibKey, certificate: CertificateV2, onComplete: js.Function0[_]): scala.Unit = js.native
  def setDefaultCertificate(
    key: PibKey,
    certificate: CertificateV2,
    onComplete: js.Function0[_],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def setDefaultIdentity(identity: PibIdentity): scala.Unit = js.native
  def setDefaultIdentity(identity: PibIdentity, onComplete: js.Function0[_]): scala.Unit = js.native
  def setDefaultIdentity(identity: PibIdentity, onComplete: js.Function0[_], onError: js.Function1[/* err */ js.Any, _]): scala.Unit = js.native
  def setDefaultKey(identity: PibIdentity, key: PibKey): scala.Unit = js.native
  def setDefaultKey(identity: PibIdentity, key: PibKey, onComplete: js.Function0[_]): scala.Unit = js.native
  def setDefaultKey(
    identity: PibIdentity,
    key: PibKey,
    onComplete: js.Function0[_],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def sign(data: ndnDashJsLib.dataMod.Data, params: SigningInfo): scala.Unit = js.native
  def sign(
    data: ndnDashJsLib.dataMod.Data,
    params: SigningInfo,
    onComplete: js.Function1[/* data */ ndnDashJsLib.dataMod.Data, _]
  ): scala.Unit = js.native
  def sign(
    data: ndnDashJsLib.dataMod.Data,
    params: SigningInfo,
    onComplete: js.Function1[/* data */ ndnDashJsLib.dataMod.Data, _],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def sign(interest: ndnDashJsLib.interestMod.Interest, params: SigningInfo): scala.Unit = js.native
  def sign(
    interest: ndnDashJsLib.interestMod.Interest,
    params: SigningInfo,
    onComplete: js.Function1[/* interest */ ndnDashJsLib.interestMod.Interest, _]
  ): scala.Unit = js.native
  def sign(
    interest: ndnDashJsLib.interestMod.Interest,
    params: SigningInfo,
    onComplete: js.Function1[/* interest */ ndnDashJsLib.interestMod.Interest, _],
    onError: js.Function1[/* err */ js.Any, _]
  ): scala.Unit = js.native
  def signWithSha256(packet: ndnDashJsLib.dataMod.Data): scala.Unit = js.native
  def signWithSha256(packet: ndnDashJsLib.interestMod.Interest): scala.Unit = js.native
}

/* static members */
@JSImport("ndn-js/key-chain", "KeyChain")
@js.native
object KeyChain extends js.Object {
  def getDefaultKeyParams(): ndnDashJsLib.keyDashChainMod.KeyParams = js.native
}


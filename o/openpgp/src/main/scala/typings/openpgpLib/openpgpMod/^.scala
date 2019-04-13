package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkString(): scala.Unit = js.native
  def convertStream(data: js.Object): js.Object = js.native
  def convertStream(data: js.Object, streaming: openpgpLib.openpgpLibNumbers.`false`): js.Object = js.native
  @JSName("convertStream")
  def convertStream_node(data: js.Object, streaming: openpgpLib.openpgpLibStrings.node): js.Object = js.native
  @JSName("convertStream")
  def convertStream_web(data: js.Object, streaming: openpgpLib.openpgpLibStrings.web): js.Object = js.native
  def convertStreams(obj: js.Object, streaming: openpgpLib.openpgpLibNumbers.`false`, keys: js.Array[_]): js.Object = js.native
  @JSName("convertStreams")
  def convertStreams_node(obj: js.Object, streaming: openpgpLib.openpgpLibStrings.node, keys: js.Array[_]): js.Object = js.native
  @JSName("convertStreams")
  def convertStreams_web(obj: js.Object, streaming: openpgpLib.openpgpLibStrings.web, keys: js.Array[_]): js.Object = js.native
  def decrypt(options: (DecryptOptions with (openpgpLib.Anon_Binary | openpgpLib.Anon_Format)) | DecryptOptions): js.Promise[DecryptOptions with openpgpLib.Anon_DataNodeStream] = js.native
  def decryptKey(privateKey: openpgpLib.openpgpMod.keyNs.Key, passphrase: java.lang.String): js.Promise[openpgpLib.Anon_Key_1025945043] = js.native
  def decryptKey(privateKey: openpgpLib.openpgpMod.keyNs.Key, passphrase: js.Array[_]): js.Promise[openpgpLib.Anon_Key_1025945043] = js.native
  def decryptSessionKeys(message: openpgpLib.openpgpMod.messageNs.Message): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.messageNs.Message,
    privateKeys: js.Array[openpgpLib.openpgpMod.keyNs.Key]
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.messageNs.Message,
    privateKeys: js.Array[openpgpLib.openpgpMod.keyNs.Key],
    passwords: java.lang.String
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.messageNs.Message,
    privateKeys: js.Array[openpgpLib.openpgpMod.keyNs.Key],
    passwords: js.Array[java.lang.String]
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(message: openpgpLib.openpgpMod.messageNs.Message, privateKeys: openpgpLib.openpgpMod.keyNs.Key): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.messageNs.Message,
    privateKeys: openpgpLib.openpgpMod.keyNs.Key,
    passwords: java.lang.String
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.messageNs.Message,
    privateKeys: openpgpLib.openpgpMod.keyNs.Key,
    passwords: js.Array[java.lang.String]
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def destroyWorker(): scala.Unit = js.native
  def encrypt(
    options: (EncryptOptions with (openpgpLib.Anon_Armor | openpgpLib.Anon_ArmorDetached | openpgpLib.Anon_ArmorDetachedFalse | openpgpLib.Anon_ArmorDetachedFalseTrue)) | EncryptOptions
  ): js.Promise[EncryptResult with openpgpLib.Anon_Data] = js.native
  def encryptKey(privateKey: openpgpLib.openpgpMod.keyNs.Key, passphrase: java.lang.String): js.Promise[openpgpLib.Anon_Key_1025945043] = js.native
  def encryptKey(privateKey: openpgpLib.openpgpMod.keyNs.Key, passphrase: js.Array[_]): js.Promise[openpgpLib.Anon_Key_1025945043] = js.native
  def encryptSessionKey(
    data: stdLib.Uint8Array,
    algorithm: java.lang.String,
    aeadAlgorithm: js.UndefOr[java.lang.String],
    publicKeys: js.UndefOr[js.Array[openpgpLib.openpgpMod.keyNs.Key] | openpgpLib.openpgpMod.keyNs.Key],
    passwords: js.UndefOr[js.Array[java.lang.String] | java.lang.String],
    wildcard: js.UndefOr[scala.Boolean],
    date: js.UndefOr[stdLib.Date],
    toUserIds: js.UndefOr[js.Array[_]]
  ): js.Promise[openpgpLib.openpgpMod.messageNs.Message] = js.native
  def generateKey(option: KeyOptions): js.Promise[openpgpLib.Anon_Key] = js.native
  def getWorker(): openpgpLib.openpgpMod.workerNs.asyncUnderscoreProxyNs.AsyncProxy | scala.Null = js.native
  def initWorker(options: WorkerOptions): scala.Unit = js.native
  def linkStreams(
    result: js.Object,
    message: openpgpLib.openpgpMod.messageNs.Message,
    erroringStream: openpgpLib.ReadableStream[java.lang.String]
  ): js.Object = js.native
  def nativeAEAD(): scala.Boolean = js.native
  def onError(message: java.lang.String, error: stdLib.Error): scala.Unit = js.native
  def prepareSignatures(signatures: js.Object): scala.Unit = js.native
  def reformatKey(privateKey: openpgpLib.openpgpMod.keyNs.Key, userIds: js.Array[_]): js.Promise[js.Object] = js.native
  def reformatKey(privateKey: openpgpLib.openpgpMod.keyNs.Key, userIds: js.Array[_], passphrase: java.lang.String): js.Promise[js.Object] = js.native
  def reformatKey(
    privateKey: openpgpLib.openpgpMod.keyNs.Key,
    userIds: js.Array[_],
    passphrase: java.lang.String,
    keyExpirationTime: scala.Double
  ): js.Promise[js.Object] = js.native
  def reformatKey(
    privateKey: openpgpLib.openpgpMod.keyNs.Key,
    userIds: js.Array[_],
    passphrase: java.lang.String,
    keyExpirationTime: scala.Double,
    revocationCertificate: scala.Boolean
  ): js.Promise[js.Object] = js.native
  def revokeKey(): js.Promise[openpgpLib.Anon_PrivateKey | openpgpLib.Anon_PublicKey] = js.native
  def revokeKey(key: openpgpLib.openpgpMod.keyNs.Key): js.Promise[openpgpLib.Anon_PrivateKey | openpgpLib.Anon_PublicKey] = js.native
  def revokeKey(key: openpgpLib.openpgpMod.keyNs.Key, revocationCertificate: java.lang.String): js.Promise[openpgpLib.Anon_PrivateKey | openpgpLib.Anon_PublicKey] = js.native
  def revokeKey(
    key: openpgpLib.openpgpMod.keyNs.Key,
    revocationCertificate: java.lang.String,
    reasonForRevocation: revokeKey_reasonForRevocation
  ): js.Promise[openpgpLib.Anon_PrivateKey | openpgpLib.Anon_PublicKey] = js.native
  def sign(
    options: (SignOptions with (openpgpLib.Anon_Armor | openpgpLib.Anon_ArmorDetached | openpgpLib.Anon_ArmorDetachedFalse | openpgpLib.Anon_ArmorDetachedFalseTrue)) | SignOptions
  ): js.Promise[openpgpLib.Anon_Data] = js.native
  def toArray(param: js.Object): js.UndefOr[js.Array[_]] = js.native
  def verify(options: VerifyOptions): js.Promise[VerifyResult] = js.native
}


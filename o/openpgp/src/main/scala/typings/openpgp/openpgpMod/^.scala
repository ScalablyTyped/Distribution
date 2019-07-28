package typings.openpgp.openpgpMod

import typings.openpgp.Anon_Algorithm
import typings.openpgp.Anon_Armor
import typings.openpgp.Anon_ArmorDetached
import typings.openpgp.Anon_ArmorDetachedFalse
import typings.openpgp.Anon_ArmorDetachedFalseTrue
import typings.openpgp.Anon_Binary
import typings.openpgp.Anon_Data
import typings.openpgp.Anon_DataNodeStream
import typings.openpgp.Anon_Format
import typings.openpgp.Anon_Key
import typings.openpgp.Anon_Key_1025945043
import typings.openpgp.Anon_PrivateKey
import typings.openpgp.Anon_PublicKey
import typings.openpgp.ReadableStream
import typings.openpgp.openpgpMod.keyNs.Key
import typings.openpgp.openpgpMod.messageNs.Message
import typings.openpgp.openpgpMod.workerNs.asyncUnderscoreProxyNs.AsyncProxy
import typings.openpgp.openpgpNumbers.`false`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkString(): Unit = js.native
  def convertStream(data: js.Object): js.Object = js.native
  @JSName("convertStream")
  def convertStream_false(data: js.Object, streaming: `false`): js.Object = js.native
  @JSName("convertStream")
  def convertStream_node(data: js.Object, streaming: node): js.Object = js.native
  @JSName("convertStream")
  def convertStream_web(data: js.Object, streaming: web): js.Object = js.native
  @JSName("convertStreams")
  def convertStreams_false(obj: js.Object, streaming: `false`, keys: js.Array[_]): js.Object = js.native
  @JSName("convertStreams")
  def convertStreams_node(obj: js.Object, streaming: node, keys: js.Array[_]): js.Object = js.native
  @JSName("convertStreams")
  def convertStreams_web(obj: js.Object, streaming: web, keys: js.Array[_]): js.Object = js.native
  def decrypt(options: (DecryptOptions with (Anon_Binary | Anon_Format)) | DecryptOptions): js.Promise[DecryptResult with Anon_DataNodeStream] = js.native
  def decryptKey(privateKey: Key, passphrase: String): js.Promise[Anon_Key_1025945043] = js.native
  def decryptKey(privateKey: Key, passphrase: js.Array[_]): js.Promise[Anon_Key_1025945043] = js.native
  def decryptSessionKeys(message: Message): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def decryptSessionKeys(message: Message, privateKeys: js.Array[Key]): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def decryptSessionKeys(message: Message, privateKeys: js.Array[Key], passwords: String): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def decryptSessionKeys(message: Message, privateKeys: js.Array[Key], passwords: js.Array[String]): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def decryptSessionKeys(message: Message, privateKeys: Key): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def decryptSessionKeys(message: Message, privateKeys: Key, passwords: String): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def decryptSessionKeys(message: Message, privateKeys: Key, passwords: js.Array[String]): js.Promise[js.UndefOr[js.Array[Anon_Algorithm]]] = js.native
  def destroyWorker(): Unit = js.native
  def encrypt(
    options: (EncryptOptions with (Anon_Armor | Anon_ArmorDetached | Anon_ArmorDetachedFalse | Anon_ArmorDetachedFalseTrue)) | EncryptOptions
  ): js.Promise[EncryptResult with Anon_Data] = js.native
  def encryptKey(privateKey: Key, passphrase: String): js.Promise[Anon_Key_1025945043] = js.native
  def encryptKey(privateKey: Key, passphrase: js.Array[_]): js.Promise[Anon_Key_1025945043] = js.native
  def encryptSessionKey(
    data: Uint8Array,
    algorithm: String,
    aeadAlgorithm: js.UndefOr[String],
    publicKeys: js.UndefOr[js.Array[Key] | Key],
    passwords: js.UndefOr[js.Array[String] | String],
    wildcard: js.UndefOr[Boolean],
    date: js.UndefOr[Date],
    toUserIds: js.UndefOr[js.Array[_]]
  ): js.Promise[Message] = js.native
  def generateKey(option: KeyOptions): js.Promise[Anon_Key] = js.native
  def getWorker(): AsyncProxy | Null = js.native
  def initWorker(options: WorkerOptions): Unit = js.native
  def linkStreams(result: js.Object, message: Message, erroringStream: ReadableStream[String]): js.Object = js.native
  def nativeAEAD(): Boolean = js.native
  def onError(message: String, error: Error): Unit = js.native
  def prepareSignatures(signatures: js.Object): Unit = js.native
  def reformatKey(privateKey: Key, userIds: js.Array[_]): js.Promise[js.Object] = js.native
  def reformatKey(privateKey: Key, userIds: js.Array[_], passphrase: String): js.Promise[js.Object] = js.native
  def reformatKey(privateKey: Key, userIds: js.Array[_], passphrase: String, keyExpirationTime: Double): js.Promise[js.Object] = js.native
  def reformatKey(
    privateKey: Key,
    userIds: js.Array[_],
    passphrase: String,
    keyExpirationTime: Double,
    revocationCertificate: Boolean
  ): js.Promise[js.Object] = js.native
  def revokeKey(): js.Promise[Anon_PrivateKey | Anon_PublicKey] = js.native
  def revokeKey(key: Key): js.Promise[Anon_PrivateKey | Anon_PublicKey] = js.native
  def revokeKey(key: Key, revocationCertificate: String): js.Promise[Anon_PrivateKey | Anon_PublicKey] = js.native
  def revokeKey(key: Key, revocationCertificate: String, reasonForRevocation: revokeKey_reasonForRevocation): js.Promise[Anon_PrivateKey | Anon_PublicKey] = js.native
  def sign(
    options: (SignOptions with (Anon_Armor | Anon_ArmorDetached | Anon_ArmorDetachedFalse | Anon_ArmorDetachedFalseTrue)) | SignOptions
  ): js.Promise[Anon_Data] = js.native
  def toArray(param: js.Object): js.UndefOr[js.Array[_]] = js.native
  def verify(options: VerifyOptions): js.Promise[VerifyResult] = js.native
}


package typings.openpgp.mod

import typings.openpgp.anon.Algorithm
import typings.openpgp.anon.Data
import typings.openpgp.anon.DecryptOptionsformatbinar
import typings.openpgp.anon.DecryptOptionsformatutf8
import typings.openpgp.anon.DecryptResultdataUint8Arr
import typings.openpgp.anon.DecryptResultdatastringRe
import typings.openpgp.anon.EncryptOptionsarmorfalsed
import typings.openpgp.anon.EncryptOptionsarmorfalsedArmor
import typings.openpgp.anon.EncryptOptionsarmortrueun
import typings.openpgp.anon.EncryptOptionsarmortrueunArmor
import typings.openpgp.anon.EncryptResultdatastring
import typings.openpgp.anon.EncryptResultdatastringRe
import typings.openpgp.anon.EncryptResultdatastringsi
import typings.openpgp.anon.EncryptResultmessageMessa
import typings.openpgp.anon.EncryptResultmessageMessaMessage
import typings.openpgp.anon.KeyKey
import typings.openpgp.anon.PrivateKey
import typings.openpgp.anon.PublicKey
import typings.openpgp.anon.SignOptionsarmorfalsedeta
import typings.openpgp.anon.SignOptionsarmorfalsedetaArmor
import typings.openpgp.anon.SignOptionsarmortrueundef
import typings.openpgp.anon.SignOptionsarmortrueundefArmor
import typings.openpgp.anon.Signature
import typings.openpgp.anon.SignatureSignature
import typings.openpgp.mod.^
import typings.openpgp.mod.key.Key
import typings.openpgp.mod.message.Message
import typings.openpgp.mod.worker.asyncProxy.AsyncProxy
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def checkString(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkString")().asInstanceOf[Unit]

inline def convertStream(data: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any]).asInstanceOf[js.Object]
inline def convertStream(data: js.Object, streaming: web | node | `false`): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def convertStreams(obj: js.Object, streaming: web | node | `false`, keys: js.Array[Any]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStreams")(obj.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def decrypt(options: DecryptOptionsformatbinar): js.Promise[DecryptResultdataUint8Arr] = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DecryptResultdataUint8Arr]]
inline def decrypt(options: DecryptOptionsformatutf8): js.Promise[DecryptResultdatastringRe] = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DecryptResultdatastringRe]]
inline def decrypt(options: DecryptOptions): js.Promise[DecryptResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DecryptResult]]

inline def decryptKey(privateKey: Key, passphrase: String): js.Promise[KeyKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyKey]]
inline def decryptKey(privateKey: Key, passphrase: js.Array[Any]): js.Promise[KeyKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyKey]]

inline def decryptSessionKeys(message: Message): js.Promise[js.UndefOr[js.Array[Algorithm]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]
inline def decryptSessionKeys(message: Message, privateKeys: js.Array[Key]): js.Promise[js.UndefOr[js.Array[Algorithm]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]
inline def decryptSessionKeys(message: Message, privateKeys: js.Array[Key], passwords: String): js.Promise[js.UndefOr[js.Array[Algorithm]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]
inline def decryptSessionKeys(message: Message, privateKeys: js.Array[Key], passwords: js.Array[String]): js.Promise[js.UndefOr[js.Array[Algorithm]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]
inline def decryptSessionKeys(message: Message, privateKeys: Unit, passwords: String): js.Promise[js.UndefOr[js.Array[Algorithm]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]
inline def decryptSessionKeys(message: Message, privateKeys: Unit, passwords: js.Array[String]): js.Promise[js.UndefOr[js.Array[Algorithm]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]
inline def decryptSessionKeys(message: Message, privateKeys: Key): js.Promise[js.UndefOr[js.Array[Algorithm]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]
inline def decryptSessionKeys(message: Message, privateKeys: Key, passwords: String): js.Promise[js.UndefOr[js.Array[Algorithm]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]
inline def decryptSessionKeys(message: Message, privateKeys: Key, passwords: js.Array[String]): js.Promise[js.UndefOr[js.Array[Algorithm]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[Algorithm]]]]

inline def destroyWorker(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyWorker")().asInstanceOf[Unit]

inline def encrypt(options: EncryptOptionsarmorfalsed): js.Promise[EncryptResultmessageMessa] = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncryptResultmessageMessa]]
inline def encrypt(options: EncryptOptionsarmorfalsedArmor): js.Promise[EncryptResultmessageMessaMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncryptResultmessageMessaMessage]]
inline def encrypt(options: EncryptOptionsarmortrueun): js.Promise[EncryptResultdatastring] = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncryptResultdatastring]]
inline def encrypt(options: EncryptOptionsarmortrueunArmor): js.Promise[EncryptResultdatastringsi] = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncryptResultdatastringsi]]
inline def encrypt(options: EncryptOptions): js.Promise[EncryptResultdatastringRe] = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncryptResultdatastringRe]]

inline def encryptKey(privateKey: Key, passphrase: String): js.Promise[KeyKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyKey]]
inline def encryptKey(privateKey: Key, passphrase: js.Array[Any]): js.Promise[KeyKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyKey]]

inline def encryptSessionKey(
  data: js.typedarray.Uint8Array,
  algorithm: String,
  aeadAlgorithm: js.UndefOr[String],
  publicKeys: js.UndefOr[Key | js.Array[Key]],
  passwords: js.UndefOr[String | js.Array[String]],
  wildcard: js.UndefOr[Boolean],
  date: js.UndefOr[js.Date],
  toUserIds: js.UndefOr[js.Array[Any]]
): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptSessionKey")(data.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], aeadAlgorithm.asInstanceOf[js.Any], publicKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any], wildcard.asInstanceOf[js.Any], date.asInstanceOf[js.Any], toUserIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]

inline def generateKey(option: KeyOptions): js.Promise[typings.openpgp.anon.Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.Key]]

inline def getWorker(): AsyncProxy | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorker")().asInstanceOf[AsyncProxy | Null]

inline def initWorker(options: WorkerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initWorker")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def linkStreams(result: js.Object, message: Message, erroringStream: ReadableStream[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("linkStreams")(result.asInstanceOf[js.Any], message.asInstanceOf[js.Any], erroringStream.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def nativeAEAD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeAEAD")().asInstanceOf[Boolean]

inline def onError(message: String, error: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onError")(message.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def prepareSignatures(signatures: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareSignatures")(signatures.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def reformatKey(privateKey: Key, userIds: js.Array[Any]): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
inline def reformatKey(privateKey: Key, userIds: js.Array[Any], passphrase: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
inline def reformatKey(privateKey: Key, userIds: js.Array[Any], passphrase: String, keyExpirationTime: Double): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
inline def reformatKey(
  privateKey: Key,
  userIds: js.Array[Any],
  passphrase: String,
  keyExpirationTime: Double,
  revocationCertificate: Boolean
): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
inline def reformatKey(
  privateKey: Key,
  userIds: js.Array[Any],
  passphrase: String,
  keyExpirationTime: Unit,
  revocationCertificate: Boolean
): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
inline def reformatKey(privateKey: Key, userIds: js.Array[Any], passphrase: Unit, keyExpirationTime: Double): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
inline def reformatKey(
  privateKey: Key,
  userIds: js.Array[Any],
  passphrase: Unit,
  keyExpirationTime: Double,
  revocationCertificate: Boolean
): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
inline def reformatKey(
  privateKey: Key,
  userIds: js.Array[Any],
  passphrase: Unit,
  keyExpirationTime: Unit,
  revocationCertificate: Boolean
): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]

inline def revokeKey(): js.Promise[PrivateKey | PublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")().asInstanceOf[js.Promise[PrivateKey | PublicKey]]
inline def revokeKey(key: Unit, revocationCertificate: String): js.Promise[PrivateKey | PublicKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey | PublicKey]]
inline def revokeKey(key: Unit, revocationCertificate: String, reasonForRevocation: revokeKeyReasonForRevocation): js.Promise[PrivateKey | PublicKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey | PublicKey]]
inline def revokeKey(key: Unit, revocationCertificate: Unit, reasonForRevocation: revokeKeyReasonForRevocation): js.Promise[PrivateKey | PublicKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey | PublicKey]]
inline def revokeKey(key: Key): js.Promise[PrivateKey | PublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PrivateKey | PublicKey]]
inline def revokeKey(key: Key, revocationCertificate: String): js.Promise[PrivateKey | PublicKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey | PublicKey]]
inline def revokeKey(key: Key, revocationCertificate: String, reasonForRevocation: revokeKeyReasonForRevocation): js.Promise[PrivateKey | PublicKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey | PublicKey]]
inline def revokeKey(key: Key, revocationCertificate: Unit, reasonForRevocation: revokeKeyReasonForRevocation): js.Promise[PrivateKey | PublicKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey | PublicKey]]

inline def sign(options: SignOptionsarmorfalsedeta): js.Promise[typings.openpgp.anon.Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.Message]]
inline def sign(options: SignOptionsarmorfalsedetaArmor): js.Promise[SignatureSignature] = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SignatureSignature]]
inline def sign(options: SignOptionsarmortrueundef): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
inline def sign(options: SignOptionsarmortrueundefArmor): js.Promise[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Signature]]
inline def sign(options: SignOptions): js.Promise[SignResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SignResult]]

inline def toArray(param: js.Object): js.UndefOr[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(param.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Any]]]

inline def verify(options: VerifyOptions): js.Promise[VerifyResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VerifyResult]]

type Infinity = Any

type Integer = Double

type NodeStream = typings.node.streamMod.^

type ReadableStream[T] = Any

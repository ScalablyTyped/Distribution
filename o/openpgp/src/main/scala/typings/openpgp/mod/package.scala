package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def checkString(): scala.Unit = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("checkString")().asInstanceOf[scala.Unit]

@scala.inline
def convertStream(data: js.Object): js.Object = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any]).asInstanceOf[js.Object]

@scala.inline
def convertStream_false(data: js.Object, streaming: typings.openpgp.openpgpBooleans.`false`): js.Object = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any])).asInstanceOf[js.Object]

@scala.inline
def convertStream_node(data: js.Object, streaming: typings.openpgp.openpgpStrings.node): js.Object = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any])).asInstanceOf[js.Object]

@scala.inline
def convertStream_web(data: js.Object, streaming: typings.openpgp.openpgpStrings.web): js.Object = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStream")(data.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any])).asInstanceOf[js.Object]

@scala.inline
def convertStreams_false(obj: js.Object, streaming: typings.openpgp.openpgpBooleans.`false`, keys: js.Array[js.Any]): js.Object = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStreams")(obj.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]

@scala.inline
def convertStreams_node(obj: js.Object, streaming: typings.openpgp.openpgpStrings.node, keys: js.Array[js.Any]): js.Object = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStreams")(obj.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]

@scala.inline
def convertStreams_web(obj: js.Object, streaming: typings.openpgp.openpgpStrings.web, keys: js.Array[js.Any]): js.Object = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertStreams")(obj.asInstanceOf[js.Any], streaming.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]

@scala.inline
def decrypt(options: typings.openpgp.anon.DecryptOptionsformatbinar): js.Promise[typings.openpgp.anon.DecryptResultdataUint8Arr] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.DecryptResultdataUint8Arr]]
@scala.inline
def decrypt(options: typings.openpgp.anon.DecryptOptionsformatutf8): js.Promise[typings.openpgp.anon.DecryptResultdatastringRe] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.DecryptResultdatastringRe]]
@scala.inline
def decrypt(options: typings.openpgp.mod.DecryptOptions): js.Promise[typings.openpgp.mod.DecryptResult] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.mod.DecryptResult]]

@scala.inline
def decryptKey(privateKey: typings.openpgp.mod.key.Key, passphrase: java.lang.String): js.Promise[typings.openpgp.anon.KeyKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.KeyKey]]
@scala.inline
def decryptKey(privateKey: typings.openpgp.mod.key.Key, passphrase: js.Array[js.Any]): js.Promise[typings.openpgp.anon.KeyKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.KeyKey]]

@scala.inline
def decryptSessionKeys(message: typings.openpgp.mod.message.Message): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]
@scala.inline
def decryptSessionKeys(message: typings.openpgp.mod.message.Message, privateKeys: js.Array[typings.openpgp.mod.key.Key]): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]
@scala.inline
def decryptSessionKeys(
  message: typings.openpgp.mod.message.Message,
  privateKeys: js.Array[typings.openpgp.mod.key.Key],
  passwords: java.lang.String
): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]
@scala.inline
def decryptSessionKeys(
  message: typings.openpgp.mod.message.Message,
  privateKeys: js.Array[typings.openpgp.mod.key.Key],
  passwords: js.Array[java.lang.String]
): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]
@scala.inline
def decryptSessionKeys(message: typings.openpgp.mod.message.Message, privateKeys: scala.Unit, passwords: java.lang.String): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]
@scala.inline
def decryptSessionKeys(
  message: typings.openpgp.mod.message.Message,
  privateKeys: scala.Unit,
  passwords: js.Array[java.lang.String]
): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]
@scala.inline
def decryptSessionKeys(message: typings.openpgp.mod.message.Message, privateKeys: typings.openpgp.mod.key.Key): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]
@scala.inline
def decryptSessionKeys(
  message: typings.openpgp.mod.message.Message,
  privateKeys: typings.openpgp.mod.key.Key,
  passwords: java.lang.String
): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]
@scala.inline
def decryptSessionKeys(
  message: typings.openpgp.mod.message.Message,
  privateKeys: typings.openpgp.mod.key.Key,
  passwords: js.Array[java.lang.String]
): js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decryptSessionKeys")(message.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.openpgp.anon.Algorithm]]]]

@scala.inline
def destroyWorker(): scala.Unit = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("destroyWorker")().asInstanceOf[scala.Unit]

@scala.inline
def encrypt(options: typings.openpgp.anon.EncryptOptionsarmorfalsed): js.Promise[typings.openpgp.anon.EncryptResultmessageMessa] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.EncryptResultmessageMessa]]
@scala.inline
def encrypt(options: typings.openpgp.anon.EncryptOptionsarmorfalsedArmor): js.Promise[typings.openpgp.anon.EncryptResultmessageMessaMessage] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.EncryptResultmessageMessaMessage]]
@scala.inline
def encrypt(options: typings.openpgp.anon.EncryptOptionsarmortrueun): js.Promise[typings.openpgp.anon.EncryptResultdatastring] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.EncryptResultdatastring]]
@scala.inline
def encrypt(options: typings.openpgp.anon.EncryptOptionsarmortrueunArmor): js.Promise[typings.openpgp.anon.EncryptResultdatastringsi] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.EncryptResultdatastringsi]]
@scala.inline
def encrypt(options: typings.openpgp.mod.EncryptOptions): js.Promise[typings.openpgp.anon.EncryptResultdatastringRe] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.EncryptResultdatastringRe]]

@scala.inline
def encryptKey(privateKey: typings.openpgp.mod.key.Key, passphrase: java.lang.String): js.Promise[typings.openpgp.anon.KeyKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.KeyKey]]
@scala.inline
def encryptKey(privateKey: typings.openpgp.mod.key.Key, passphrase: js.Array[js.Any]): js.Promise[typings.openpgp.anon.KeyKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encryptKey")(privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.KeyKey]]

@scala.inline
def encryptSessionKey(
  data: typings.std.Uint8Array,
  algorithm: java.lang.String,
  aeadAlgorithm: js.UndefOr[java.lang.String],
  publicKeys: js.UndefOr[typings.openpgp.mod.key.Key | js.Array[typings.openpgp.mod.key.Key]],
  passwords: js.UndefOr[java.lang.String | js.Array[java.lang.String]],
  wildcard: js.UndefOr[scala.Boolean],
  date: js.UndefOr[typings.std.Date],
  toUserIds: js.UndefOr[js.Array[js.Any]]
): js.Promise[typings.openpgp.mod.message.Message] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encryptSessionKey")(data.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], aeadAlgorithm.asInstanceOf[js.Any], publicKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any], wildcard.asInstanceOf[js.Any], date.asInstanceOf[js.Any], toUserIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.mod.message.Message]]

@scala.inline
def generateKey(option: typings.openpgp.mod.KeyOptions): js.Promise[typings.openpgp.anon.Key] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.Key]]

@scala.inline
def getWorker(): typings.openpgp.mod.worker.asyncProxy.AsyncProxy | scala.Null = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getWorker")().asInstanceOf[typings.openpgp.mod.worker.asyncProxy.AsyncProxy | scala.Null]

@scala.inline
def initWorker(options: typings.openpgp.mod.WorkerOptions): scala.Unit = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initWorker")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def linkStreams(
  result: js.Object,
  message: typings.openpgp.mod.message.Message,
  erroringStream: typings.openpgp.mod.ReadableStream[java.lang.String]
): js.Object = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("linkStreams")(result.asInstanceOf[js.Any], message.asInstanceOf[js.Any], erroringStream.asInstanceOf[js.Any])).asInstanceOf[js.Object]

@scala.inline
def nativeAEAD(): scala.Boolean = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeAEAD")().asInstanceOf[scala.Boolean]

@scala.inline
def onError(message: java.lang.String, error: typings.std.Error): scala.Unit = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onError")(message.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def prepareSignatures(signatures: js.Object): scala.Unit = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prepareSignatures")(signatures.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def reformatKey(privateKey: typings.openpgp.mod.key.Key, userIds: js.Array[js.Any]): js.Promise[js.Object] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
@scala.inline
def reformatKey(privateKey: typings.openpgp.mod.key.Key, userIds: js.Array[js.Any], passphrase: java.lang.String): js.Promise[js.Object] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
@scala.inline
def reformatKey(
  privateKey: typings.openpgp.mod.key.Key,
  userIds: js.Array[js.Any],
  passphrase: java.lang.String,
  keyExpirationTime: scala.Double
): js.Promise[js.Object] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
@scala.inline
def reformatKey(
  privateKey: typings.openpgp.mod.key.Key,
  userIds: js.Array[js.Any],
  passphrase: java.lang.String,
  keyExpirationTime: scala.Double,
  revocationCertificate: scala.Boolean
): js.Promise[js.Object] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
@scala.inline
def reformatKey(
  privateKey: typings.openpgp.mod.key.Key,
  userIds: js.Array[js.Any],
  passphrase: java.lang.String,
  keyExpirationTime: scala.Unit,
  revocationCertificate: scala.Boolean
): js.Promise[js.Object] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
@scala.inline
def reformatKey(
  privateKey: typings.openpgp.mod.key.Key,
  userIds: js.Array[js.Any],
  passphrase: scala.Unit,
  keyExpirationTime: scala.Double
): js.Promise[js.Object] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
@scala.inline
def reformatKey(
  privateKey: typings.openpgp.mod.key.Key,
  userIds: js.Array[js.Any],
  passphrase: scala.Unit,
  keyExpirationTime: scala.Double,
  revocationCertificate: scala.Boolean
): js.Promise[js.Object] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
@scala.inline
def reformatKey(
  privateKey: typings.openpgp.mod.key.Key,
  userIds: js.Array[js.Any],
  passphrase: scala.Unit,
  keyExpirationTime: scala.Unit,
  revocationCertificate: scala.Boolean
): js.Promise[js.Object] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reformatKey")(privateKey.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], keyExpirationTime.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]

@scala.inline
def revokeKey(): js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")().asInstanceOf[js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey]]
@scala.inline
def revokeKey(key: scala.Unit, revocationCertificate: java.lang.String): js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey]]
@scala.inline
def revokeKey(
  key: scala.Unit,
  revocationCertificate: java.lang.String,
  reasonForRevocation: typings.openpgp.mod.revokeKeyReasonForRevocation
): js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey]]
@scala.inline
def revokeKey(
  key: scala.Unit,
  revocationCertificate: scala.Unit,
  reasonForRevocation: typings.openpgp.mod.revokeKeyReasonForRevocation
): js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey]]
@scala.inline
def revokeKey(key: typings.openpgp.mod.key.Key): js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey]]
@scala.inline
def revokeKey(key: typings.openpgp.mod.key.Key, revocationCertificate: java.lang.String): js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey]]
@scala.inline
def revokeKey(
  key: typings.openpgp.mod.key.Key,
  revocationCertificate: java.lang.String,
  reasonForRevocation: typings.openpgp.mod.revokeKeyReasonForRevocation
): js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey]]
@scala.inline
def revokeKey(
  key: typings.openpgp.mod.key.Key,
  revocationCertificate: scala.Unit,
  reasonForRevocation: typings.openpgp.mod.revokeKeyReasonForRevocation
): js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey] = (typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("revokeKey")(key.asInstanceOf[js.Any], revocationCertificate.asInstanceOf[js.Any], reasonForRevocation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.openpgp.anon.PrivateKey | typings.openpgp.anon.PublicKey]]

@scala.inline
def sign(options: typings.openpgp.anon.SignOptionsarmorfalsedeta): js.Promise[typings.openpgp.anon.Message] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.Message]]
@scala.inline
def sign(options: typings.openpgp.anon.SignOptionsarmorfalsedetaArmor): js.Promise[typings.openpgp.anon.SignatureSignature] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.SignatureSignature]]
@scala.inline
def sign(options: typings.openpgp.anon.SignOptionsarmortrueundef): js.Promise[typings.openpgp.anon.Data] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.Data]]
@scala.inline
def sign(options: typings.openpgp.anon.SignOptionsarmortrueundefArmor): js.Promise[typings.openpgp.anon.Signature] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.anon.Signature]]
@scala.inline
def sign(options: typings.openpgp.mod.SignOptions): js.Promise[typings.openpgp.mod.SignResult] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.mod.SignResult]]

@scala.inline
def toArray(param: js.Object): js.UndefOr[js.Array[js.Any]] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(param.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[js.Any]]]

@scala.inline
def verify(options: typings.openpgp.mod.VerifyOptions): js.Promise[typings.openpgp.mod.VerifyResult] = typings.openpgp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openpgp.mod.VerifyResult]]

type Infinity = js.Any

type Integer = scala.Double

type NodeStream = typings.node.streamMod.^

type ReadableStream[T] = js.Any

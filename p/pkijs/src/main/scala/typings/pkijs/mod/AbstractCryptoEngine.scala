package typings.pkijs.mod

import typings.pkijs.pkijsStrings.jwk
import typings.pkijs.pkijsStrings.pkcs8
import typings.pkijs.pkijsStrings.raw
import typings.pkijs.pkijsStrings.spki
import typings.std.AesKeyAlgorithm
import typings.std.BufferSource
import typings.std.CryptoKey
import typings.std.EcKeyImportParams
import typings.std.HmacImportParams
import typings.std.JsonWebKey
import typings.std.KeyUsage
import typings.std.RsaHashedImportParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "AbstractCryptoEngine")
@js.native
abstract class AbstractCryptoEngine protected ()
  extends StObject
     with ICryptoEngine {
  /**
    * Constructor for CryptoEngine class
    * @param parameters
    */
  def this(parameters: CryptoEngineParameters) = this()
  
  def exportKey(format: pkcs8 | raw | spki, key: CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: CryptoKey): js.Promise[JsonWebKey] = js.native
  
  def getAlgorithmByOID(oid: Any): js.Object = js.native
  def getAlgorithmByOID(oid: Any, safety: Any): js.Object = js.native
  def getAlgorithmByOID(oid: Any, safety: Any, target: Any): js.Object = js.native
  def getAlgorithmByOID(oid: Any, safety: Unit, target: Any): js.Object = js.native
  
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.AlgorithmIdentifier */ Any,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.AlgorithmIdentifier */ Any,
    extractable: Boolean,
    keyUsages: js.Iterable[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Iterable[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Iterable[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Iterable[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: pkcs8 | raw | spki,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Iterable[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.AlgorithmIdentifier */ Any,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
}

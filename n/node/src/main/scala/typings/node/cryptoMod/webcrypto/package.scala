package typings.node.cryptoMod.webcrypto

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@JSImport("crypto", "webcrypto")
@js.native
val ^ : TopLevel[Crypto] = js.native

type AlgorithmIdentifier = Algorithm | String

type BigInteger = js.typedarray.Uint8Array

type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer

type HashAlgorithmIdentifier = AlgorithmIdentifier

type KeyFormat = "jwk" | "pkcs8" | "raw" | "spki"

type KeyType = "private" | "public" | "secret"

type KeyUsage = "decrypt" | "deriveBits" | "deriveKey" | "encrypt" | "sign" | "unwrapKey" | "verify" | "wrapKey"

type NamedCurve = String

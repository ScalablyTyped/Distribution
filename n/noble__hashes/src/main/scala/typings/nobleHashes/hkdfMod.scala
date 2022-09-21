package typings.nobleHashes

import typings.nobleHashes.utilsMod.CHash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hkdfMod {
  
  @JSImport("@noble/hashes/hkdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expand(hash: CHash, prk: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hash.asInstanceOf[js.Any], prk.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def expand(hash: CHash, prk: Input, info: Unit, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hash.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], info.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def expand(hash: CHash, prk: Input, info: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hash.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def expand(hash: CHash, prk: Input, info: Input, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hash.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], info.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def extract(hash: CHash, ikm: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(hash.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def extract(hash: CHash, ikm: Input, salt: Input): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(hash.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def hkdf(hash: CHash, ikm: Input, salt: Unit, info: Unit, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(hash.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def hkdf(hash: CHash, ikm: Input, salt: Unit, info: Input, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(hash.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def hkdf(hash: CHash, ikm: Input, salt: Input, info: Unit, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(hash.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def hkdf(hash: CHash, ikm: Input, salt: Input, info: Input, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(hash.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}

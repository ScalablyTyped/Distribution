package typings.panvaHkdf

import typings.panvaHkdf.panvaHkdfStrings.sha1
import typings.panvaHkdf.panvaHkdfStrings.sha256
import typings.panvaHkdf.panvaHkdfStrings.sha384
import typings.panvaHkdf.panvaHkdfStrings.sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@panva/hkdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(digest: sha256 | sha384 | sha512 | sha1, ikm: String, salt: String, info: String, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: String,
    salt: String,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: String,
    salt: js.typedarray.Uint8Array,
    info: String,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: String,
    salt: js.typedarray.Uint8Array,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: js.typedarray.Uint8Array,
    salt: String,
    info: String,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: js.typedarray.Uint8Array,
    salt: String,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    info: String,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(digest: String, ikm: String, salt: String, info: String, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(digest: String, ikm: String, salt: String, info: js.typedarray.Uint8Array, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(digest: String, ikm: String, salt: js.typedarray.Uint8Array, info: String, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: String,
    ikm: String,
    salt: js.typedarray.Uint8Array,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(digest: String, ikm: js.typedarray.Uint8Array, salt: String, info: String, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: String,
    ikm: js.typedarray.Uint8Array,
    salt: String,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: String,
    ikm: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    info: String,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def default(
    digest: String,
    ikm: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def hkdf(digest: sha256 | sha384 | sha512 | sha1, ikm: String, salt: String, info: String, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: String,
    salt: String,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: String,
    salt: js.typedarray.Uint8Array,
    info: String,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: String,
    salt: js.typedarray.Uint8Array,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: js.typedarray.Uint8Array,
    salt: String,
    info: String,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: js.typedarray.Uint8Array,
    salt: String,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    info: String,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: sha256 | sha384 | sha512 | sha1,
    ikm: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(digest: String, ikm: String, salt: String, info: String, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(digest: String, ikm: String, salt: String, info: js.typedarray.Uint8Array, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(digest: String, ikm: String, salt: js.typedarray.Uint8Array, info: String, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: String,
    ikm: String,
    salt: js.typedarray.Uint8Array,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(digest: String, ikm: js.typedarray.Uint8Array, salt: String, info: String, keylen: Double): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: String,
    ikm: js.typedarray.Uint8Array,
    salt: String,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: String,
    ikm: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    info: String,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def hkdf(
    digest: String,
    ikm: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    info: js.typedarray.Uint8Array,
    keylen: Double
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}

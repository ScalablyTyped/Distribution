package typings.multiformats

import typings.multiformats.distTypesSrcHashesHasherMod.Hasher
import typings.multiformats.multiformatsInts.`18`
import typings.multiformats.multiformatsInts.`19`
import typings.multiformats.multiformatsStrings.`sha2-256`
import typings.multiformats.multiformatsStrings.`sha2-512`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object hashesSha2Mod {
  
  @JSImport("multiformats/hashes/sha2", "sha256")
  @js.native
  val sha256: Hasher[`sha2-256`, `18`] = js.native
  
  @JSImport("multiformats/hashes/sha2", "sha512")
  @js.native
  val sha512: Hasher[`sha2-512`, `19`] = js.native
}

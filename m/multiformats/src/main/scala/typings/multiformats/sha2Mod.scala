package typings.multiformats

import typings.multiformats.hasherMod.Hasher
import typings.multiformats.multiformatsNumbers.`18`
import typings.multiformats.multiformatsNumbers.`19`
import typings.multiformats.multiformatsStrings.`sha2-256`
import typings.multiformats.multiformatsStrings.`sha2-512`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha2Mod {
  
  @JSImport("multiformats/types/src/hashes/sha2", "sha256")
  @js.native
  val sha256: Hasher[`sha2-256`, `18`] = js.native
  
  @JSImport("multiformats/types/src/hashes/sha2", "sha512")
  @js.native
  val sha512: Hasher[`sha2-512`, `19`] = js.native
}

package typings.multiformats

import typings.multiformats.baseMod.Codec
import typings.multiformats.multiformatsStrings.Z
import typings.multiformats.multiformatsStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base58Mod {
  
  @JSImport("multiformats/types/src/bases/base58", "base58btc")
  @js.native
  val base58btc: Codec[typings.multiformats.multiformatsStrings.base58btc, z_] = js.native
  
  @JSImport("multiformats/types/src/bases/base58", "base58flickr")
  @js.native
  val base58flickr: Codec[typings.multiformats.multiformatsStrings.base58flickr, Z] = js.native
}

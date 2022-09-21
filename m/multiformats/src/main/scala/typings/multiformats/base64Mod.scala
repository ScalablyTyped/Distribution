package typings.multiformats

import typings.multiformats.baseMod.Codec
import typings.multiformats.multiformatsStrings.M
import typings.multiformats.multiformatsStrings.U
import typings.multiformats.multiformatsStrings.m_
import typings.multiformats.multiformatsStrings.u_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base64Mod {
  
  @JSImport("multiformats/dist/types/src/bases/base64", "base64")
  @js.native
  val base64: Codec[typings.multiformats.multiformatsStrings.base64, m_] = js.native
  
  @JSImport("multiformats/dist/types/src/bases/base64", "base64pad")
  @js.native
  val base64pad: Codec[typings.multiformats.multiformatsStrings.base64pad, M] = js.native
  
  @JSImport("multiformats/dist/types/src/bases/base64", "base64url")
  @js.native
  val base64url: Codec[typings.multiformats.multiformatsStrings.base64url, u_] = js.native
  
  @JSImport("multiformats/dist/types/src/bases/base64", "base64urlpad")
  @js.native
  val base64urlpad: Codec[typings.multiformats.multiformatsStrings.base64urlpad, U] = js.native
}

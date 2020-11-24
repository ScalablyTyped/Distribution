package typings.otplibPluginThirtyTwo

import typings.otplibCore.authenticatorMod.Base32SecretKey
import typings.otplibCore.authenticatorMod.KeyDecoder
import typings.otplibCore.authenticatorMod.KeyEncoder
import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/plugin-thirty-two", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val keyDecoder: KeyDecoder[SecretKey] = js.native
  
  val keyEncoder: KeyEncoder[Base32SecretKey] = js.native
}

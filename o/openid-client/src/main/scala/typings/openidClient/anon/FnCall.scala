package typings.openidClient.anon

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.JsonWebKeyInput
import typings.node.cryptoMod.KeyObject
import typings.node.cryptoMod.PrivateKeyInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(key: String): KeyObject = js.native
  def apply(key: Buffer): KeyObject = js.native
  def apply(key: JsonWebKeyInput): KeyObject = js.native
  def apply(key: PrivateKeyInput): KeyObject = js.native
}

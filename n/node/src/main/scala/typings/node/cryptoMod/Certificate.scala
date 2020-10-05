package typings.node.cryptoMod

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends js.Object {
  def exportChallenge(spkac: BinaryLike): Buffer = js.native
  def exportPublicKey(spkac: BinaryLike): Buffer = js.native
  def verifySpkac(spkac: ArrayBufferView): Boolean = js.native
}

@JSImport("crypto", "Certificate")
@js.native
object Certificate extends Instantiable0[Certificate] {
  def apply(): Certificate = js.native
}


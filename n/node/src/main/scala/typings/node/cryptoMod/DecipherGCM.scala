package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.PlaintextLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecipherGCM extends Decipher {
  def setAAD(buffer: ArrayBufferView): this.type = js.native
  def setAAD(buffer: ArrayBufferView, options: PlaintextLength): this.type = js.native
  def setAuthTag(buffer: ArrayBufferView): this.type = js.native
}


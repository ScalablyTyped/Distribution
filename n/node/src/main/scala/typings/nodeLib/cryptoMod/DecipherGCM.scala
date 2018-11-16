package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecipherGCM extends Decipher {
  def setAAD(buffer: nodeLib.Buffer): this.type = js.native
  def setAAD(buffer: nodeLib.Buffer, options: nodeLib.Anon_PlaintextLength): this.type = js.native
  def setAAD(buffer: nodeLib.NodeJSNs.TypedArray): this.type = js.native
  def setAAD(buffer: nodeLib.NodeJSNs.TypedArray, options: nodeLib.Anon_PlaintextLength): this.type = js.native
  def setAAD(buffer: stdLib.DataView): this.type = js.native
  def setAAD(buffer: stdLib.DataView, options: nodeLib.Anon_PlaintextLength): this.type = js.native
  def setAuthTag(buffer: nodeLib.Buffer): this.type = js.native
  def setAuthTag(buffer: nodeLib.NodeJSNs.TypedArray): this.type = js.native
  def setAuthTag(buffer: stdLib.DataView): this.type = js.native
}


package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  def exportChallenge(spkac: java.lang.String): nodeLib.Buffer = js.native
  def exportChallenge(spkac: nodeLib.Buffer): nodeLib.Buffer = js.native
  def exportChallenge(spkac: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def exportChallenge(spkac: stdLib.DataView): nodeLib.Buffer = js.native
  def exportPublicKey(spkac: java.lang.String): nodeLib.Buffer = js.native
  def exportPublicKey(spkac: nodeLib.Buffer): nodeLib.Buffer = js.native
  def exportPublicKey(spkac: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def exportPublicKey(spkac: stdLib.DataView): nodeLib.Buffer = js.native
  def verifySpkac(spkac: nodeLib.Buffer): scala.Boolean = js.native
  def verifySpkac(spkac: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def verifySpkac(spkac: stdLib.DataView): scala.Boolean = js.native
}


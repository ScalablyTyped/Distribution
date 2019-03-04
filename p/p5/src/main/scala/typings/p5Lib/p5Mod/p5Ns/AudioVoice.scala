package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioVoice extends js.Object {
  /**
    *   Connect to p5 objects or Web Audio Nodes
    */
  def connect(unit: js.Object): scala.Unit
  /**
    *   Disconnect from soundOut
    */
  def disconnect(): scala.Unit
}

object AudioVoice {
  @scala.inline
  def apply(connect: js.Function1[js.Object, scala.Unit], disconnect: js.Function0[scala.Unit]): AudioVoice = {
    val __obj = js.Dynamic.literal(connect = connect, disconnect = disconnect)
  
    __obj.asInstanceOf[AudioVoice]
  }
}


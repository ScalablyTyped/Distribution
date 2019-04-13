package typings
package p5Lib.p5Mod

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
  def apply(connect: js.Object => scala.Unit, disconnect: () => scala.Unit): AudioVoice = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction0(disconnect))
  
    __obj.asInstanceOf[AudioVoice]
  }
}


package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioVoice extends js.Object {
  /**
    *   Connect to p5 objects or Web Audio Nodes
    */
  def connect(unit: js.Object): Unit
  /**
    *   Disconnect from soundOut
    */
  def disconnect(): Unit
}

object AudioVoice {
  @scala.inline
  def apply(connect: js.Object => Unit, disconnect: () => Unit): AudioVoice = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction0(disconnect))
  
    __obj.asInstanceOf[AudioVoice]
  }
}


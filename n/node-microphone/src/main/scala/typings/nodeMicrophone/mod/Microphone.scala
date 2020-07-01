package typings.nodeMicrophone.mod

import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Microphone extends js.Object {
  def startRecording(): WriteStream
  def stopRecording(): Unit
}

object Microphone {
  @scala.inline
  def apply(startRecording: () => WriteStream, stopRecording: () => Unit): Microphone = {
    val __obj = js.Dynamic.literal(startRecording = js.Any.fromFunction0(startRecording), stopRecording = js.Any.fromFunction0(stopRecording))
    __obj.asInstanceOf[Microphone]
  }
}


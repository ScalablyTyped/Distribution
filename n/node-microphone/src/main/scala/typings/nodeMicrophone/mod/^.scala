package typings.nodeMicrophone.mod

import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-microphone", JSImport.Namespace)
@js.native
class ^ () extends Microphone {
  def this(options: MicrophoneOptions) = this()
  /* CompleteClass */
  override def startRecording(): WriteStream = js.native
  /* CompleteClass */
  override def stopRecording(): Unit = js.native
}


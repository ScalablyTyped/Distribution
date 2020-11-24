package typings.nodeMicrophone.mod

import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Microphone extends js.Object {
  
  def startRecording(): WriteStream = js.native
  
  def stopRecording(): Unit = js.native
}
object Microphone {
  
  @scala.inline
  def apply(startRecording: () => WriteStream, stopRecording: () => Unit): Microphone = {
    val __obj = js.Dynamic.literal(startRecording = js.Any.fromFunction0(startRecording), stopRecording = js.Any.fromFunction0(stopRecording))
    __obj.asInstanceOf[Microphone]
  }
  
  @scala.inline
  implicit class MicrophoneOps[Self <: Microphone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStartRecording(value: () => WriteStream): Self = this.set("startRecording", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopRecording(value: () => Unit): Self = this.set("stopRecording", js.Any.fromFunction0(value))
  }
}

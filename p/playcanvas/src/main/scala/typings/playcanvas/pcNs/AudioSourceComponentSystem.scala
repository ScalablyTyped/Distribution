package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.AudioSourceComponentSystem
  * @class Controls playback of an audio sample. This class will be deprecated in favor of {@link pc.SoundComponentSystem}.
  * @param {pc.Application} app The Application
  * @param {pc.SoundManager} manager The sound manager
  * @extends pc.ComponentSystem
  */
@JSGlobal("pc.AudioSourceComponentSystem")
@js.native
class AudioSourceComponentSystem protected () extends ComponentSystem {
  def this(app: Application, manager: SoundManager) = this()
  /**
    * @name pc.AudioSourceComponentSystem#setVolume()
    * @function
    * @description Set the volume for the entire AudioSource system. All sources will have their volume multiplied by this value
    * @param {Number} value The value to set the volume to. Valid from 0.0 - 1.0
    */
  def setVolume(volume: Double): Unit = js.native
}


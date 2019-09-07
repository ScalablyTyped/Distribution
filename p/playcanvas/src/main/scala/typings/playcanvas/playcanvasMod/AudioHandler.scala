package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.AudioHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Sound} resources
  * @param {pc.SoundManager} manager The sound manager
  */
@JSImport("playcanvas", "AudioHandler")
@js.native
class AudioHandler protected ()
  extends typings.playcanvas.pcNs.AudioHandler {
  def this(manager: typings.playcanvas.pcNs.SoundManager) = this()
}


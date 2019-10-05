package typings.playcanvas.pc

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
@JSGlobal("pc.AudioHandler")
@js.native
class AudioHandler protected () extends ResourceHandler {
  def this(manager: SoundManager) = this()
}


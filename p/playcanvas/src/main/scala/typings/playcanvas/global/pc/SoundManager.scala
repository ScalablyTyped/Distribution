package typings.playcanvas.global.pc

import typings.playcanvas.anon.ForceWebAudioApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new sound manager.
  * @property volume - Global volume for the manager. All {@link pc.SoundInstance}s will scale their volume with this volume. Valid between [0, 1].
  * @param [options] - Options options object.
  * @param [options.forceWebAudioApi] - Always use the Web Audio API even check indicates that it if not available.
  */
@JSGlobal("pc.SoundManager")
@js.native
class SoundManager ()
  extends typings.playcanvas.pc.SoundManager {
  def this(options: ForceWebAudioApi) = this()
}


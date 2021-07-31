package typings.playcanvas.mod

import typings.playcanvas.anon.ForceWebAudioApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new sound manager.
  * @property volume - Global volume for the manager. All {@link pc.SoundInstance}s will scale their volume with this volume. Valid between [0, 1].
  * @param [options] - Options options object.
  * @param [options.forceWebAudioApi] - Always use the Web Audio API even check indicates that it if not available.
  */
@JSImport("playcanvas", "SoundManager")
@js.native
class SoundManager ()
  extends StObject
     with typings.playcanvas.pc.SoundManager {
  def this(options: ForceWebAudioApi) = this()
}

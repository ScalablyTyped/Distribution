package typings.playcanvas.global.pc

import typings.playcanvas.anon.ForceWebAudioApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SoundManager is used to load and play audio. It also applies system-wide settings like
  * global volume, suspend and resume.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.SoundManager")
@js.native
/**
  * Create a new SoundManager instance.
  *
  * @param {object} [options] - Options options object.
  * @param {boolean} [options.forceWebAudioApi] - Always use the Web Audio API, even if check
  * indicates that it is not available.
  */
open class SoundManager ()
  extends typings.playcanvas.mod.SoundManager {
  def this(options: ForceWebAudioApi) = this()
}

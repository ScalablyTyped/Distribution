package typings.playcanvas.global.pc

import typings.playcanvas.anon.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SoundSlot controls playback of an audio asset.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.SoundSlot")
@js.native
open class SoundSlot protected ()
  extends typings.playcanvas.mod.SoundSlot {
  /**
    * Create a new SoundSlot.
    *
    * @param {import('./component.js').SoundComponent} component - The Component that created this
    * slot.
    * @param {string} [name] - The name of the slot. Defaults to 'Untitled'.
    * @param {object} [options] - Settings for the slot.
    * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
    * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
    * @param {boolean} [options.loop=false] - If true the sound will restart when it reaches the
    * end.
    * @param {number} [options.startTime=0] - The start time from which the sound will start
    * playing.
    * @param {number} [options.duration=null] - The duration of the sound that the slot will play
    * starting from startTime.
    * @param {boolean} [options.overlap=false] - If true then sounds played from slot will be
    * played independently of each other. Otherwise the slot will first stop the current sound
    * before starting the new one.
    * @param {boolean} [options.autoPlay=false] - If true the slot will start playing as soon as
    * its audio asset is loaded.
    * @param {number} [options.asset=null] - The asset id of the audio asset that is going to be
    * played by this slot.
    */
  def this(component: typings.playcanvas.mod.SoundComponent) = this()
  def this(component: typings.playcanvas.mod.SoundComponent, name: String) = this()
  def this(component: typings.playcanvas.mod.SoundComponent, name: String, options: Asset) = this()
  def this(component: typings.playcanvas.mod.SoundComponent, name: Unit, options: Asset) = this()
}

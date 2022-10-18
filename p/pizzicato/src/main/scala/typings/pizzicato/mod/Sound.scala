package typings.pizzicato.mod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pizzicato", "Sound")
@js.native
open class Sound[D /* <: SoundDescription */] ()
  extends StObject
     with Events[SoundEvent] {
  def this(description: D) = this()
  def this(description: D, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]) = this()
  def this(description: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]) = this()
  
  def addEffect(effect: Effect): Unit = js.native
  
  /**
    * Value in seconds that indicates the fade-in time when the sound
    *  is played. Defaults to 0.04.
    */
  var attack: Double = js.native
  
  /** Connect a detached sound to a destination */
  def connect(audioNode: AudioNode): this.type = js.native
  
  /**
    * Whether the sound is connected to an output destination and is
    * playable.
    */
  val detached: Boolean = js.native
  
  /**
    * Disconnect a sound from the context's destination so it can be
    * garbage collected.
    */
  def disconnect(audioNode: AudioNode): this.type = js.native
  
  /** The effects attached to the sound */
  var effects: js.Array[Effect] = js.native
  
  /** Frequency of the wave if the sound's source is a wave */
  var frequency: /* import warning: importer.ImportType#apply Failed type conversion: D extends {  source :'wave'} ? number : null */ js.Any = js.native
  
  val loop: Boolean = js.native
  
  def on[Context](name: SoundEvent, callback: js.ThisFunction0[/* this */ Context, Unit]): Unit = js.native
  def on[Context](name: SoundEvent, callback: js.ThisFunction0[/* this */ Context, Unit], context: Context): Unit = js.native
  
  /**
    * Pause the sound. The next time it is played, it will continue
    * from where it left off.
    */
  def pause(): Unit = js.native
  
  /**
    * Play the sound.
    * @param when the time in seconds to wait before playing.
    * @param offset the position in seconds where the sound will start
    *  playing from. Both default to zero.
    */
  def play(): Unit = js.native
  def play(when: Double): Unit = js.native
  def play(when: Double, offset: Double): Unit = js.native
  def play(when: Unit, offset: Double): Unit = js.native
  
  val playing: Boolean = js.native
  
  /**
    * Value in seconds that indicates the fade-out time once the sound
    * is stopped. Min: 0, Max: 1, Default: 1.
    */
  var release: Double = js.native
  
  def removeEffect(effect: Effect): Unit = js.native
  
  /**
    *  Stop the sound. The next time it is played, it will start from
    * the beginning.
    */
  def stop(): Unit = js.native
  
  var volume: Double = js.native
}

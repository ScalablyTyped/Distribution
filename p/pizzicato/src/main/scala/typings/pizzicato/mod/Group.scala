package typings.pizzicato.mod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pizzicato", "Group")
@js.native
open class Group ()
  extends StObject
     with Events[GroupEvent] {
  def this(sounds: js.Array[Sound[SoundDescription]]) = this()
  
  /** Add an effect to the group. The effect is applied to all sounds. */
  def addEffect(effect: Effect): this.type = js.native
  
  /** Add a sound to the group */
  def addSound(sound: Sound[SoundDescription]): Unit = js.native
  
  /** Connect a detached group to a destination */
  def connect(audioNode: AudioNode): this.type = js.native
  
  /**
    * Disconnect a group from the context's destination so it can be
    * garbage collected.
    */
  def disconnect(audioNode: AudioNode): this.type = js.native
  
  /** The effects attached to the group */
  val effects: js.Array[Effect] = js.native
  
  def on[Context](name: GroupEvent, callback: js.ThisFunction0[/* this */ Context, Unit]): Unit = js.native
  def on[Context](name: GroupEvent, callback: js.ThisFunction0[/* this */ Context, Unit], context: Context): Unit = js.native
  
  /** Pause all the sounds in the group */
  def pause(): Unit = js.native
  
  /** Play all the sounds in the group */
  def play(): Unit = js.native
  
  /** Remove an effect from the group */
  def removeEffect(effect: Effect): this.type = js.native
  
  /** Remove a sound from the group */
  def removeSound(sound: Sound[SoundDescription]): Unit = js.native
  
  /** The Sounds in the group */
  val sounds: js.Array[Sound[SoundDescription]] = js.native
  
  /** Stop all the sounds in the group */
  def stop(): Unit = js.native
  
  /** The master volume of the group */
  var volume: Double = js.native
}

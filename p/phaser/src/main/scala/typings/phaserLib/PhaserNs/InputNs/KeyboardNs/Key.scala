package typings
package phaserLib.PhaserNs.InputNs.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic Key object which can be passed to the Process functions (and so on)
  * keycode must be an integer
  */
@JSGlobal("Phaser.Input.Keyboard.Key")
@js.native
class Key protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param plugin The Keyboard Plugin instance that owns this Key object.
    * @param keyCode The keycode of this key.
    */
  def this(plugin: KeyboardPlugin, keyCode: phaserLib.integer) = this()
  /**
    * The down state of the ALT key, if pressed at the same time as this key.
    */
  var altKey: scala.Boolean = js.native
  /**
    * The down state of the CTRL key, if pressed at the same time as this key.
    */
  var ctrlKey: scala.Boolean = js.native
  /**
    * The number of milliseconds this key was held down for in the previous down - up sequence.
    * This value isn't updated every game step, only when the Key changes state.
    * To get the current duration use the `getDuration` method.
    */
  var duration: scala.Double = js.native
  /**
    * When a key is held down should it continuously fire the `down` event each time it repeats?
    * 
    * By default it will emit the `down` event just once, but if you wish to receive the event
    * for each repeat as well, enable this property.
    */
  var emitOnRepeat: scala.Boolean = js.native
  /**
    * Can this Key be processed?
    */
  var enabled: scala.Boolean = js.native
  /**
    * The "down" state of the key. This will remain `true` for as long as the keyboard thinks this key is held down.
    */
  var isDown: scala.Boolean = js.native
  /**
    * The "up" state of the key. This will remain `true` for as long as the keyboard thinks this key is up.
    */
  var isUp: scala.Boolean = js.native
  /**
    * The keycode of this key.
    */
  var keyCode: phaserLib.integer = js.native
  /**
    * The location of the modifier key. 0 for standard (or unknown), 1 for left, 2 for right, 3 for numpad.
    */
  var location: scala.Double = js.native
  /**
    * The down state of the Meta key, if pressed at the same time as this key.
    * On a Mac the Meta Key is the Command key. On Windows keyboards, it's the Windows key.
    */
  var metaKey: scala.Boolean = js.native
  /**
    * The original DOM event.
    */
  var originalEvent: stdLib.KeyboardEvent = js.native
  /**
    * The Keyboard Plugin instance that owns this Key object.
    */
  var plugin: KeyboardPlugin = js.native
  /**
    * If a key is held down this holds down the number of times the key has 'repeated'.
    */
  var repeats: scala.Double = js.native
  /**
    * The down state of the SHIFT key, if pressed at the same time as this key.
    */
  var shiftKey: scala.Boolean = js.native
  /**
    * The timestamp when the key was last pressed down.
    */
  var timeDown: scala.Double = js.native
  /**
    * The timestamp when the key was last released.
    */
  var timeUp: scala.Double = js.native
  /**
    * Returns the duration, in ms, that the Key has been held down for.
    * 
    * If the key is not currently down it will return zero.
    * 
    * The get the duration the Key was held down for in the previous up-down cycle,
    * use the `Key.duration` property value instead.
    */
  def getDuration(): scala.Double = js.native
  /**
    * Processes the Key Down action for this Key.
    * Called automatically by the Keyboard Plugin.
    * @param event The native DOM Keyboard event.
    */
  def onDown(event: stdLib.KeyboardEvent): scala.Unit = js.native
  /**
    * Processes the Key Up action for this Key.
    * Called automatically by the Keyboard Plugin.
    * @param event The native DOM Keyboard event.
    */
  def onUp(event: stdLib.KeyboardEvent): scala.Unit = js.native
  /**
    * Resets this Key object back to its default un-pressed state.
    */
  def reset(): Key = js.native
  /**
    * Controls if this Key will continuously emit a `down` event while being held down (true),
    * or emit the event just once, on first press, and then skip future events (false).
    * @param value Emit `down` events on repeated key down actions, or just once?
    */
  def setEmitOnRepeat(value: scala.Boolean): Key = js.native
}


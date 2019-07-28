package typings.phaser.PhaserNs.InputNs.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.Keyboard.Events")
@js.native
object EventsNs extends js.Object {
  /**
    * The Global Key Down Event.
    * 
    * This event is dispatched by the Keyboard Plugin when any key on the keyboard is pressed down.
    * 
    * Listen to this event from within a Scene using: `this.input.keyboard.on('keydown', listener)`.
    * 
    * You can also listen for a specific key being pressed. See [Keyboard.Events.KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:KEY_DOWN} for details.
    * 
    * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:DOWN} for details.
    * 
    * _Note_: Many keyboards are unable to process certain combinations of keys due to hardware limitations known as ghosting.
    * Read [this article on ghosting]{@link http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/} for details.
    * 
    * Also, please be aware that some browser extensions can disable or override Phaser keyboard handling.
    * For example, the Chrome extension vimium is known to disable Phaser from using the D key, while EverNote disables the backtick key.
    * There are others. So, please check your extensions if you find you have specific keys that don't work.
    */
  val ANY_KEY_DOWN: js.Any = js.native
  /**
    * The Global Key Up Event.
    * 
    * This event is dispatched by the Keyboard Plugin when any key on the keyboard is released.
    * 
    * Listen to this event from within a Scene using: `this.input.keyboard.on('keyup', listener)`.
    * 
    * You can also listen for a specific key being released. See [Keyboard.Events.KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:KEY_UP} for details.
    * 
    * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.UP]{@linkcode Phaser.Input.Keyboard.Events#event:UP} for details.
    */
  val ANY_KEY_UP: js.Any = js.native
  /**
    * The Key Combo Match Event.
    * 
    * This event is dispatched by the Keyboard Plugin when a [Key Combo]{@link Phaser.Input.Keyboard.KeyCombo} is matched.
    * 
    * Listen for this event from the Key Plugin after a combo has been created:
    * 
    * ```javascript
    * this.input.keyboard.createCombo([ 38, 38, 40, 40, 37, 39, 37, 39, 66, 65, 13 ], { resetOnMatch: true });
    * 
    * this.input.keyboard.on('keycombomatch', function (event) {
    *     console.log('Konami Code entered!');
    * });
    * ```
    */
  val COMBO_MATCH: js.Any = js.native
  /**
    * The Key Down Event.
    * 
    * This event is dispatched by a [Key]{@link Phaser.Input.Keyboard.Key} object when it is pressed.
    * 
    * Listen for this event from the Key object instance directly:
    * 
    * ```javascript
    * var spaceBar = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
    * 
    * spaceBar.on('down', listener)
    * ```
    * 
    * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_DOWN} for details.
    */
  val DOWN: js.Any = js.native
  /**
    * The Key Down Event.
    * 
    * This event is dispatched by the Keyboard Plugin when any key on the keyboard is pressed down.
    * 
    * Unlike the `ANY_KEY_DOWN` event, this one has a special dynamic event name. For example, to listen for the `A` key being pressed
    * use the following from within a Scene: `this.input.keyboard.on('keydown-A', listener)`. You can replace the `-A` part of the event
    * name with any valid [Key Code string]{@link Phaser.Input.Keyboard.KeyCodes}. For example, this will listen for the space bar: 
    * `this.input.keyboard.on('keydown-SPACE', listener)`.
    * 
    * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_DOWN} for details.
    * 
    * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.DOWN]{@linkcode Phaser.Input.Keyboard.Events#event:DOWN} for details.
    * 
    * _Note_: Many keyboards are unable to process certain combinations of keys due to hardware limitations known as ghosting.
    * Read [this article on ghosting]{@link http://www.html5gamedevs.com/topic/4876-impossible-to-use-more-than-2-keyboard-input-buttons-at-the-same-time/} for details.
    * 
    * Also, please be aware that some browser extensions can disable or override Phaser keyboard handling.
    * For example, the Chrome extension vimium is known to disable Phaser from using the D key, while EverNote disables the backtick key.
    * There are others. So, please check your extensions if you find you have specific keys that don't work.
    */
  val KEY_DOWN: js.Any = js.native
  /**
    * The Key Up Event.
    * 
    * This event is dispatched by the Keyboard Plugin when any key on the keyboard is released.
    * 
    * Unlike the `ANY_KEY_UP` event, this one has a special dynamic event name. For example, to listen for the `A` key being released
    * use the following from within a Scene: `this.input.keyboard.on('keyup-A', listener)`. You can replace the `-A` part of the event
    * name with any valid [Key Code string]{@link Phaser.Input.Keyboard.KeyCodes}. For example, this will listen for the space bar: 
    * `this.input.keyboard.on('keyup-SPACE', listener)`.
    * 
    * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_UP} for details.
    * 
    * Finally, you can create Key objects, which you can also listen for events from. See [Keyboard.Events.UP]{@linkcode Phaser.Input.Keyboard.Events#event:UP} for details.
    */
  val KEY_UP: js.Any = js.native
  /**
    * The Key Up Event.
    * 
    * This event is dispatched by a [Key]{@link Phaser.Input.Keyboard.Key} object when it is released.
    * 
    * Listen for this event from the Key object instance directly:
    * 
    * ```javascript
    * var spaceBar = this.input.keyboard.addKey(Phaser.Input.Keyboard.KeyCodes.SPACE);
    * 
    * spaceBar.on('up', listener)
    * ```
    * 
    * You can also create a generic 'global' listener. See [Keyboard.Events.ANY_KEY_UP]{@linkcode Phaser.Input.Keyboard.Events#event:ANY_KEY_UP} for details.
    */
  val UP: js.Any = js.native
}


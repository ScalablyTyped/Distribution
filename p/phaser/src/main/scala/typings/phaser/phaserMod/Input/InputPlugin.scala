package typings.phaser.phaserMod.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Input Plugin belongs to a Scene and handles all input related events and operations for it.
  * 
  * You can access it from within a Scene using `this.input`.
  * 
  * It emits events directly. For example, you can do:
  * 
  * ```javascript
  * this.input.on('pointerdown', callback, context);
  * ```
  * 
  * To listen for a pointer down event anywhere on the game canvas.
  * 
  * Game Objects can be enabled for input by calling their `setInteractive` method. After which they
  * will directly emit input events:
  * 
  * ```javascript
  * var sprite = this.add.sprite(x, y, texture);
  * sprite.setInteractive();
  * sprite.on('pointerdown', callback, context);
  * ```
  * 
  * There are lots of game configuration options available relating to input.
  * See the [Input Config object]{@linkcode Phaser.Types.Core.InputConfig} for more details, including how to deal with Phaser
  * listening for input events outside of the canvas, how to set a default number of pointers, input
  * capture settings and more.
  * 
  * Please also see the Input examples and tutorials for further information.
  */
@JSImport("phaser", "Input.InputPlugin")
@js.native
class InputPlugin protected ()
  extends typings.phaser.Phaser.Input.InputPlugin {
  /**
    * 
    * @param scene A reference to the Scene that this Input Plugin is responsible for.
    */
  def this(scene: typings.phaser.Phaser.Scene) = this()
}


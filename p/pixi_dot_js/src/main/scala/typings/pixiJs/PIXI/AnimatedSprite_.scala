package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An AnimatedSprite is a simple way to display an animation depicted by a list of textures.
  *
  * ```js
  * let alienImages = ["image_sequence_01.png","image_sequence_02.png","image_sequence_03.png","image_sequence_04.png"];
  * let textureArray = [];
  *
  * for (let i=0; i < 4; i++)
  * {
  *      let texture = PIXI.Texture.from(alienImages[i]);
  *      textureArray.push(texture);
  * };
  *
  * let animatedSprite = new PIXI.AnimatedSprite(textureArray);
  * ```
  *
  * The more efficient and simpler way to create an animated sprite is using a {@link PIXI.Spritesheet}
  * containing the animation definitions:
  *
  * ```js
  * PIXI.Loader.shared.add("assets/spritesheet.json").load(setup);
  *
  * function setup() {
  *   let sheet = PIXI.Loader.shared.resources["assets/spritesheet.json"].spritesheet;
  *   animatedSprite = new PIXI.AnimatedSprite(sheet.animations["image_sequence"]);
  *   ...
  * }
  * ```
  *
  * @class
  * @extends PIXI.Sprite
  * @memberof PIXI
  */
@js.native
trait AnimatedSprite_ extends Sprite {
  /**
    * The speed that the AnimatedSprite will play at. Higher is faster, lower is slower.
    *
    * @member {number} PIXI.AnimatedSprite#animationSpeed
    * @default 1
    */
  var animationSpeed: Double = js.native
  /**
    * Whether to use PIXI.Ticker.shared to auto update animation time
    *
    * @member {boolean}
    */
  var autoUpdate: Boolean = js.native
  /**
    * The AnimatedSprites current frame index.
    *
    * @member {number}
    * @readonly
    */
  val currentFrame: Double = js.native
  /**
    * Whether or not the animate sprite repeats after playing.
    *
    * @member {boolean} PIXI.AnimatedSprite#loop
    * @default true
    */
  var loop: Boolean = js.native
  /**
    * Indicates if the AnimatedSprite is currently playing.
    *
    * @member {boolean}
    * @readonly
    */
  val playing: Boolean = js.native
  /**
    * The array of textures used for this AnimatedSprite.
    *
    * @member {PIXI.Texture[]}
    */
  var textures: js.Array[Texture] = js.native
  /**
    * The total number of frames in the AnimatedSprite. This is the same as number of textures
    * assigned to the AnimatedSprite.
    *
    * @readonly
    * @member {number}
    * @default 0
    */
  val totalFrames: Double = js.native
  /**
    * Update anchor to [Texture's defaultAnchor]{@link PIXI.Texture#defaultAnchor} when frame changes.
    *
    * Useful with [sprite sheet animations]{@link PIXI.Spritesheet#animations} created with tools.
    * Changing anchor for each frame allows to pin sprite origin to certain moving feature
    * of the frame (e.g. left foot).
    *
    * Note: Enabling this will override any previously set `anchor` on each frame change.
    *
    * @member {boolean} PIXI.AnimatedSprite#updateAnchor
    * @default false
    */
  var updateAnchor: Boolean = js.native
  /**
    * Goes to a specific frame and begins playing the AnimatedSprite.
    *
    * @param {number} frameNumber - Frame index to start at.
    */
  def gotoAndPlay(frameNumber: Double): Unit = js.native
  /**
    * Stops the AnimatedSprite and goes to a specific frame.
    *
    * @param {number} frameNumber - Frame index to stop at.
    */
  def gotoAndStop(frameNumber: Double): Unit = js.native
  /**
    * User-assigned function to call when an AnimatedSprite finishes playing.
    *
    * @example
    * animation.onComplete = function () {
    *   // finished!
    * };
    * @member {Function} PIXI.AnimatedSprite#onComplete
    */
  def onComplete(params: js.Any*): js.Any = js.native
  /**
    * User-assigned function to call when an AnimatedSprite changes which texture is being rendered.
    *
    * @example
    * animation.onFrameChange = function () {
    *   // updated!
    * };
    * @member {Function} PIXI.AnimatedSprite#onFrameChange
    */
  def onFrameChange(params: js.Any*): js.Any = js.native
  /**
    * User-assigned function to call when `loop` is true, and an AnimatedSprite is played and
    * loops around to start again.
    *
    * @example
    * animation.onLoop = function () {
    *   // looped!
    * };
    * @member {Function} PIXI.AnimatedSprite#onLoop
    */
  def onLoop(params: js.Any*): js.Any = js.native
  /**
    * Plays the AnimatedSprite.
    *
    */
  def play(): Unit = js.native
  /**
    * Stops the AnimatedSprite.
    *
    */
  def stop(): Unit = js.native
  /**
    * Updates the object transform for rendering.
    *
    * @param {number} deltaTime - Time since last tick.
    */
  def update(deltaTime: Double): Unit = js.native
}


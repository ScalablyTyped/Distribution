package typings
package phaserLib.PhaserNs.TweensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Tweens")
@js.native
object ^ extends js.Object {
  /**
    * Tween state.
    */
  var ACTIVE: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var COMPLETE: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var COMPLETE_DELAY: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var CREATED: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var DELAY: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var HOLD_DELAY: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var INIT: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var LOOP_DELAY: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var OFFSET_DELAY: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var PAUSED: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var PENDING_ADD: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var PENDING_REMOVE: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var PENDING_RENDER: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var PLAYING_BACKWARD: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var PLAYING_FORWARD: phaserLib.integer = js.native
  /**
    * Tween state.
    */
  var REMOVED: phaserLib.integer = js.native
  /**
    * TweenData state.
    */
  var REPEAT_DELAY: phaserLib.integer = js.native
  /**
    * Returns a TweenDataConfig object that describes the tween data for a unique property of a unique target. A single Tween consists of multiple TweenDatas, depending on how many properties are being changed by the Tween.
    * 
    * This is an internal function used by the TweenBuilder and should not be accessed directly, instead, Tweens should be created using the GameObjectFactory or GameObjectCreator.
    * @param target The target to tween.
    * @param key The property of the target to tween.
    * @param getEnd What the property will be at the END of the Tween.
    * @param getStart What the property will be at the START of the Tween.
    * @param ease The ease function this tween uses.
    * @param delay Time in ms/frames before tween will start.
    * @param duration Duration of the tween in ms/frames.
    * @param yoyo Determines whether the tween should return back to its start value after hold has expired.
    * @param hold Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
    * @param repeat Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    * @param repeatDelay Time in ms/frames before the repeat will start.
    * @param flipX Should toggleFlipX be called when yoyo or repeat happens?
    * @param flipY Should toggleFlipY be called when yoyo or repeat happens?
    */
  def TweenData(
    target: js.Object,
    key: java.lang.String,
    getEnd: js.Function,
    getStart: js.Function,
    ease: js.Function,
    delay: scala.Double,
    duration: scala.Double,
    yoyo: scala.Boolean,
    hold: scala.Double,
    repeat: scala.Double,
    repeatDelay: scala.Double,
    flipX: scala.Boolean,
    flipY: scala.Boolean
  ): phaserLib.PhaserNs.TypesNs.TweensNs.TweenDataConfig = js.native
}


package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldConfig extends js.Object {
  /**
    * The default bounce, or restitution, of bodies in the world.
    */
  var bounciness: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size of the cells used for the broadphase pass. Increase this value if you have lots of large objects in the world.
    */
  var cellSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Impact.World#debug}.
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color of this Body on the debug display.
    */
  var debugBodyColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the Body's boundary is drawn to the debug display.
    */
  var debugShowBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the Body's velocity is drawn to the debug display.
    */
  var debugShowVelocity: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color of the Body's velocity on the debug display.
    */
  var debugVelocityColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Impact.World#gravity}
    */
  var gravity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Gravity multiplier. Set to 0 for no gravity.
    */
  var gravityFactor: js.UndefOr[scala.Double] = js.undefined
  /**
    * [description]
    */
  var maxStep: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum velocity a body can move.
    */
  var maxVelocity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum X velocity objects can move.
    */
  var maxVelocityX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum Y velocity objects can move.
    */
  var maxVelocityY: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum velocity an object can be moving at to be considered for bounce.
    */
  var minBounceVelocity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should the world have bounds enabled by default?
    */
  var setBounds: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  /**
    * Should the bottom world bounds wall be created?
    */
  var `setBounds.bottom`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The height of the world bounds.
    */
  var `setBounds.height`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should the left-side world bounds wall be created?
    */
  var `setBounds.left`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should the right-side world bounds wall be created?
    */
  var `setBounds.right`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The thickness of the walls of the world bounds.
    */
  var `setBounds.thickness`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should the top world bounds wall be created?
    */
  var `setBounds.top`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The width of the world bounds.
    */
  var `setBounds.width`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x coordinate of the world bounds.
    */
  var `setBounds.x`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y coordinate of the world bounds.
    */
  var `setBounds.y`: js.UndefOr[scala.Double] = js.undefined
  /**
    * A number that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    */
  var timeScale: js.UndefOr[scala.Double] = js.undefined
}

object WorldConfig {
  @scala.inline
  def apply(
    bounciness: scala.Int | scala.Double = null,
    cellSize: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    debugBodyColor: scala.Int | scala.Double = null,
    debugShowBody: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowVelocity: js.UndefOr[scala.Boolean] = js.undefined,
    debugVelocityColor: scala.Int | scala.Double = null,
    gravity: scala.Int | scala.Double = null,
    gravityFactor: scala.Int | scala.Double = null,
    maxStep: scala.Int | scala.Double = null,
    maxVelocity: scala.Int | scala.Double = null,
    maxVelocityX: scala.Int | scala.Double = null,
    maxVelocityY: scala.Int | scala.Double = null,
    minBounceVelocity: scala.Int | scala.Double = null,
    setBounds: js.Object | scala.Boolean = null,
    `setBounds.bottom`: js.UndefOr[scala.Boolean] = js.undefined,
    `setBounds.height`: scala.Int | scala.Double = null,
    `setBounds.left`: js.UndefOr[scala.Boolean] = js.undefined,
    `setBounds.right`: js.UndefOr[scala.Boolean] = js.undefined,
    `setBounds.thickness`: scala.Int | scala.Double = null,
    `setBounds.top`: js.UndefOr[scala.Boolean] = js.undefined,
    `setBounds.width`: scala.Int | scala.Double = null,
    `setBounds.x`: scala.Int | scala.Double = null,
    `setBounds.y`: scala.Int | scala.Double = null,
    timeScale: scala.Int | scala.Double = null
  ): WorldConfig = {
    val __obj = js.Dynamic.literal()
    if (bounciness != null) __obj.updateDynamic("bounciness")(bounciness.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (debugBodyColor != null) __obj.updateDynamic("debugBodyColor")(debugBodyColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBody)) __obj.updateDynamic("debugShowBody")(debugShowBody)
    if (!js.isUndefined(debugShowVelocity)) __obj.updateDynamic("debugShowVelocity")(debugShowVelocity)
    if (debugVelocityColor != null) __obj.updateDynamic("debugVelocityColor")(debugVelocityColor.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (gravityFactor != null) __obj.updateDynamic("gravityFactor")(gravityFactor.asInstanceOf[js.Any])
    if (maxStep != null) __obj.updateDynamic("maxStep")(maxStep.asInstanceOf[js.Any])
    if (maxVelocity != null) __obj.updateDynamic("maxVelocity")(maxVelocity.asInstanceOf[js.Any])
    if (maxVelocityX != null) __obj.updateDynamic("maxVelocityX")(maxVelocityX.asInstanceOf[js.Any])
    if (maxVelocityY != null) __obj.updateDynamic("maxVelocityY")(maxVelocityY.asInstanceOf[js.Any])
    if (minBounceVelocity != null) __obj.updateDynamic("minBounceVelocity")(minBounceVelocity.asInstanceOf[js.Any])
    if (setBounds != null) __obj.updateDynamic("setBounds")(setBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(`setBounds.bottom`)) __obj.updateDynamic("setBounds.bottom")(`setBounds.bottom`)
    if (`setBounds.height` != null) __obj.updateDynamic("setBounds.height")(`setBounds.height`.asInstanceOf[js.Any])
    if (!js.isUndefined(`setBounds.left`)) __obj.updateDynamic("setBounds.left")(`setBounds.left`)
    if (!js.isUndefined(`setBounds.right`)) __obj.updateDynamic("setBounds.right")(`setBounds.right`)
    if (`setBounds.thickness` != null) __obj.updateDynamic("setBounds.thickness")(`setBounds.thickness`.asInstanceOf[js.Any])
    if (!js.isUndefined(`setBounds.top`)) __obj.updateDynamic("setBounds.top")(`setBounds.top`)
    if (`setBounds.width` != null) __obj.updateDynamic("setBounds.width")(`setBounds.width`.asInstanceOf[js.Any])
    if (`setBounds.x` != null) __obj.updateDynamic("setBounds.x")(`setBounds.x`.asInstanceOf[js.Any])
    if (`setBounds.y` != null) __obj.updateDynamic("setBounds.y")(`setBounds.y`.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldConfig]
  }
}


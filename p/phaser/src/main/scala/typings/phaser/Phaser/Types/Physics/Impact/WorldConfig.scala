package typings.phaser.Phaser.Types.Physics.Impact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldConfig extends js.Object {
  /**
    * The default bounce, or restitution, of bodies in the world.
    */
  var bounciness: js.UndefOr[Double] = js.undefined
  /**
    * The size of the cells used for the broadphase pass. Increase this value if you have lots of large objects in the world.
    */
  var cellSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Impact.World#debug}.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * The color of this Body on the debug display.
    */
  var debugBodyColor: js.UndefOr[Double] = js.undefined
  /**
    * Whether the Body's boundary is drawn to the debug display.
    */
  var debugShowBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the Body's velocity is drawn to the debug display.
    */
  var debugShowVelocity: js.UndefOr[Boolean] = js.undefined
  /**
    * The color of the Body's velocity on the debug display.
    */
  var debugVelocityColor: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Impact.World#gravity}
    */
  var gravity: js.UndefOr[Double] = js.undefined
  /**
    * Gravity multiplier. Set to 0 for no gravity.
    */
  var gravityFactor: js.UndefOr[Double] = js.undefined
  /**
    * [description]
    */
  var maxStep: js.UndefOr[Double] = js.undefined
  /**
    * The maximum velocity a body can move.
    */
  var maxVelocity: js.UndefOr[Double] = js.undefined
  /**
    * Maximum X velocity objects can move.
    */
  var maxVelocityX: js.UndefOr[Double] = js.undefined
  /**
    * Maximum Y velocity objects can move.
    */
  var maxVelocityY: js.UndefOr[Double] = js.undefined
  /**
    * The minimum velocity an object can be moving at to be considered for bounce.
    */
  var minBounceVelocity: js.UndefOr[Double] = js.undefined
  /**
    * Should the world have bounds enabled by default?
    */
  var setBounds: js.UndefOr[js.Object | Boolean] = js.undefined
  /**
    * Should the bottom world bounds wall be created?
    */
  @JSName("setBounds.bottom")
  var setBoundsDotbottom: js.UndefOr[Boolean] = js.undefined
  /**
    * The height of the world bounds.
    */
  @JSName("setBounds.height")
  var setBoundsDotheight: js.UndefOr[Double] = js.undefined
  /**
    * Should the left-side world bounds wall be created?
    */
  @JSName("setBounds.left")
  var setBoundsDotleft: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the right-side world bounds wall be created?
    */
  @JSName("setBounds.right")
  var setBoundsDotright: js.UndefOr[Boolean] = js.undefined
  /**
    * The thickness of the walls of the world bounds.
    */
  @JSName("setBounds.thickness")
  var setBoundsDotthickness: js.UndefOr[Double] = js.undefined
  /**
    * Should the top world bounds wall be created?
    */
  @JSName("setBounds.top")
  var setBoundsDottop: js.UndefOr[Boolean] = js.undefined
  /**
    * The width of the world bounds.
    */
  @JSName("setBounds.width")
  var setBoundsDotwidth: js.UndefOr[Double] = js.undefined
  /**
    * The x coordinate of the world bounds.
    */
  @JSName("setBounds.x")
  var setBoundsDotx: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the world bounds.
    */
  @JSName("setBounds.y")
  var setBoundsDoty: js.UndefOr[Double] = js.undefined
  /**
    * A number that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    */
  var timeScale: js.UndefOr[Double] = js.undefined
}

object WorldConfig {
  @scala.inline
  def apply(
    bounciness: Int | Double = null,
    cellSize: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    debugBodyColor: Int | Double = null,
    debugShowBody: js.UndefOr[Boolean] = js.undefined,
    debugShowVelocity: js.UndefOr[Boolean] = js.undefined,
    debugVelocityColor: Int | Double = null,
    gravity: Int | Double = null,
    gravityFactor: Int | Double = null,
    maxStep: Int | Double = null,
    maxVelocity: Int | Double = null,
    maxVelocityX: Int | Double = null,
    maxVelocityY: Int | Double = null,
    minBounceVelocity: Int | Double = null,
    setBounds: js.Object | Boolean = null,
    setBoundsDotbottom: js.UndefOr[Boolean] = js.undefined,
    setBoundsDotheight: Int | Double = null,
    setBoundsDotleft: js.UndefOr[Boolean] = js.undefined,
    setBoundsDotright: js.UndefOr[Boolean] = js.undefined,
    setBoundsDotthickness: Int | Double = null,
    setBoundsDottop: js.UndefOr[Boolean] = js.undefined,
    setBoundsDotwidth: Int | Double = null,
    setBoundsDotx: Int | Double = null,
    setBoundsDoty: Int | Double = null,
    timeScale: Int | Double = null
  ): WorldConfig = {
    val __obj = js.Dynamic.literal()
    if (bounciness != null) __obj.updateDynamic("bounciness")(bounciness.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (debugBodyColor != null) __obj.updateDynamic("debugBodyColor")(debugBodyColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBody)) __obj.updateDynamic("debugShowBody")(debugShowBody.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowVelocity)) __obj.updateDynamic("debugShowVelocity")(debugShowVelocity.asInstanceOf[js.Any])
    if (debugVelocityColor != null) __obj.updateDynamic("debugVelocityColor")(debugVelocityColor.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (gravityFactor != null) __obj.updateDynamic("gravityFactor")(gravityFactor.asInstanceOf[js.Any])
    if (maxStep != null) __obj.updateDynamic("maxStep")(maxStep.asInstanceOf[js.Any])
    if (maxVelocity != null) __obj.updateDynamic("maxVelocity")(maxVelocity.asInstanceOf[js.Any])
    if (maxVelocityX != null) __obj.updateDynamic("maxVelocityX")(maxVelocityX.asInstanceOf[js.Any])
    if (maxVelocityY != null) __obj.updateDynamic("maxVelocityY")(maxVelocityY.asInstanceOf[js.Any])
    if (minBounceVelocity != null) __obj.updateDynamic("minBounceVelocity")(minBounceVelocity.asInstanceOf[js.Any])
    if (setBounds != null) __obj.updateDynamic("setBounds")(setBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(setBoundsDotbottom)) __obj.updateDynamic("setBounds.bottom")(setBoundsDotbottom.asInstanceOf[js.Any])
    if (setBoundsDotheight != null) __obj.updateDynamic("setBounds.height")(setBoundsDotheight.asInstanceOf[js.Any])
    if (!js.isUndefined(setBoundsDotleft)) __obj.updateDynamic("setBounds.left")(setBoundsDotleft.asInstanceOf[js.Any])
    if (!js.isUndefined(setBoundsDotright)) __obj.updateDynamic("setBounds.right")(setBoundsDotright.asInstanceOf[js.Any])
    if (setBoundsDotthickness != null) __obj.updateDynamic("setBounds.thickness")(setBoundsDotthickness.asInstanceOf[js.Any])
    if (!js.isUndefined(setBoundsDottop)) __obj.updateDynamic("setBounds.top")(setBoundsDottop.asInstanceOf[js.Any])
    if (setBoundsDotwidth != null) __obj.updateDynamic("setBounds.width")(setBoundsDotwidth.asInstanceOf[js.Any])
    if (setBoundsDotx != null) __obj.updateDynamic("setBounds.x")(setBoundsDotx.asInstanceOf[js.Any])
    if (setBoundsDoty != null) __obj.updateDynamic("setBounds.y")(setBoundsDoty.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldConfig]
  }
}


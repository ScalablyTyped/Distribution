package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterWorldConfig extends js.Object {
  /**
    * Automatically call Engine.update every time the game steps.
    */
  var autoUpdate: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of constraint iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var constraintIterations: js.UndefOr[Double] = js.undefined
  /**
    * An optional Number that specifies the time correction factor to apply to the update.
    */
  var correction: js.UndefOr[Double] = js.undefined
  /**
    * Sets if Matter will render to the debug Graphic overlay. Do not enable this in production.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * The color that dynamic body debug outlines are drawn in.
    */
  var debugBodyColor: js.UndefOr[Double] = js.undefined
  /**
    * The color that dynamic body debug fills are drawn in.
    */
  var debugBodyFillColor: js.UndefOr[Double] = js.undefined
  /**
    * The color that the debug convex hulls are drawn in, if enabled.
    */
  var debugConvexHullColor: js.UndefOr[Double] = js.undefined
  /**
    * The color that the debug joints are drawn in.
    */
  var debugJointColor: js.UndefOr[Double] = js.undefined
  /**
    * Should dynamic bodies be drawn to the debug graphic?
    */
  var debugShowBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Render convex hulls to the debug.
    */
  var debugShowConvexHulls: js.UndefOr[Boolean] = js.undefined
  /**
    * Render internal edges to the debug.
    */
  var debugShowInternalEdges: js.UndefOr[Boolean] = js.undefined
  /**
    * Render joints to the debug graphic.
    */
  var debugShowJoint: js.UndefOr[Boolean] = js.undefined
  /**
    * Render sleeping bodies the debug.
    */
  var debugShowSleeping: js.UndefOr[Boolean] = js.undefined
  /**
    * Should static bodies be drawn to the debug graphic?
    */
  var debugShowStaticBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the velocity vector be drawn to the debug graphic?
    */
  var debugShowVelocity: js.UndefOr[Boolean] = js.undefined
  /**
    * The color that static body debug outlines are drawn in.
    */
  var debugStaticBodyColor: js.UndefOr[Double] = js.undefined
  /**
    * The color that the debug velocity vector lines are drawn in.
    */
  var debugVelocityColor: js.UndefOr[Double] = js.undefined
  /**
    * Render the debug output as wireframes.
    */
  var debugWireframes: js.UndefOr[Boolean] = js.undefined
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module. Sleeping can improve stability and performance, but often at the expense of accuracy.
    */
  var enableSleeping: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggles if the world is enabled or not.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * This function is called every time the core game loop steps, which is bound to the Request Animation Frame frequency unless otherwise modified.
    */
  var getDelta: js.UndefOr[js.Function] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Matter.World#gravity}.
    */
  var gravity: js.UndefOr[Vector2Like] = js.undefined
  /**
    * The number of position iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var positionIterations: js.UndefOr[Double] = js.undefined
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
    * A `Number` that specifies the global scaling factor of time for all bodies. A value of `0` freezes the simulation. A value of `0.1` gives a slow-motion effect. A value of `1.2` gives a speed-up effect.
    */
  @JSName("timing.timeScale")
  var timingDottimeScale: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that specifies the current simulation-time in milliseconds starting from `0`. It is incremented on every `Engine.update` by the given `delta` argument.
    */
  @JSName("timing.timestamp")
  var timingDottimestamp: js.UndefOr[Double] = js.undefined
  /**
    * The number of velocity iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var velocityIterations: js.UndefOr[Double] = js.undefined
}

object MatterWorldConfig {
  @scala.inline
  def apply(
    autoUpdate: js.UndefOr[Boolean] = js.undefined,
    constraintIterations: Int | Double = null,
    correction: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    debugBodyColor: Int | Double = null,
    debugBodyFillColor: Int | Double = null,
    debugConvexHullColor: Int | Double = null,
    debugJointColor: Int | Double = null,
    debugShowBody: js.UndefOr[Boolean] = js.undefined,
    debugShowConvexHulls: js.UndefOr[Boolean] = js.undefined,
    debugShowInternalEdges: js.UndefOr[Boolean] = js.undefined,
    debugShowJoint: js.UndefOr[Boolean] = js.undefined,
    debugShowSleeping: js.UndefOr[Boolean] = js.undefined,
    debugShowStaticBody: js.UndefOr[Boolean] = js.undefined,
    debugShowVelocity: js.UndefOr[Boolean] = js.undefined,
    debugStaticBodyColor: Int | Double = null,
    debugVelocityColor: Int | Double = null,
    debugWireframes: js.UndefOr[Boolean] = js.undefined,
    enableSleeping: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    getDelta: js.Function = null,
    gravity: Vector2Like = null,
    positionIterations: Int | Double = null,
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
    timingDottimeScale: Int | Double = null,
    timingDottimestamp: Int | Double = null,
    velocityIterations: Int | Double = null
  ): MatterWorldConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpdate)) __obj.updateDynamic("autoUpdate")(autoUpdate.asInstanceOf[js.Any])
    if (constraintIterations != null) __obj.updateDynamic("constraintIterations")(constraintIterations.asInstanceOf[js.Any])
    if (correction != null) __obj.updateDynamic("correction")(correction.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (debugBodyColor != null) __obj.updateDynamic("debugBodyColor")(debugBodyColor.asInstanceOf[js.Any])
    if (debugBodyFillColor != null) __obj.updateDynamic("debugBodyFillColor")(debugBodyFillColor.asInstanceOf[js.Any])
    if (debugConvexHullColor != null) __obj.updateDynamic("debugConvexHullColor")(debugConvexHullColor.asInstanceOf[js.Any])
    if (debugJointColor != null) __obj.updateDynamic("debugJointColor")(debugJointColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBody)) __obj.updateDynamic("debugShowBody")(debugShowBody.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowConvexHulls)) __obj.updateDynamic("debugShowConvexHulls")(debugShowConvexHulls.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowInternalEdges)) __obj.updateDynamic("debugShowInternalEdges")(debugShowInternalEdges.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowJoint)) __obj.updateDynamic("debugShowJoint")(debugShowJoint.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowSleeping)) __obj.updateDynamic("debugShowSleeping")(debugShowSleeping.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowStaticBody)) __obj.updateDynamic("debugShowStaticBody")(debugShowStaticBody.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowVelocity)) __obj.updateDynamic("debugShowVelocity")(debugShowVelocity.asInstanceOf[js.Any])
    if (debugStaticBodyColor != null) __obj.updateDynamic("debugStaticBodyColor")(debugStaticBodyColor.asInstanceOf[js.Any])
    if (debugVelocityColor != null) __obj.updateDynamic("debugVelocityColor")(debugVelocityColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWireframes)) __obj.updateDynamic("debugWireframes")(debugWireframes.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSleeping)) __obj.updateDynamic("enableSleeping")(enableSleeping.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (getDelta != null) __obj.updateDynamic("getDelta")(getDelta.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (positionIterations != null) __obj.updateDynamic("positionIterations")(positionIterations.asInstanceOf[js.Any])
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
    if (timingDottimeScale != null) __obj.updateDynamic("timing.timeScale")(timingDottimeScale.asInstanceOf[js.Any])
    if (timingDottimestamp != null) __obj.updateDynamic("timing.timestamp")(timingDottimestamp.asInstanceOf[js.Any])
    if (velocityIterations != null) __obj.updateDynamic("velocityIterations")(velocityIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterWorldConfig]
  }
}


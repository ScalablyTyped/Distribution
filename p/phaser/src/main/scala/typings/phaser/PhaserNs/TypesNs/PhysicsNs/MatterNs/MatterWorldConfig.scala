package typings.phaser.PhaserNs.TypesNs.PhysicsNs.MatterNs

import typings.phaser.PhaserNs.TypesNs.MathNs.Vector2Like
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
  var `setBounds.bottom`: js.UndefOr[Boolean] = js.undefined
  /**
    * The height of the world bounds.
    */
  var `setBounds.height`: js.UndefOr[Double] = js.undefined
  /**
    * Should the left-side world bounds wall be created?
    */
  var `setBounds.left`: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the right-side world bounds wall be created?
    */
  var `setBounds.right`: js.UndefOr[Boolean] = js.undefined
  /**
    * The thickness of the walls of the world bounds.
    */
  var `setBounds.thickness`: js.UndefOr[Double] = js.undefined
  /**
    * Should the top world bounds wall be created?
    */
  var `setBounds.top`: js.UndefOr[Boolean] = js.undefined
  /**
    * The width of the world bounds.
    */
  var `setBounds.width`: js.UndefOr[Double] = js.undefined
  /**
    * The x coordinate of the world bounds.
    */
  var `setBounds.x`: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the world bounds.
    */
  var `setBounds.y`: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that specifies the global scaling factor of time for all bodies. A value of `0` freezes the simulation. A value of `0.1` gives a slow-motion effect. A value of `1.2` gives a speed-up effect.
    */
  var `timing.timeScale`: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that specifies the current simulation-time in milliseconds starting from `0`. It is incremented on every `Engine.update` by the given `delta` argument.
    */
  var `timing.timestamp`: js.UndefOr[Double] = js.undefined
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
    `setBounds.bottom`: js.UndefOr[Boolean] = js.undefined,
    `setBounds.height`: Int | Double = null,
    `setBounds.left`: js.UndefOr[Boolean] = js.undefined,
    `setBounds.right`: js.UndefOr[Boolean] = js.undefined,
    `setBounds.thickness`: Int | Double = null,
    `setBounds.top`: js.UndefOr[Boolean] = js.undefined,
    `setBounds.width`: Int | Double = null,
    `setBounds.x`: Int | Double = null,
    `setBounds.y`: Int | Double = null,
    `timing.timeScale`: Int | Double = null,
    `timing.timestamp`: Int | Double = null,
    velocityIterations: Int | Double = null
  ): MatterWorldConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpdate)) __obj.updateDynamic("autoUpdate")(autoUpdate)
    if (constraintIterations != null) __obj.updateDynamic("constraintIterations")(constraintIterations.asInstanceOf[js.Any])
    if (correction != null) __obj.updateDynamic("correction")(correction.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (debugBodyColor != null) __obj.updateDynamic("debugBodyColor")(debugBodyColor.asInstanceOf[js.Any])
    if (debugBodyFillColor != null) __obj.updateDynamic("debugBodyFillColor")(debugBodyFillColor.asInstanceOf[js.Any])
    if (debugConvexHullColor != null) __obj.updateDynamic("debugConvexHullColor")(debugConvexHullColor.asInstanceOf[js.Any])
    if (debugJointColor != null) __obj.updateDynamic("debugJointColor")(debugJointColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBody)) __obj.updateDynamic("debugShowBody")(debugShowBody)
    if (!js.isUndefined(debugShowConvexHulls)) __obj.updateDynamic("debugShowConvexHulls")(debugShowConvexHulls)
    if (!js.isUndefined(debugShowInternalEdges)) __obj.updateDynamic("debugShowInternalEdges")(debugShowInternalEdges)
    if (!js.isUndefined(debugShowJoint)) __obj.updateDynamic("debugShowJoint")(debugShowJoint)
    if (!js.isUndefined(debugShowSleeping)) __obj.updateDynamic("debugShowSleeping")(debugShowSleeping)
    if (!js.isUndefined(debugShowStaticBody)) __obj.updateDynamic("debugShowStaticBody")(debugShowStaticBody)
    if (!js.isUndefined(debugShowVelocity)) __obj.updateDynamic("debugShowVelocity")(debugShowVelocity)
    if (debugStaticBodyColor != null) __obj.updateDynamic("debugStaticBodyColor")(debugStaticBodyColor.asInstanceOf[js.Any])
    if (debugVelocityColor != null) __obj.updateDynamic("debugVelocityColor")(debugVelocityColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugWireframes)) __obj.updateDynamic("debugWireframes")(debugWireframes)
    if (!js.isUndefined(enableSleeping)) __obj.updateDynamic("enableSleeping")(enableSleeping)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (getDelta != null) __obj.updateDynamic("getDelta")(getDelta)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (positionIterations != null) __obj.updateDynamic("positionIterations")(positionIterations.asInstanceOf[js.Any])
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
    if (`timing.timeScale` != null) __obj.updateDynamic("timing.timeScale")(`timing.timeScale`.asInstanceOf[js.Any])
    if (`timing.timestamp` != null) __obj.updateDynamic("timing.timestamp")(`timing.timestamp`.asInstanceOf[js.Any])
    if (velocityIterations != null) __obj.updateDynamic("velocityIterations")(velocityIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterWorldConfig]
  }
}


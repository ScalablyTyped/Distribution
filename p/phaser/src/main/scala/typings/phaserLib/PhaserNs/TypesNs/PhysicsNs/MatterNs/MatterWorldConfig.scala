package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterWorldConfig extends js.Object {
  /**
    * Automatically call Engine.update every time the game steps.
    */
  var autoUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of constraint iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var constraintIterations: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional Number that specifies the time correction factor to apply to the update.
    */
  var correction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets if Matter will render to the debug Graphic overlay. Do not enable this in production.
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color that dynamic body debug outlines are drawn in.
    */
  var debugBodyColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color that dynamic body debug fills are drawn in.
    */
  var debugBodyFillColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color that the debug convex hulls are drawn in, if enabled.
    */
  var debugConvexHullColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color that the debug joints are drawn in.
    */
  var debugJointColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should dynamic bodies be drawn to the debug graphic?
    */
  var debugShowBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render convex hulls to the debug.
    */
  var debugShowConvexHulls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render internal edges to the debug.
    */
  var debugShowInternalEdges: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render joints to the debug graphic.
    */
  var debugShowJoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Render sleeping bodies the debug.
    */
  var debugShowSleeping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should static bodies be drawn to the debug graphic?
    */
  var debugShowStaticBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should the velocity vector be drawn to the debug graphic?
    */
  var debugShowVelocity: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color that static body debug outlines are drawn in.
    */
  var debugStaticBodyColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color that the debug velocity vector lines are drawn in.
    */
  var debugVelocityColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Render the debug output as wireframes.
    */
  var debugWireframes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module. Sleeping can improve stability and performance, but often at the expense of accuracy.
    */
  var enableSleeping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Toggles if the world is enabled or not.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This function is called every time the core game loop steps, which is bound to the Request Animation Frame frequency unless otherwise modified.
    */
  var getDelta: js.UndefOr[js.Function] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Matter.World#gravity}.
    */
  var gravity: js.UndefOr[phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like] = js.undefined
  /**
    * The number of position iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var positionIterations: js.UndefOr[scala.Double] = js.undefined
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
    * A `Number` that specifies the global scaling factor of time for all bodies. A value of `0` freezes the simulation. A value of `0.1` gives a slow-motion effect. A value of `1.2` gives a speed-up effect.
    */
  var `timing.timeScale`: js.UndefOr[scala.Double] = js.undefined
  /**
    * A `Number` that specifies the current simulation-time in milliseconds starting from `0`. It is incremented on every `Engine.update` by the given `delta` argument.
    */
  var `timing.timestamp`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of velocity iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var velocityIterations: js.UndefOr[scala.Double] = js.undefined
}

object MatterWorldConfig {
  @scala.inline
  def apply(
    autoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    constraintIterations: scala.Int | scala.Double = null,
    correction: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    debugBodyColor: scala.Int | scala.Double = null,
    debugBodyFillColor: scala.Int | scala.Double = null,
    debugConvexHullColor: scala.Int | scala.Double = null,
    debugJointColor: scala.Int | scala.Double = null,
    debugShowBody: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowConvexHulls: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowInternalEdges: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowJoint: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowSleeping: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowStaticBody: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowVelocity: js.UndefOr[scala.Boolean] = js.undefined,
    debugStaticBodyColor: scala.Int | scala.Double = null,
    debugVelocityColor: scala.Int | scala.Double = null,
    debugWireframes: js.UndefOr[scala.Boolean] = js.undefined,
    enableSleeping: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    getDelta: js.Function = null,
    gravity: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = null,
    positionIterations: scala.Int | scala.Double = null,
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
    `timing.timeScale`: scala.Int | scala.Double = null,
    `timing.timestamp`: scala.Int | scala.Double = null,
    velocityIterations: scala.Int | scala.Double = null
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


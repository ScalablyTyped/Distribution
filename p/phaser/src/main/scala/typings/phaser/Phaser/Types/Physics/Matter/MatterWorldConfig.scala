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
    * Controls the Matter Debug Rendering options. If a boolean it will use the default values, otherwise, specify a Debug Config object.
    */
  var debug: js.UndefOr[Boolean | MatterDebugConfig] = js.undefined
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module. Sleeping can improve stability and performance, but often at the expense of accuracy.
    */
  var enableSleeping: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggles if the world is enabled or not.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the Resolver friction normal multiplier property.
    */
  var frictionNormalMultiplier: js.UndefOr[Double] = js.undefined
  /**
    * This function is called every time the core game loop steps, which is bound to the Request Animation Frame frequency unless otherwise modified.
    */
  var getDelta: js.UndefOr[js.Function] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Matter.World#gravity}. If `false` Gravity will be set to zero.
    */
  var gravity: js.UndefOr[Vector2Like | Boolean] = js.undefined
  /**
    * Should the Matter Attractor Plugin be enabled? An attractors plugin that makes it easy to apply continual forces on bodies. It's possible to simulate effects such as wind, gravity and magnetism.
    */
  @JSName("plugins.attractors")
  var pluginsDotattractors: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the Matter Collision Events Plugin be enabled?
    */
  @JSName("plugins.collisionevents")
  var pluginsDotcollisionevents: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the Matter Wrap Plugin be enabled? A coordinate wrapping plugin that automatically wraps the position of bodies such that they always stay within the given bounds. Upon crossing a boundary the body will appear on the opposite side of the bounds, while maintaining its velocity.
    */
  @JSName("plugins.wrap")
  var pluginsDotwrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the Resolver position dampen property.
    */
  var positionDampen: js.UndefOr[Double] = js.undefined
  /**
    * The number of position iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var positionIterations: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Resolver position warming property.
    */
  var positionWarming: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Resolver resting threshold property.
    */
  var restingThresh: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Resolver resting threshold tangent property.
    */
  var restingThreshTangent: js.UndefOr[Double] = js.undefined
  /**
    * Sets the Matter Runner options.
    */
  var runner: js.UndefOr[MatterRunnerConfig] = js.undefined
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
    debug: Boolean | MatterDebugConfig = null,
    enableSleeping: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    frictionNormalMultiplier: Int | Double = null,
    getDelta: js.Function = null,
    gravity: Vector2Like | Boolean = null,
    pluginsDotattractors: js.UndefOr[Boolean] = js.undefined,
    pluginsDotcollisionevents: js.UndefOr[Boolean] = js.undefined,
    pluginsDotwrap: js.UndefOr[Boolean] = js.undefined,
    positionDampen: Int | Double = null,
    positionIterations: Int | Double = null,
    positionWarming: Int | Double = null,
    restingThresh: Int | Double = null,
    restingThreshTangent: Int | Double = null,
    runner: MatterRunnerConfig = null,
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
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSleeping)) __obj.updateDynamic("enableSleeping")(enableSleeping.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (frictionNormalMultiplier != null) __obj.updateDynamic("frictionNormalMultiplier")(frictionNormalMultiplier.asInstanceOf[js.Any])
    if (getDelta != null) __obj.updateDynamic("getDelta")(getDelta.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (!js.isUndefined(pluginsDotattractors)) __obj.updateDynamic("plugins.attractors")(pluginsDotattractors.asInstanceOf[js.Any])
    if (!js.isUndefined(pluginsDotcollisionevents)) __obj.updateDynamic("plugins.collisionevents")(pluginsDotcollisionevents.asInstanceOf[js.Any])
    if (!js.isUndefined(pluginsDotwrap)) __obj.updateDynamic("plugins.wrap")(pluginsDotwrap.asInstanceOf[js.Any])
    if (positionDampen != null) __obj.updateDynamic("positionDampen")(positionDampen.asInstanceOf[js.Any])
    if (positionIterations != null) __obj.updateDynamic("positionIterations")(positionIterations.asInstanceOf[js.Any])
    if (positionWarming != null) __obj.updateDynamic("positionWarming")(positionWarming.asInstanceOf[js.Any])
    if (restingThresh != null) __obj.updateDynamic("restingThresh")(restingThresh.asInstanceOf[js.Any])
    if (restingThreshTangent != null) __obj.updateDynamic("restingThreshTangent")(restingThreshTangent.asInstanceOf[js.Any])
    if (runner != null) __obj.updateDynamic("runner")(runner.asInstanceOf[js.Any])
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


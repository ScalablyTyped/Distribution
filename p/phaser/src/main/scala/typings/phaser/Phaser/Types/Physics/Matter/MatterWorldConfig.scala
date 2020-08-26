package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterWorldConfig extends js.Object {
  /**
    * Automatically call Engine.update every time the game steps.
    */
  var autoUpdate: js.UndefOr[Boolean] = js.native
  /**
    * The number of constraint iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var constraintIterations: js.UndefOr[Double] = js.native
  /**
    * An optional Number that specifies the time correction factor to apply to the update.
    */
  var correction: js.UndefOr[Double] = js.native
  /**
    * Controls the Matter Debug Rendering options. If a boolean it will use the default values, otherwise, specify a Debug Config object.
    */
  var debug: js.UndefOr[Boolean | MatterDebugConfig] = js.native
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module. Sleeping can improve stability and performance, but often at the expense of accuracy.
    */
  var enableSleeping: js.UndefOr[Boolean] = js.native
  /**
    * Toggles if the world is enabled or not.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Sets the Resolver friction normal multiplier property.
    */
  var frictionNormalMultiplier: js.UndefOr[Double] = js.native
  /**
    * This function is called every time the core game loop steps, which is bound to the Request Animation Frame frequency unless otherwise modified.
    */
  var getDelta: js.UndefOr[js.Function] = js.native
  /**
    * Sets {@link Phaser.Physics.Matter.World#gravity}. If `false` Gravity will be set to zero.
    */
  var gravity: js.UndefOr[Vector2Like | Boolean] = js.native
  /**
    * Should the Matter Attractor Plugin be enabled? An attractors plugin that makes it easy to apply continual forces on bodies. It's possible to simulate effects such as wind, gravity and magnetism.
    */
  @JSName("plugins.attractors")
  var pluginsDotattractors: js.UndefOr[Boolean] = js.native
  /**
    * Should the Matter Collision Events Plugin be enabled?
    */
  @JSName("plugins.collisionevents")
  var pluginsDotcollisionevents: js.UndefOr[Boolean] = js.native
  /**
    * Should the Matter Wrap Plugin be enabled? A coordinate wrapping plugin that automatically wraps the position of bodies such that they always stay within the given bounds. Upon crossing a boundary the body will appear on the opposite side of the bounds, while maintaining its velocity.
    */
  @JSName("plugins.wrap")
  var pluginsDotwrap: js.UndefOr[Boolean] = js.native
  /**
    * Sets the Resolver position dampen property.
    */
  var positionDampen: js.UndefOr[Double] = js.native
  /**
    * The number of position iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var positionIterations: js.UndefOr[Double] = js.native
  /**
    * Sets the Resolver position warming property.
    */
  var positionWarming: js.UndefOr[Double] = js.native
  /**
    * Sets the Resolver resting threshold property.
    */
  var restingThresh: js.UndefOr[Double] = js.native
  /**
    * Sets the Resolver resting threshold tangent property.
    */
  var restingThreshTangent: js.UndefOr[Double] = js.native
  /**
    * Sets the Matter Runner options.
    */
  var runner: js.UndefOr[MatterRunnerConfig] = js.native
  /**
    * Should the world have bounds enabled by default?
    */
  var setBounds: js.UndefOr[js.Object | Boolean] = js.native
  /**
    * Should the bottom world bounds wall be created?
    */
  @JSName("setBounds.bottom")
  var setBoundsDotbottom: js.UndefOr[Boolean] = js.native
  /**
    * The height of the world bounds.
    */
  @JSName("setBounds.height")
  var setBoundsDotheight: js.UndefOr[Double] = js.native
  /**
    * Should the left-side world bounds wall be created?
    */
  @JSName("setBounds.left")
  var setBoundsDotleft: js.UndefOr[Boolean] = js.native
  /**
    * Should the right-side world bounds wall be created?
    */
  @JSName("setBounds.right")
  var setBoundsDotright: js.UndefOr[Boolean] = js.native
  /**
    * The thickness of the walls of the world bounds.
    */
  @JSName("setBounds.thickness")
  var setBoundsDotthickness: js.UndefOr[Double] = js.native
  /**
    * Should the top world bounds wall be created?
    */
  @JSName("setBounds.top")
  var setBoundsDottop: js.UndefOr[Boolean] = js.native
  /**
    * The width of the world bounds.
    */
  @JSName("setBounds.width")
  var setBoundsDotwidth: js.UndefOr[Double] = js.native
  /**
    * The x coordinate of the world bounds.
    */
  @JSName("setBounds.x")
  var setBoundsDotx: js.UndefOr[Double] = js.native
  /**
    * The y coordinate of the world bounds.
    */
  @JSName("setBounds.y")
  var setBoundsDoty: js.UndefOr[Double] = js.native
  /**
    * A `Number` that specifies the global scaling factor of time for all bodies. A value of `0` freezes the simulation. A value of `0.1` gives a slow-motion effect. A value of `1.2` gives a speed-up effect.
    */
  @JSName("timing.timeScale")
  var timingDottimeScale: js.UndefOr[Double] = js.native
  /**
    * A `Number` that specifies the current simulation-time in milliseconds starting from `0`. It is incremented on every `Engine.update` by the given `delta` argument.
    */
  @JSName("timing.timestamp")
  var timingDottimestamp: js.UndefOr[Double] = js.native
  /**
    * The number of velocity iterations to perform each update. The higher the value, the higher quality the simulation will be at the expense of performance.
    */
  var velocityIterations: js.UndefOr[Double] = js.native
}

object MatterWorldConfig {
  @scala.inline
  def apply(): MatterWorldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterWorldConfig]
  }
  @scala.inline
  implicit class MatterWorldConfigOps[Self <: MatterWorldConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoUpdate(value: Boolean): Self = this.set("autoUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpdate: Self = this.set("autoUpdate", js.undefined)
    @scala.inline
    def setConstraintIterations(value: Double): Self = this.set("constraintIterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraintIterations: Self = this.set("constraintIterations", js.undefined)
    @scala.inline
    def setCorrection(value: Double): Self = this.set("correction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrection: Self = this.set("correction", js.undefined)
    @scala.inline
    def setDebug(value: Boolean | MatterDebugConfig): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEnableSleeping(value: Boolean): Self = this.set("enableSleeping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSleeping: Self = this.set("enableSleeping", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFrictionNormalMultiplier(value: Double): Self = this.set("frictionNormalMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrictionNormalMultiplier: Self = this.set("frictionNormalMultiplier", js.undefined)
    @scala.inline
    def setGetDelta(value: js.Function): Self = this.set("getDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetDelta: Self = this.set("getDelta", js.undefined)
    @scala.inline
    def setGravity(value: Vector2Like | Boolean): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setPluginsDotattractors(value: Boolean): Self = this.set("plugins.attractors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginsDotattractors: Self = this.set("plugins.attractors", js.undefined)
    @scala.inline
    def setPluginsDotcollisionevents(value: Boolean): Self = this.set("plugins.collisionevents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginsDotcollisionevents: Self = this.set("plugins.collisionevents", js.undefined)
    @scala.inline
    def setPluginsDotwrap(value: Boolean): Self = this.set("plugins.wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginsDotwrap: Self = this.set("plugins.wrap", js.undefined)
    @scala.inline
    def setPositionDampen(value: Double): Self = this.set("positionDampen", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionDampen: Self = this.set("positionDampen", js.undefined)
    @scala.inline
    def setPositionIterations(value: Double): Self = this.set("positionIterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionIterations: Self = this.set("positionIterations", js.undefined)
    @scala.inline
    def setPositionWarming(value: Double): Self = this.set("positionWarming", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionWarming: Self = this.set("positionWarming", js.undefined)
    @scala.inline
    def setRestingThresh(value: Double): Self = this.set("restingThresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestingThresh: Self = this.set("restingThresh", js.undefined)
    @scala.inline
    def setRestingThreshTangent(value: Double): Self = this.set("restingThreshTangent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestingThreshTangent: Self = this.set("restingThreshTangent", js.undefined)
    @scala.inline
    def setRunner(value: MatterRunnerConfig): Self = this.set("runner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunner: Self = this.set("runner", js.undefined)
    @scala.inline
    def setSetBounds(value: js.Object | Boolean): Self = this.set("setBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBounds: Self = this.set("setBounds", js.undefined)
    @scala.inline
    def setSetBoundsDotbottom(value: Boolean): Self = this.set("setBounds.bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDotbottom: Self = this.set("setBounds.bottom", js.undefined)
    @scala.inline
    def setSetBoundsDotheight(value: Double): Self = this.set("setBounds.height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDotheight: Self = this.set("setBounds.height", js.undefined)
    @scala.inline
    def setSetBoundsDotleft(value: Boolean): Self = this.set("setBounds.left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDotleft: Self = this.set("setBounds.left", js.undefined)
    @scala.inline
    def setSetBoundsDotright(value: Boolean): Self = this.set("setBounds.right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDotright: Self = this.set("setBounds.right", js.undefined)
    @scala.inline
    def setSetBoundsDotthickness(value: Double): Self = this.set("setBounds.thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDotthickness: Self = this.set("setBounds.thickness", js.undefined)
    @scala.inline
    def setSetBoundsDottop(value: Boolean): Self = this.set("setBounds.top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDottop: Self = this.set("setBounds.top", js.undefined)
    @scala.inline
    def setSetBoundsDotwidth(value: Double): Self = this.set("setBounds.width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDotwidth: Self = this.set("setBounds.width", js.undefined)
    @scala.inline
    def setSetBoundsDotx(value: Double): Self = this.set("setBounds.x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDotx: Self = this.set("setBounds.x", js.undefined)
    @scala.inline
    def setSetBoundsDoty(value: Double): Self = this.set("setBounds.y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBoundsDoty: Self = this.set("setBounds.y", js.undefined)
    @scala.inline
    def setTimingDottimeScale(value: Double): Self = this.set("timing.timeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingDottimeScale: Self = this.set("timing.timeScale", js.undefined)
    @scala.inline
    def setTimingDottimestamp(value: Double): Self = this.set("timing.timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingDottimestamp: Self = this.set("timing.timestamp", js.undefined)
    @scala.inline
    def setVelocityIterations(value: Double): Self = this.set("velocityIterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocityIterations: Self = this.set("velocityIterations", js.undefined)
  }
  
}


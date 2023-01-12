package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterWorldConfig extends StObject {
  
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
  
  inline def apply(): MatterWorldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterWorldConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterWorldConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
    
    inline def setConstraintIterations(value: Double): Self = StObject.set(x, "constraintIterations", value.asInstanceOf[js.Any])
    
    inline def setConstraintIterationsUndefined: Self = StObject.set(x, "constraintIterations", js.undefined)
    
    inline def setCorrection(value: Double): Self = StObject.set(x, "correction", value.asInstanceOf[js.Any])
    
    inline def setCorrectionUndefined: Self = StObject.set(x, "correction", js.undefined)
    
    inline def setDebug(value: Boolean | MatterDebugConfig): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setEnableSleeping(value: Boolean): Self = StObject.set(x, "enableSleeping", value.asInstanceOf[js.Any])
    
    inline def setEnableSleepingUndefined: Self = StObject.set(x, "enableSleeping", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFrictionNormalMultiplier(value: Double): Self = StObject.set(x, "frictionNormalMultiplier", value.asInstanceOf[js.Any])
    
    inline def setFrictionNormalMultiplierUndefined: Self = StObject.set(x, "frictionNormalMultiplier", js.undefined)
    
    inline def setGetDelta(value: js.Function): Self = StObject.set(x, "getDelta", value.asInstanceOf[js.Any])
    
    inline def setGetDeltaUndefined: Self = StObject.set(x, "getDelta", js.undefined)
    
    inline def setGravity(value: Vector2Like | Boolean): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setPluginsDotattractors(value: Boolean): Self = StObject.set(x, "plugins.attractors", value.asInstanceOf[js.Any])
    
    inline def setPluginsDotattractorsUndefined: Self = StObject.set(x, "plugins.attractors", js.undefined)
    
    inline def setPluginsDotcollisionevents(value: Boolean): Self = StObject.set(x, "plugins.collisionevents", value.asInstanceOf[js.Any])
    
    inline def setPluginsDotcollisioneventsUndefined: Self = StObject.set(x, "plugins.collisionevents", js.undefined)
    
    inline def setPluginsDotwrap(value: Boolean): Self = StObject.set(x, "plugins.wrap", value.asInstanceOf[js.Any])
    
    inline def setPluginsDotwrapUndefined: Self = StObject.set(x, "plugins.wrap", js.undefined)
    
    inline def setPositionDampen(value: Double): Self = StObject.set(x, "positionDampen", value.asInstanceOf[js.Any])
    
    inline def setPositionDampenUndefined: Self = StObject.set(x, "positionDampen", js.undefined)
    
    inline def setPositionIterations(value: Double): Self = StObject.set(x, "positionIterations", value.asInstanceOf[js.Any])
    
    inline def setPositionIterationsUndefined: Self = StObject.set(x, "positionIterations", js.undefined)
    
    inline def setPositionWarming(value: Double): Self = StObject.set(x, "positionWarming", value.asInstanceOf[js.Any])
    
    inline def setPositionWarmingUndefined: Self = StObject.set(x, "positionWarming", js.undefined)
    
    inline def setRestingThresh(value: Double): Self = StObject.set(x, "restingThresh", value.asInstanceOf[js.Any])
    
    inline def setRestingThreshTangent(value: Double): Self = StObject.set(x, "restingThreshTangent", value.asInstanceOf[js.Any])
    
    inline def setRestingThreshTangentUndefined: Self = StObject.set(x, "restingThreshTangent", js.undefined)
    
    inline def setRestingThreshUndefined: Self = StObject.set(x, "restingThresh", js.undefined)
    
    inline def setRunner(value: MatterRunnerConfig): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    
    inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
    
    inline def setSetBounds(value: js.Object | Boolean): Self = StObject.set(x, "setBounds", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotbottom(value: Boolean): Self = StObject.set(x, "setBounds.bottom", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotbottomUndefined: Self = StObject.set(x, "setBounds.bottom", js.undefined)
    
    inline def setSetBoundsDotheight(value: Double): Self = StObject.set(x, "setBounds.height", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotheightUndefined: Self = StObject.set(x, "setBounds.height", js.undefined)
    
    inline def setSetBoundsDotleft(value: Boolean): Self = StObject.set(x, "setBounds.left", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotleftUndefined: Self = StObject.set(x, "setBounds.left", js.undefined)
    
    inline def setSetBoundsDotright(value: Boolean): Self = StObject.set(x, "setBounds.right", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotrightUndefined: Self = StObject.set(x, "setBounds.right", js.undefined)
    
    inline def setSetBoundsDotthickness(value: Double): Self = StObject.set(x, "setBounds.thickness", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotthicknessUndefined: Self = StObject.set(x, "setBounds.thickness", js.undefined)
    
    inline def setSetBoundsDottop(value: Boolean): Self = StObject.set(x, "setBounds.top", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDottopUndefined: Self = StObject.set(x, "setBounds.top", js.undefined)
    
    inline def setSetBoundsDotwidth(value: Double): Self = StObject.set(x, "setBounds.width", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotwidthUndefined: Self = StObject.set(x, "setBounds.width", js.undefined)
    
    inline def setSetBoundsDotx(value: Double): Self = StObject.set(x, "setBounds.x", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotxUndefined: Self = StObject.set(x, "setBounds.x", js.undefined)
    
    inline def setSetBoundsDoty(value: Double): Self = StObject.set(x, "setBounds.y", value.asInstanceOf[js.Any])
    
    inline def setSetBoundsDotyUndefined: Self = StObject.set(x, "setBounds.y", js.undefined)
    
    inline def setSetBoundsUndefined: Self = StObject.set(x, "setBounds", js.undefined)
    
    inline def setTimingDottimeScale(value: Double): Self = StObject.set(x, "timing.timeScale", value.asInstanceOf[js.Any])
    
    inline def setTimingDottimeScaleUndefined: Self = StObject.set(x, "timing.timeScale", js.undefined)
    
    inline def setTimingDottimestamp(value: Double): Self = StObject.set(x, "timing.timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimingDottimestampUndefined: Self = StObject.set(x, "timing.timestamp", js.undefined)
    
    inline def setVelocityIterations(value: Double): Self = StObject.set(x, "velocityIterations", value.asInstanceOf[js.Any])
    
    inline def setVelocityIterationsUndefined: Self = StObject.set(x, "velocityIterations", js.undefined)
  }
}

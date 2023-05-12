package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSConfig extends StObject {
  
  /**
    * Calculate the average frame delta from this many consecutive frame intervals.
    */
  var deltaHistory: js.UndefOr[Double] = js.undefined
  
  /**
    * Use setTimeout instead of requestAnimationFrame to run the game loop.
    */
  var forceSetTimeOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enforces an fps rate limit that the game step will run at, regardless of browser frequency. 0 means 'no limit'. Never set this higher than RAF can handle.
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum acceptable rendering rate, in frames per second.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of frames the time step counts before we trust the delta values again.
    */
  var panicMax: js.UndefOr[Double] = js.undefined
  
  /**
    * Apply delta smoothing during the game update to help avoid spikes?
    */
  var smoothStep: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The optimum rendering rate, in frames per second. This does not enforce the fps rate, it merely tells Phaser what rate is considered optimal for this game.
    */
  var target: js.UndefOr[Double] = js.undefined
}
object FPSConfig {
  
  inline def apply(): FPSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FPSConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FPSConfig] (val x: Self) extends AnyVal {
    
    inline def setDeltaHistory(value: Double): Self = StObject.set(x, "deltaHistory", value.asInstanceOf[js.Any])
    
    inline def setDeltaHistoryUndefined: Self = StObject.set(x, "deltaHistory", js.undefined)
    
    inline def setForceSetTimeOut(value: Boolean): Self = StObject.set(x, "forceSetTimeOut", value.asInstanceOf[js.Any])
    
    inline def setForceSetTimeOutUndefined: Self = StObject.set(x, "forceSetTimeOut", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPanicMax(value: Double): Self = StObject.set(x, "panicMax", value.asInstanceOf[js.Any])
    
    inline def setPanicMaxUndefined: Self = StObject.set(x, "panicMax", js.undefined)
    
    inline def setSmoothStep(value: Boolean): Self = StObject.set(x, "smoothStep", value.asInstanceOf[js.Any])
    
    inline def setSmoothStepUndefined: Self = StObject.set(x, "smoothStep", js.undefined)
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}

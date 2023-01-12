package typings.phaser.Phaser.Types.Physics.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterRunnerConfig extends StObject {
  
  /**
    * A number that specifies the time correction factor to apply to the update. This can help improve the accuracy of the simulation in cases where delta is changing between updates.
    */
  var correction: js.UndefOr[Double] = js.undefined
  
  /**
    * A number that specifies the time step between updates in milliseconds. If you set the `fps` property, this value is set based on that. If `isFixed` is set to `true`, then `delta` is fixed. If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    */
  var delta: js.UndefOr[Double] = js.undefined
  
  /**
    * A number that specifies the maximum time step between updates in milliseconds.
    */
  var deltaMax: js.UndefOr[Double] = js.undefined
  
  /**
    * A number that specifies the minimum time step between updates in milliseconds.
    */
  var deltaMin: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the delta smoothing array when `isFixed` is `false`.
    */
  var deltaSampleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A number that specifies the frame rate in seconds. If you don't specify this, but do specify `delta`, those values set the fps rate.
    */
  var fps: js.UndefOr[Double] = js.undefined
  
  /**
    * A boolean that specifies if the runner should use a fixed timestep (otherwise it is variable). If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic). If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    */
  var isFixed: js.UndefOr[Boolean] = js.undefined
}
object MatterRunnerConfig {
  
  inline def apply(): MatterRunnerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterRunnerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterRunnerConfig] (val x: Self) extends AnyVal {
    
    inline def setCorrection(value: Double): Self = StObject.set(x, "correction", value.asInstanceOf[js.Any])
    
    inline def setCorrectionUndefined: Self = StObject.set(x, "correction", js.undefined)
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaMax(value: Double): Self = StObject.set(x, "deltaMax", value.asInstanceOf[js.Any])
    
    inline def setDeltaMaxUndefined: Self = StObject.set(x, "deltaMax", js.undefined)
    
    inline def setDeltaMin(value: Double): Self = StObject.set(x, "deltaMin", value.asInstanceOf[js.Any])
    
    inline def setDeltaMinUndefined: Self = StObject.set(x, "deltaMin", js.undefined)
    
    inline def setDeltaSampleSize(value: Double): Self = StObject.set(x, "deltaSampleSize", value.asInstanceOf[js.Any])
    
    inline def setDeltaSampleSizeUndefined: Self = StObject.set(x, "deltaSampleSize", js.undefined)
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
  }
}

package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FPSConfig extends StObject {
  
  /**
    * Calculate the average frame delta from this many consecutive frame intervals.
    */
  var deltaHistory: js.UndefOr[integer] = js.native
  
  /**
    * Use setTimeout instead of requestAnimationFrame to run the game loop.
    */
  var forceSetTimeOut: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum acceptable rendering rate, in frames per second.
    */
  var min: js.UndefOr[integer] = js.native
  
  /**
    * The amount of frames the time step counts before we trust the delta values again.
    */
  var panicMax: js.UndefOr[integer] = js.native
  
  /**
    * Apply delta smoothing during the game update to help avoid spikes?
    */
  var smoothStep: js.UndefOr[Boolean] = js.native
  
  /**
    * The optimum rendering rate, in frames per second.
    */
  var target: js.UndefOr[integer] = js.native
}
object FPSConfig {
  
  @scala.inline
  def apply(): FPSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FPSConfig]
  }
  
  @scala.inline
  implicit class FPSConfigMutableBuilder[Self <: FPSConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaHistory(value: integer): Self = StObject.set(x, "deltaHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaHistoryUndefined: Self = StObject.set(x, "deltaHistory", js.undefined)
    
    @scala.inline
    def setForceSetTimeOut(value: Boolean): Self = StObject.set(x, "forceSetTimeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSetTimeOutUndefined: Self = StObject.set(x, "forceSetTimeOut", js.undefined)
    
    @scala.inline
    def setMin(value: integer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPanicMax(value: integer): Self = StObject.set(x, "panicMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanicMaxUndefined: Self = StObject.set(x, "panicMax", js.undefined)
    
    @scala.inline
    def setSmoothStep(value: Boolean): Self = StObject.set(x, "smoothStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothStepUndefined: Self = StObject.set(x, "smoothStep", js.undefined)
    
    @scala.inline
    def setTarget(value: integer): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}

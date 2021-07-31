package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GravityWellConfig extends StObject {
  
  /**
    * The minimum distance for which the gravity force is calculated.
    */
  var epsilon: js.UndefOr[Double] = js.undefined
  
  /**
    * The gravitational force of this Gravity Well.
    */
  var gravity: js.UndefOr[Double] = js.undefined
  
  /**
    * The strength of the gravity force - larger numbers produce a stronger force.
    */
  var power: js.UndefOr[Double] = js.undefined
  
  /**
    * The x coordinate of the Gravity Well, in world space.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * The y coordinate of the Gravity Well, in world space.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object GravityWellConfig {
  
  @scala.inline
  def apply(): GravityWellConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GravityWellConfig]
  }
  
  @scala.inline
  implicit class GravityWellConfigMutableBuilder[Self <: GravityWellConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

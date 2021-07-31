package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedShapeOptions extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var collisionGroup: js.UndefOr[Double] = js.undefined
  
  var collisionMask: js.UndefOr[Double] = js.undefined
  
  var collisionResponse: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var sensor: js.UndefOr[Boolean] = js.undefined
}
object SharedShapeOptions {
  
  @scala.inline
  def apply(): SharedShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedShapeOptions]
  }
  
  @scala.inline
  implicit class SharedShapeOptionsMutableBuilder[Self <: SharedShapeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setCollisionGroup(value: Double): Self = StObject.set(x, "collisionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionGroupUndefined: Self = StObject.set(x, "collisionGroup", js.undefined)
    
    @scala.inline
    def setCollisionMask(value: Double): Self = StObject.set(x, "collisionMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionMaskUndefined: Self = StObject.set(x, "collisionMask", js.undefined)
    
    @scala.inline
    def setCollisionResponse(value: Boolean): Self = StObject.set(x, "collisionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionResponseUndefined: Self = StObject.set(x, "collisionResponse", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSensor(value: Boolean): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorUndefined: Self = StObject.set(x, "sensor", js.undefined)
  }
}

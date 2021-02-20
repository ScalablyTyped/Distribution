package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RayOptions extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* result */ RaycastResult, Unit]] = js.native
  
  var checkCollisionResponse: js.UndefOr[Boolean] = js.native
  
  var collisionGroup: js.UndefOr[Double] = js.native
  
  var collisionMask: js.UndefOr[Double] = js.native
  
  var from: js.Tuple2[Double, Double] = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var skipBackfaces: js.UndefOr[Boolean] = js.native
  
  var to: js.Tuple2[Double, Double] = js.native
}
object RayOptions {
  
  @scala.inline
  def apply(from: js.Tuple2[Double, Double], to: js.Tuple2[Double, Double]): RayOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RayOptions]
  }
  
  @scala.inline
  implicit class RayOptionsMutableBuilder[Self <: RayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* result */ RaycastResult => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCheckCollisionResponse(value: Boolean): Self = StObject.set(x, "checkCollisionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckCollisionResponseUndefined: Self = StObject.set(x, "checkCollisionResponse", js.undefined)
    
    @scala.inline
    def setCollisionGroup(value: Double): Self = StObject.set(x, "collisionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionGroupUndefined: Self = StObject.set(x, "collisionGroup", js.undefined)
    
    @scala.inline
    def setCollisionMask(value: Double): Self = StObject.set(x, "collisionMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionMaskUndefined: Self = StObject.set(x, "collisionMask", js.undefined)
    
    @scala.inline
    def setFrom(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSkipBackfaces(value: Boolean): Self = StObject.set(x, "skipBackfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipBackfacesUndefined: Self = StObject.set(x, "skipBackfaces", js.undefined)
    
    @scala.inline
    def setTo(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}

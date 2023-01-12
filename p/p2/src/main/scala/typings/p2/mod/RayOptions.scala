package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RayOptions extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* result */ RaycastResult, Unit]] = js.undefined
  
  var checkCollisionResponse: js.UndefOr[Boolean] = js.undefined
  
  var collisionGroup: js.UndefOr[Double] = js.undefined
  
  var collisionMask: js.UndefOr[Double] = js.undefined
  
  var from: js.Tuple2[Double, Double]
  
  var mode: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Ray.CLOSEST */ Any
  ] = js.undefined
  
  var skipBackfaces: js.UndefOr[Boolean] = js.undefined
  
  var to: js.Tuple2[Double, Double]
}
object RayOptions {
  
  inline def apply(from: js.Tuple2[Double, Double], to: js.Tuple2[Double, Double]): RayOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RayOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* result */ RaycastResult => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCheckCollisionResponse(value: Boolean): Self = StObject.set(x, "checkCollisionResponse", value.asInstanceOf[js.Any])
    
    inline def setCheckCollisionResponseUndefined: Self = StObject.set(x, "checkCollisionResponse", js.undefined)
    
    inline def setCollisionGroup(value: Double): Self = StObject.set(x, "collisionGroup", value.asInstanceOf[js.Any])
    
    inline def setCollisionGroupUndefined: Self = StObject.set(x, "collisionGroup", js.undefined)
    
    inline def setCollisionMask(value: Double): Self = StObject.set(x, "collisionMask", value.asInstanceOf[js.Any])
    
    inline def setCollisionMaskUndefined: Self = StObject.set(x, "collisionMask", js.undefined)
    
    inline def setFrom(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setMode(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Ray.CLOSEST */ Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSkipBackfaces(value: Boolean): Self = StObject.set(x, "skipBackfaces", value.asInstanceOf[js.Any])
    
    inline def setSkipBackfacesUndefined: Self = StObject.set(x, "skipBackfaces", js.undefined)
    
    inline def setTo(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}

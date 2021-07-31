package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpringOptions extends StObject {
  
  var damping: js.UndefOr[Double] = js.undefined
  
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
  
  var worldAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var worldAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object SpringOptions {
  
  @scala.inline
  def apply(): SpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringOptions]
  }
  
  @scala.inline
  implicit class SpringOptionsMutableBuilder[Self <: SpringOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    @scala.inline
    def setLocalAnchorA(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorAUndefined: Self = StObject.set(x, "localAnchorA", js.undefined)
    
    @scala.inline
    def setLocalAnchorB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorBUndefined: Self = StObject.set(x, "localAnchorB", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    @scala.inline
    def setWorldAnchorA(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "worldAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldAnchorAUndefined: Self = StObject.set(x, "worldAnchorA", js.undefined)
    
    @scala.inline
    def setWorldAnchorB(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "worldAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldAnchorBUndefined: Self = StObject.set(x, "worldAnchorB", js.undefined)
  }
}

package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstraintData extends StObject {
  
  var name: String
  
  var order: Double
  
  var skinRequired: Boolean
}
object ConstraintData {
  
  @scala.inline
  def apply(name: String, order: Double, skinRequired: Boolean): ConstraintData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintData]
  }
  
  @scala.inline
  implicit class ConstraintDataMutableBuilder[Self <: ConstraintData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinRequired(value: Boolean): Self = StObject.set(x, "skinRequired", value.asInstanceOf[js.Any])
  }
}

package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollisionFilter extends StObject {
  
  var category: Double
  
  var group: Double
  
  var mask: Double
}
object ICollisionFilter {
  
  @scala.inline
  def apply(category: Double, group: Double, mask: Double): ICollisionFilter = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionFilter]
  }
  
  @scala.inline
  implicit class ICollisionFilterMutableBuilder[Self <: ICollisionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}

package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypeTargetForBrowsing extends StObject {
  
  def Clone(): IObjectTypeTargetForBrowsing
  
  var TargetObjectType: Double
  
  var ViewCollection: Double
}
object IObjectTypeTargetForBrowsing {
  
  inline def apply(Clone: () => IObjectTypeTargetForBrowsing, TargetObjectType: Double, ViewCollection: Double): IObjectTypeTargetForBrowsing = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), TargetObjectType = TargetObjectType.asInstanceOf[js.Any], ViewCollection = ViewCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeTargetForBrowsing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IObjectTypeTargetForBrowsing] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IObjectTypeTargetForBrowsing): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setTargetObjectType(value: Double): Self = StObject.set(x, "TargetObjectType", value.asInstanceOf[js.Any])
    
    inline def setViewCollection(value: Double): Self = StObject.set(x, "ViewCollection", value.asInstanceOf[js.Any])
  }
}

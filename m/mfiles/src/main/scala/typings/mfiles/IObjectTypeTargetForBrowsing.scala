package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectTypeTargetForBrowsing extends StObject {
  
  def Clone(): IObjectTypeTargetForBrowsing = js.native
  
  var TargetObjectType: Double = js.native
  
  var ViewCollection: Double = js.native
}
object IObjectTypeTargetForBrowsing {
  
  @scala.inline
  def apply(Clone: () => IObjectTypeTargetForBrowsing, TargetObjectType: Double, ViewCollection: Double): IObjectTypeTargetForBrowsing = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), TargetObjectType = TargetObjectType.asInstanceOf[js.Any], ViewCollection = ViewCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeTargetForBrowsing]
  }
  
  @scala.inline
  implicit class IObjectTypeTargetForBrowsingMutableBuilder[Self <: IObjectTypeTargetForBrowsing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IObjectTypeTargetForBrowsing): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetObjectType(value: Double): Self = StObject.set(x, "TargetObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCollection(value: Double): Self = StObject.set(x, "ViewCollection", value.asInstanceOf[js.Any])
  }
}

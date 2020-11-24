package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectTypeTargetForBrowsing extends js.Object {
  
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
  implicit class IObjectTypeTargetForBrowsingOps[Self <: IObjectTypeTargetForBrowsing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: () => IObjectTypeTargetForBrowsing): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetObjectType(value: Double): Self = this.set("TargetObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCollection(value: Double): Self = this.set("ViewCollection", value.asInstanceOf[js.Any])
  }
}

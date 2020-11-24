package typings.playcanvas.anon

import typings.playcanvas.pc.Ray
import typings.playcanvas.pc.XrHitTestSource
import typings.playcanvas.pc.callbacks.XrHitTestStart
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetRay extends js.Object {
  
  var callback: js.UndefOr[XrHitTestStart] = js.native
  
  var entityTypes: js.UndefOr[js.Array[String]] = js.native
  
  var offsetRay: js.UndefOr[Ray] = js.native
}
object OffsetRay {
  
  @scala.inline
  def apply(): OffsetRay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetRay]
  }
  
  @scala.inline
  implicit class OffsetRayOps[Self <: OffsetRay] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: (/* err */ Error | Null, /* hitTestSource */ XrHitTestSource | Null) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = this.set("entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: js.Array[String]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
    
    @scala.inline
    def setOffsetRay(value: Ray): Self = this.set("offsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRay: Self = this.set("offsetRay", js.undefined)
  }
}

package typings.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDock extends js.Object {
  
  /**
    */
  var BeginBottom: js.Any = js.native
  
  /**
    */
  var BeginCenter: js.Any = js.native
  
  /**
    */
  var BeginTop: js.Any = js.native
  
  /**
    */
  var CenterBottom: js.Any = js.native
  
  /**
    */
  var CenterCenter: js.Any = js.native
  
  /**
    */
  var CenterTop: js.Any = js.native
  
  /**
    */
  var EndBottom: js.Any = js.native
  
  /**
    */
  var EndCenter: js.Any = js.native
  
  /**
    */
  var EndTop: js.Any = js.native
  
  /**
    */
  var LeftBottom: js.Any = js.native
  
  /**
    */
  var LeftCenter: js.Any = js.native
  
  /**
    */
  var LeftTop: js.Any = js.native
  
  /**
    */
  var RightBottom: js.Any = js.native
  
  /**
    */
  var RightCenter: js.Any = js.native
  
  /**
    */
  var RightTop: js.Any = js.native
}
object TypeofDock {
  
  @scala.inline
  def apply(
    BeginBottom: js.Any,
    BeginCenter: js.Any,
    BeginTop: js.Any,
    CenterBottom: js.Any,
    CenterCenter: js.Any,
    CenterTop: js.Any,
    EndBottom: js.Any,
    EndCenter: js.Any,
    EndTop: js.Any,
    LeftBottom: js.Any,
    LeftCenter: js.Any,
    LeftTop: js.Any,
    RightBottom: js.Any,
    RightCenter: js.Any,
    RightTop: js.Any
  ): TypeofDock = {
    val __obj = js.Dynamic.literal(BeginBottom = BeginBottom.asInstanceOf[js.Any], BeginCenter = BeginCenter.asInstanceOf[js.Any], BeginTop = BeginTop.asInstanceOf[js.Any], CenterBottom = CenterBottom.asInstanceOf[js.Any], CenterCenter = CenterCenter.asInstanceOf[js.Any], CenterTop = CenterTop.asInstanceOf[js.Any], EndBottom = EndBottom.asInstanceOf[js.Any], EndCenter = EndCenter.asInstanceOf[js.Any], EndTop = EndTop.asInstanceOf[js.Any], LeftBottom = LeftBottom.asInstanceOf[js.Any], LeftCenter = LeftCenter.asInstanceOf[js.Any], LeftTop = LeftTop.asInstanceOf[js.Any], RightBottom = RightBottom.asInstanceOf[js.Any], RightCenter = RightCenter.asInstanceOf[js.Any], RightTop = RightTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDock]
  }
  
  @scala.inline
  implicit class TypeofDockOps[Self <: TypeofDock] (val x: Self) extends AnyVal {
    
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
    def setBeginBottom(value: js.Any): Self = this.set("BeginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginCenter(value: js.Any): Self = this.set("BeginCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginTop(value: js.Any): Self = this.set("BeginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterBottom(value: js.Any): Self = this.set("CenterBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterCenter(value: js.Any): Self = this.set("CenterCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterTop(value: js.Any): Self = this.set("CenterTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndBottom(value: js.Any): Self = this.set("EndBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCenter(value: js.Any): Self = this.set("EndCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTop(value: js.Any): Self = this.set("EndTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBottom(value: js.Any): Self = this.set("LeftBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftCenter(value: js.Any): Self = this.set("LeftCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftTop(value: js.Any): Self = this.set("LeftTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBottom(value: js.Any): Self = this.set("RightBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightCenter(value: js.Any): Self = this.set("RightCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTop(value: js.Any): Self = this.set("RightTop", value.asInstanceOf[js.Any])
  }
}

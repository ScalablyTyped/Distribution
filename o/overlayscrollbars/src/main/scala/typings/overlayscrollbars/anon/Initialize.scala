package typings.overlayscrollbars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initialize extends js.Object {
  
  var initialize: js.UndefOr[Boolean] = js.native
  
  var showNativeScrollbars: js.UndefOr[Boolean] = js.native
}
object Initialize {
  
  @scala.inline
  def apply(): Initialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialize]
  }
  
  @scala.inline
  implicit class InitializeOps[Self <: Initialize] (val x: Self) extends AnyVal {
    
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
    def setInitialize(value: Boolean): Self = this.set("initialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    
    @scala.inline
    def setShowNativeScrollbars(value: Boolean): Self = this.set("showNativeScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNativeScrollbars: Self = this.set("showNativeScrollbars", js.undefined)
  }
}

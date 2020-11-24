package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrioConfig extends js.Object {
  
  var exclude: js.UndefOr[js.Any] = js.native
  
  var include: js.UndefOr[js.Any] = js.native
  
  var inherited: js.UndefOr[Boolean] = js.native
  
  var `private`: js.UndefOr[Boolean] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
  
  var stack: js.UndefOr[Boolean] = js.native
}
object ErrioConfig {
  
  @scala.inline
  def apply(): ErrioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrioConfig]
  }
  
  @scala.inline
  implicit class ErrioConfigOps[Self <: ErrioConfig] (val x: Self) extends AnyVal {
    
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
    def setExclude(value: js.Any): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setInclude(value: js.Any): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setInherited(value: Boolean): Self = this.set("inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherited: Self = this.set("inherited", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}

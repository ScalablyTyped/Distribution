package typings.nodegit.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffFindOptions extends js.Object {
  
  var breakRewriteThreshold: js.UndefOr[Double] = js.native
  
  var copyThreshold: js.UndefOr[Double] = js.native
  
  var flags: js.UndefOr[Double] = js.native
  
  var renameFromRewriteThreshold: js.UndefOr[Double] = js.native
  
  var renameLimit: js.UndefOr[Double] = js.native
  
  var renameThreshold: js.UndefOr[Double] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object DiffFindOptions {
  
  @scala.inline
  def apply(): DiffFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffFindOptions]
  }
  
  @scala.inline
  implicit class DiffFindOptionsOps[Self <: DiffFindOptions] (val x: Self) extends AnyVal {
    
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
    def setBreakRewriteThreshold(value: Double): Self = this.set("breakRewriteThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakRewriteThreshold: Self = this.set("breakRewriteThreshold", js.undefined)
    
    @scala.inline
    def setCopyThreshold(value: Double): Self = this.set("copyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyThreshold: Self = this.set("copyThreshold", js.undefined)
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setRenameFromRewriteThreshold(value: Double): Self = this.set("renameFromRewriteThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameFromRewriteThreshold: Self = this.set("renameFromRewriteThreshold", js.undefined)
    
    @scala.inline
    def setRenameLimit(value: Double): Self = this.set("renameLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameLimit: Self = this.set("renameLimit", js.undefined)
    
    @scala.inline
    def setRenameThreshold(value: Double): Self = this.set("renameThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameThreshold: Self = this.set("renameThreshold", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}

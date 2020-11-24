package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.overlay
import typings.oracleOraclejet.oracleOraclejetStrings.push
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoDismiss extends js.Object {
  
  var autoDismiss: js.UndefOr[focusLoss | none] = js.native
  
  var content: String = js.native
  
  var displayMode: js.UndefOr[push | overlay] = js.native
  
  var edge: js.UndefOr[start | end | top | bottom] = js.native
  
  var modality: js.UndefOr[modal | modeless] = js.native
  
  var selector: String = js.native
  
  var size: js.UndefOr[String] = js.native
}
object AutoDismiss {
  
  @scala.inline
  def apply(content: String, selector: String): AutoDismiss = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDismiss]
  }
  
  @scala.inline
  implicit class AutoDismissOps[Self <: AutoDismiss] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDismiss(value: focusLoss | none): Self = this.set("autoDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDismiss: Self = this.set("autoDismiss", js.undefined)
    
    @scala.inline
    def setDisplayMode(value: push | overlay): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    
    @scala.inline
    def setEdge(value: start | end | top | bottom): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    
    @scala.inline
    def setModality(value: modal | modeless): Self = this.set("modality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModality: Self = this.set("modality", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}

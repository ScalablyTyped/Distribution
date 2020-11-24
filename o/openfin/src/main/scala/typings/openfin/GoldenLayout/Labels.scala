package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Labels extends js.Object {
  
  /**
    * The tooltip text that appears when hovering over the close icon.
    * Default: 'close'
    */
  var close: js.UndefOr[String] = js.native
  
  /**
    * The tooltip text that appears when hovering over the maximise icon.
    * Default: 'maximise'
    */
  var maximise: js.UndefOr[String] = js.native
  
  /**
    * The tooltip text that appears when hovering over the minimise icon.
    * Default: 'minimise'
    */
  var minimise: js.UndefOr[String] = js.native
  
  /**
    * The tooltip text that appears when hovering over the popout icon.
    * Default: 'open in new window'
    */
  var popout: js.UndefOr[String] = js.native
}
object Labels {
  
  @scala.inline
  def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit class LabelsOps[Self <: Labels] (val x: Self) extends AnyVal {
    
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setMaximise(value: String): Self = this.set("maximise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximise: Self = this.set("maximise", js.undefined)
    
    @scala.inline
    def setMinimise(value: String): Self = this.set("minimise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimise: Self = this.set("minimise", js.undefined)
    
    @scala.inline
    def setPopout(value: String): Self = this.set("popout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopout: Self = this.set("popout", js.undefined)
  }
}

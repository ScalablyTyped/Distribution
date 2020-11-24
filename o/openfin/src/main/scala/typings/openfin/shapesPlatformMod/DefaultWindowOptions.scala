package typings.openfin.shapesPlatformMod

import typings.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultWindowOptions extends WindowOption {
  
  var stylesheetUrl: String = js.native
}
object DefaultWindowOptions {
  
  @scala.inline
  def apply(stylesheetUrl: String): DefaultWindowOptions = {
    val __obj = js.Dynamic.literal(stylesheetUrl = stylesheetUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWindowOptions]
  }
  
  @scala.inline
  implicit class DefaultWindowOptionsOps[Self <: DefaultWindowOptions] (val x: Self) extends AnyVal {
    
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
    def setStylesheetUrl(value: String): Self = this.set("stylesheetUrl", value.asInstanceOf[js.Any])
  }
}

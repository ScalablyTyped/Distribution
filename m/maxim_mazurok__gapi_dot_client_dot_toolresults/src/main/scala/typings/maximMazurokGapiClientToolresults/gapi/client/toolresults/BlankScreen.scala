package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlankScreen extends js.Object {
  
  /** The screen id of the element */
  var screenId: js.UndefOr[String] = js.native
}
object BlankScreen {
  
  @scala.inline
  def apply(): BlankScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlankScreen]
  }
  
  @scala.inline
  implicit class BlankScreenOps[Self <: BlankScreen] (val x: Self) extends AnyVal {
    
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
    def setScreenId(value: String): Self = this.set("screenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenId: Self = this.set("screenId", js.undefined)
  }
}

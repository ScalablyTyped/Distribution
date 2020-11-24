package typings.openfin.preloadScriptMod

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.`load-started`
import typings.openfin.openfinStrings.`load-succeeded`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreloadScript extends js.Object {
  
  var mandatory: js.UndefOr[Boolean] = js.native
  
  var state: js.UndefOr[`load-started` | `load-failed` | `load-succeeded` | failed | succeeded] = js.native
  
  var url: String = js.native
}
object PreloadScript {
  
  @scala.inline
  def apply(url: String): PreloadScript = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScript]
  }
  
  @scala.inline
  implicit class PreloadScriptOps[Self <: PreloadScript] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    
    @scala.inline
    def setState(value: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}

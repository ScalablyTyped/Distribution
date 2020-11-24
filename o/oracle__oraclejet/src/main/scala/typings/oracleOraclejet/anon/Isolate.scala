package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Isolate extends js.Object {
  
  var isolate: js.UndefOr[off | on] = js.native
  
  var labelHalign: js.UndefOr[center | end | start] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
  
  var useNodeColor: js.UndefOr[on | off] = js.native
}
object Isolate {
  
  @scala.inline
  def apply(): Isolate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Isolate]
  }
  
  @scala.inline
  implicit class IsolateOps[Self <: Isolate] (val x: Self) extends AnyVal {
    
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
    def setIsolate(value: off | on): Self = this.set("isolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolate: Self = this.set("isolate", js.undefined)
    
    @scala.inline
    def setLabelHalign(value: center | end | start): Self = this.set("labelHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHalign: Self = this.set("labelHalign", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setUseNodeColor(value: on | off): Self = this.set("useNodeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNodeColor: Self = this.set("useNodeColor", js.undefined)
  }
}

package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changed extends js.Object {
  
  var changed: js.Object = js.native
  
  var config: js.Object = js.native
  
  var rev: String = js.native
  
  var t: replace = js.native
}
object Changed {
  
  @scala.inline
  def apply(changed: js.Object, config: js.Object, rev: String, t: replace): Changed = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  
  @scala.inline
  implicit class ChangedOps[Self <: Changed] (val x: Self) extends AnyVal {
    
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
    def setChanged(value: js.Object): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: js.Object): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: String): Self = this.set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: replace): Self = this.set("t", value.asInstanceOf[js.Any])
  }
}

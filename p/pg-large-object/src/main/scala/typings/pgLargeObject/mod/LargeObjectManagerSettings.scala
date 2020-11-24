package typings.pgLargeObject.mod

import typings.pg.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LargeObjectManagerSettings extends js.Object {
  
  var pg: js.UndefOr[Client] = js.native
  
  var pgPromise: js.UndefOr[js.Object] = js.native
}
object LargeObjectManagerSettings {
  
  @scala.inline
  def apply(): LargeObjectManagerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LargeObjectManagerSettings]
  }
  
  @scala.inline
  implicit class LargeObjectManagerSettingsOps[Self <: LargeObjectManagerSettings] (val x: Self) extends AnyVal {
    
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
    def setPg(value: Client): Self = this.set("pg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePg: Self = this.set("pg", js.undefined)
    
    @scala.inline
    def setPgPromise(value: js.Object): Self = this.set("pgPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePgPromise: Self = this.set("pgPromise", js.undefined)
  }
}

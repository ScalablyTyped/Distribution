package typings.parcelEnv.ParcelModuleApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inside env you can pass any variable
  */
@js.native
trait NodeProcess extends js.Object {
  
  var env: js.UndefOr[js.Any] = js.native
}
object NodeProcess {
  
  @scala.inline
  def apply(): NodeProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeProcess]
  }
  
  @scala.inline
  implicit class NodeProcessOps[Self <: NodeProcess] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
  }
}

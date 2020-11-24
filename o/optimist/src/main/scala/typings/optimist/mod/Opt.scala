package typings.optimist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opt extends js.Object {
  
  var alias: js.UndefOr[String | js.Array[String]] = js.native
  
  var default: js.UndefOr[js.Any] = js.native
  
  var demand: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var describe: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Opt {
  
  @scala.inline
  def apply(): Opt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opt]
  }
  
  @scala.inline
  implicit class OptOps[Self <: Opt] (val x: Self) extends AnyVal {
    
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
    def setAliasVarargs(value: String*): Self = this.set("alias", js.Array(value :_*))
    
    @scala.inline
    def setAlias(value: String | js.Array[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDemandVarargs(value: String*): Self = this.set("demand", js.Array(value :_*))
    
    @scala.inline
    def setDemand(value: String | Double | js.Array[String]): Self = this.set("demand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemand: Self = this.set("demand", js.undefined)
    
    @scala.inline
    def setDescribe(value: String): Self = this.set("describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescribe: Self = this.set("describe", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

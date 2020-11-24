package typings.polymerTs.polymer

import typings.std.FunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolymerTSElement extends js.Object {
  
  @JSName("$custom_cons")
  var $custom_cons: js.UndefOr[FunctionConstructor] = js.native
  
  @JSName("$custom_cons_args")
  var $custom_cons_args: js.UndefOr[js.Array[_]] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
}
object PolymerTSElement {
  
  @scala.inline
  def apply(): PolymerTSElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolymerTSElement]
  }
  
  @scala.inline
  implicit class PolymerTSElementOps[Self <: PolymerTSElement] (val x: Self) extends AnyVal {
    
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
    def set$custom_cons(value: FunctionConstructor): Self = this.set("$custom_cons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$custom_cons: Self = this.set("$custom_cons", js.undefined)
    
    @scala.inline
    def set$custom_cons_argsVarargs(value: js.Any*): Self = this.set("$custom_cons_args", js.Array(value :_*))
    
    @scala.inline
    def set$custom_cons_args(value: js.Array[_]): Self = this.set("$custom_cons_args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$custom_cons_args: Self = this.set("$custom_cons_args", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}

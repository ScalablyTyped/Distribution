package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequireExtensions
  extends Dict[js.Function2[/* m */ Module, /* filename */ String, js.Any]] {
  
  @JSName(".js")
  def Dotjs(m: Module, filename: String): js.Any = js.native
  
  @JSName(".json")
  def Dotjson(m: Module, filename: String): js.Any = js.native
  
  @JSName(".node")
  def Dotnode(m: Module, filename: String): js.Any = js.native
}
object RequireExtensions {
  
  @scala.inline
  def apply(
    Dotjs: (Module, String) => js.Any,
    Dotjson: (Module, String) => js.Any,
    Dotnode: (Module, String) => js.Any
  ): RequireExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".js")(js.Any.fromFunction2(Dotjs))
    __obj.updateDynamic(".json")(js.Any.fromFunction2(Dotjson))
    __obj.updateDynamic(".node")(js.Any.fromFunction2(Dotnode))
    __obj.asInstanceOf[RequireExtensions]
  }
  
  @scala.inline
  implicit class RequireExtensionsOps[Self <: RequireExtensions] (val x: Self) extends AnyVal {
    
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
    def setDotjs(value: (Module, String) => js.Any): Self = this.set(".js", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDotjson(value: (Module, String) => js.Any): Self = this.set(".json", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDotnode(value: (Module, String) => js.Any): Self = this.set(".node", js.Any.fromFunction2(value))
  }
}

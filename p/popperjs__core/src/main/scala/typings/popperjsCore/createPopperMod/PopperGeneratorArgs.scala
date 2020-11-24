package typings.popperjsCore.createPopperMod

import typings.popperjsCore.anon.PartialOptionsGenericany
import typings.popperjsCore.typesMod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopperGeneratorArgs extends js.Object {
  
  var defaultModifiers: js.UndefOr[js.Array[Modifier[_, _]]] = js.native
  
  var defaultOptions: js.UndefOr[PartialOptionsGenericany] = js.native
}
object PopperGeneratorArgs {
  
  @scala.inline
  def apply(): PopperGeneratorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopperGeneratorArgs]
  }
  
  @scala.inline
  implicit class PopperGeneratorArgsOps[Self <: PopperGeneratorArgs] (val x: Self) extends AnyVal {
    
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
    def setDefaultModifiersVarargs(value: (Modifier[js.Any, js.Any])*): Self = this.set("defaultModifiers", js.Array(value :_*))
    
    @scala.inline
    def setDefaultModifiers(value: js.Array[Modifier[_, _]]): Self = this.set("defaultModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultModifiers: Self = this.set("defaultModifiers", js.undefined)
    
    @scala.inline
    def setDefaultOptions(value: PartialOptionsGenericany): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
  }
}

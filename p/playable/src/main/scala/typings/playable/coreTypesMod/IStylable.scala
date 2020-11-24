package typings.playable.coreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStylable[TStyles] extends js.Object {
  
  var styleNames: TStyles = js.native
}
object IStylable {
  
  @scala.inline
  def apply[TStyles](styleNames: TStyles): IStylable[TStyles] = {
    val __obj = js.Dynamic.literal(styleNames = styleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStylable[TStyles]]
  }
  
  @scala.inline
  implicit class IStylableOps[Self <: IStylable[_], TStyles] (val x: Self with IStylable[TStyles]) extends AnyVal {
    
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
    def setStyleNames(value: TStyles): Self = this.set("styleNames", value.asInstanceOf[js.Any])
  }
}

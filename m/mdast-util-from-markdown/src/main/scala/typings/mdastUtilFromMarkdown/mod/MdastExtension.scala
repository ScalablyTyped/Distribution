package typings.mdastUtilFromMarkdown.mod

import typings.micromark.sharedTypesMod.Token
import typings.micromark.typesMod.Type
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MdastExtension extends js.Object {
  
  var enter: Record[Type, js.Function1[/* token */ Token, Unit]] = js.native
  
  var exit: Record[Type, js.Function1[/* token */ Token, Unit]] = js.native
}
object MdastExtension {
  
  @scala.inline
  def apply(
    enter: Record[Type, js.Function1[/* token */ Token, Unit]],
    exit: Record[Type, js.Function1[/* token */ Token, Unit]]
  ): MdastExtension = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MdastExtension]
  }
  
  @scala.inline
  implicit class MdastExtensionOps[Self <: MdastExtension] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: Record[Type, js.Function1[/* token */ Token, Unit]]): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: Record[Type, js.Function1[/* token */ Token, Unit]]): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
}

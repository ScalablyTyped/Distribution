package typings.mvdanSh.mod

import typings.mvdanSh.anon.BinaryNextLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellScript extends js.Object {
  
  var syntax: BinaryNextLine = js.native
}
object ShellScript {
  
  @scala.inline
  def apply(syntax: BinaryNextLine): ShellScript = {
    val __obj = js.Dynamic.literal(syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellScript]
  }
  
  @scala.inline
  implicit class ShellScriptOps[Self <: ShellScript] (val x: Self) extends AnyVal {
    
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
    def setSyntax(value: BinaryNextLine): Self = this.set("syntax", value.asInstanceOf[js.Any])
  }
}

package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetText extends js.Object {
  
  def getText(): Unit = js.native
  
  // Orion Editor
  def setText(): Unit = js.native
}
object GetText {
  
  @scala.inline
  def apply(getText: () => Unit, setText: () => Unit): GetText = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction0(getText), setText = js.Any.fromFunction0(setText))
    __obj.asInstanceOf[GetText]
  }
  
  @scala.inline
  implicit class GetTextOps[Self <: GetText] (val x: Self) extends AnyVal {
    
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
    def setGetText(value: () => Unit): Self = this.set("getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetText(value: () => Unit): Self = this.set("setText", js.Any.fromFunction0(value))
  }
}

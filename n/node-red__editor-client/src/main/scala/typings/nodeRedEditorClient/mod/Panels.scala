package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panels extends js.Object {
  
  def create(options: Resize): PanelsInstance = js.native
}
object Panels {
  
  @scala.inline
  def apply(create: Resize => PanelsInstance): Panels = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Panels]
  }
  
  @scala.inline
  implicit class PanelsOps[Self <: Panels] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: Resize => PanelsInstance): Self = this.set("create", js.Any.fromFunction1(value))
  }
}

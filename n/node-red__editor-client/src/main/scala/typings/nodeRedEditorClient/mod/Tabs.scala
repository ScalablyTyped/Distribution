package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.AddButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tabs extends js.Object {
  
  def create(options: AddButton): TabsInstance = js.native
}
object Tabs {
  
  @scala.inline
  def apply(create: AddButton => TabsInstance): Tabs = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Tabs]
  }
  
  @scala.inline
  implicit class TabsOps[Self <: Tabs] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: AddButton => TabsInstance): Self = this.set("create", js.Any.fromFunction1(value))
  }
}

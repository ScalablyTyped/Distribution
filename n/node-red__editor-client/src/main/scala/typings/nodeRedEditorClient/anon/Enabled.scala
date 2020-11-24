package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.NodeInstance
import typings.nodeRedEditorClient.mod.NodeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enabled[TInstProps /* <: TProps */, TProps /* <: NodeProperties */] extends js.Object {
  
  /** Function to dynamically enable and disable the button based on the node’s current configuration. */
  var enabled: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]] = js.native
  
  /** Called when the button is clicked */
  def onclick(): Unit = js.native
  
  /** Function to determine whether the button should be shown at all. */
  var visible: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]] = js.native
}
object Enabled {
  
  @scala.inline
  def apply[TInstProps /* <: TProps */, TProps /* <: NodeProperties */](onclick: () => Unit): Enabled[TInstProps, TProps] = {
    val __obj = js.Dynamic.literal(onclick = js.Any.fromFunction0(onclick))
    __obj.asInstanceOf[Enabled[TInstProps, TProps]]
  }
  
  @scala.inline
  implicit class EnabledOps[Self <: Enabled[_, _], TInstProps /* <: TProps */, TProps /* <: NodeProperties */] (val x: Self with (Enabled[TInstProps, TProps])) extends AnyVal {
    
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
    def setOnclick(value: () => Unit): Self = this.set("onclick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setVisible(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

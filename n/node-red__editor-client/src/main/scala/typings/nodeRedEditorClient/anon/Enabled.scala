package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.NodeInstance
import typings.nodeRedEditorClient.mod.NodeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled[TInstProps /* <: TProps */, TProps /* <: NodeProperties */] extends StObject {
  
  /** Function to dynamically enable and disable the button based on the node’s current configuration. */
  var enabled: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]] = js.undefined
  
  /** Called when the button is clicked */
  def onclick(): Unit
  
  /** Function to determine whether the button should be shown at all. */
  var visible: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]] = js.undefined
}
object Enabled {
  
  @scala.inline
  def apply[TInstProps /* <: TProps */, TProps /* <: NodeProperties */](onclick: () => Unit): Enabled[TInstProps, TProps] = {
    val __obj = js.Dynamic.literal(onclick = js.Any.fromFunction0(onclick))
    __obj.asInstanceOf[Enabled[TInstProps, TProps]]
  }
  
  @scala.inline
  implicit class EnabledMutableBuilder[Self <: Enabled[?, ?], TInstProps /* <: TProps */, TProps /* <: NodeProperties */] (val x: Self & (Enabled[TInstProps, TProps])) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOnclick(value: () => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

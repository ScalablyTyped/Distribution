package typings.preact.internalMod

import typings.preact.anon.Children
import typings.preact.mod.ComponentType
import typings.preact.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VNode[P]
  extends typings.preact.mod.VNode[P] {
  
  var _children: js.Array[VNode[_]] | Null = js.native
  
  var _component: (Component[js.Object, js.Object]) | Null = js.native
  
  var _depth: Double | Null = js.native
  
  /**
  	 * The [first (for Fragments)] DOM child of a VNode
  	 */
  var _dom: PreactElement | Null = js.native
  
  var _hydrating: Boolean | Null = js.native
  
  /**
  	 * The last dom child of a Fragment, or components that return a Fragment
  	 */
  var _nextDom: PreactElement | Null = js.native
  
  var _original: js.UndefOr[VNode[js.Object] | Null] = js.native
  
  var _parent: VNode[js.Object] | Null = js.native
  
  var constructor: js.UndefOr[scala.Nothing] = js.native
}
object VNode {
  
  @scala.inline
  def apply[P](key: Key, props: P with Children, `type`: ComponentType[P] | String): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
  
  @scala.inline
  implicit class VNodeOps[Self <: VNode[_], P] (val x: Self with VNode[P]) extends AnyVal {
    
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
    def set_childrenVarargs(value: VNode[js.Any]*): Self = this.set("_children", js.Array(value :_*))
    
    @scala.inline
    def set_children(value: js.Array[VNode[_]]): Self = this.set("_children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_childrenNull: Self = this.set("_children", null)
    
    @scala.inline
    def set_component(value: Component[js.Object, js.Object]): Self = this.set("_component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_componentNull: Self = this.set("_component", null)
    
    @scala.inline
    def set_depth(value: Double): Self = this.set("_depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_depthNull: Self = this.set("_depth", null)
    
    @scala.inline
    def set_dom(value: PreactElement): Self = this.set("_dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_domNull: Self = this.set("_dom", null)
    
    @scala.inline
    def set_hydrating(value: Boolean): Self = this.set("_hydrating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hydratingNull: Self = this.set("_hydrating", null)
    
    @scala.inline
    def set_nextDom(value: PreactElement): Self = this.set("_nextDom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nextDomNull: Self = this.set("_nextDom", null)
    
    @scala.inline
    def set_original(value: VNode[js.Object]): Self = this.set("_original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_original: Self = this.set("_original", js.undefined)
    
    @scala.inline
    def set_originalNull: Self = this.set("_original", null)
    
    @scala.inline
    def set_parent(value: VNode[js.Object]): Self = this.set("_parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parentNull: Self = this.set("_parent", null)
  }
}

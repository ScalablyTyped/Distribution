package typings.mithril.mod

import typings.mithril.anon.Key
import typings.mithril.anon.Lifecycleanyanykeystringa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperscript extends js.Object {
  
  /** Creates a virtual element (Vnode). */
  def apply(selector: String, attributes: Attributes, children: Children*): Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply(selector: String, children: Children*): Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](component: ComponentTypes[Attrs, State], args: Children*): Vnode[Attrs, State] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](
    component: ComponentTypes[Attrs, State],
    attributes: Attrs with (Lifecycle[Attrs, State]) with Key,
    args: Children*
  ): Vnode[Attrs, State] = js.native
  
  /** Creates a fragment virtual element (Vnode). */
  def fragment(attrs: Lifecycleanyanykeystringa, children: ChildArrayOrPrimitive): Vnode[_, _] = js.native
  
  /** Turns an HTML string into a virtual element (Vnode). Do not use trust on unsanitized user input. */
  def trust(html: String): Vnode[_, _] = js.native
}

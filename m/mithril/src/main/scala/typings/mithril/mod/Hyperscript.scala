package typings.mithril.mod

import typings.mithril.anon.CommonAttributesanyanykey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperscript extends StObject {
  
  /** Creates a virtual element (Vnode). */
  def apply(selector: String, attributes: Attributes, children: Children*): Vnode[Any, Any] = js.native
  /** Creates a virtual element (Vnode). */
  def apply(selector: String, children: Children*): Vnode[Any, Any] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](component: ComponentTypes[Attrs, State], args: Children*): Vnode[Attrs, State] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](
    component: ComponentTypes[Attrs, State],
    attributes: Attrs & (CommonAttributes[Attrs, State]),
    args: Children*
  ): Vnode[Attrs, State] = js.native
  
  /** Creates a fragment virtual element (Vnode). */
  def fragment(attrs: CommonAttributesanyanykey, children: ChildArrayOrPrimitive): Vnode[Any, Any] = js.native
  
  /** Turns an HTML string into a virtual element (Vnode). Do not use trust on unsanitized user input. */
  def trust(html: String): Vnode[Any, Any] = js.native
}

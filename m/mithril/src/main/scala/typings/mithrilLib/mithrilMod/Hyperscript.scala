package typings
package mithrilLib.mithrilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hyperscript extends js.Object {
  /** Creates a virtual element (Vnode). */
  def apply(selector: java.lang.String, attributes: Attributes, children: Children*): Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply(selector: java.lang.String, children: Children*): Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](component: ComponentTypes[Attrs, State], args: Children*): Vnode[Attrs, State] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](
    component: ComponentTypes[Attrs, State],
    attributes: Attrs with (Lifecycle[Attrs, State]) with mithrilLib.Anon_Key,
    args: Children*
  ): Vnode[Attrs, State] = js.native
  /** Creates a fragment virtual element (Vnode). */
  def fragment(
    attrs: (Lifecycle[_, _]) with org.scalablytyped.runtime.StringDictionary[js.Any],
    children: ChildArrayOrPrimitive
  ): Vnode[_, _] = js.native
  /** Turns an HTML string into a virtual element (Vnode). Do not use trust on unsanitized user input. */
  def trust(html: java.lang.String): Vnode[_, _] = js.native
}


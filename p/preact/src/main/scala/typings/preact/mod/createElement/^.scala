package typings.preact.mod.createElement

import typings.preact.jsxMod.JSXInternal.HTMLAttributes
import typings.preact.jsxMod.JSXInternal.SVGAttributes
import typings.preact.mod.Attributes
import typings.preact.mod.ComponentChildren
import typings.preact.mod.ComponentType
import typings.preact.mod.VNode
import typings.std.EventTarget
import typings.std.Record
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("preact", "createElement")
@js.native
object ^ extends js.Object {
  
  //
  // Preact createElement
  // -----------------------------------
  def apply(
    `type`: String,
    props: HTMLAttributes[EventTarget] with SVGAttributes[SVGElement] with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def apply(`type`: String, props: Null, children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[_] = js.native
}

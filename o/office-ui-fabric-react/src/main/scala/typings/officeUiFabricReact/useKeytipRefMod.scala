package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipDataTypesMod.KeytipDataOptions
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/KeytipData/useKeytipRef", JSImport.Namespace)
@js.native
object useKeytipRefMod extends js.Object {
  
  def setAttribute(element: Null, attributeName: String): Unit = js.native
  def setAttribute(element: Null, attributeName: String, attributeValue: js.UndefOr[scala.Nothing], append: Boolean): Unit = js.native
  def setAttribute(element: Null, attributeName: String, attributeValue: String): Unit = js.native
  def setAttribute(element: Null, attributeName: String, attributeValue: String, append: Boolean): Unit = js.native
  def setAttribute(element: HTMLElement, attributeName: String): Unit = js.native
  def setAttribute(
    element: HTMLElement,
    attributeName: String,
    attributeValue: js.UndefOr[scala.Nothing],
    append: Boolean
  ): Unit = js.native
  def setAttribute(element: HTMLElement, attributeName: String, attributeValue: String): Unit = js.native
  def setAttribute(element: HTMLElement, attributeName: String, attributeValue: String, append: Boolean): Unit = js.native
  
  def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = js.native
}

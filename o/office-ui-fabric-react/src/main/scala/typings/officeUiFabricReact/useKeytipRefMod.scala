package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipDataTypesMod.KeytipDataOptions
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useKeytipRefMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipData/useKeytipRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setAttribute(element: Null, attributeName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttribute(element: Null, attributeName: String, attributeValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttribute(element: Null, attributeName: String, attributeValue: String, append: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeValue.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttribute(element: Null, attributeName: String, attributeValue: Unit, append: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeValue.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttribute(element: HTMLElement, attributeName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttribute(element: HTMLElement, attributeName: String, attributeValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttribute(element: HTMLElement, attributeName: String, attributeValue: String, append: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeValue.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttribute(element: HTMLElement, attributeName: String, attributeValue: Unit, append: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttribute")(element.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeValue.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeytipRef")(options.asInstanceOf[js.Any]).asInstanceOf[Ref[TElement]]
}

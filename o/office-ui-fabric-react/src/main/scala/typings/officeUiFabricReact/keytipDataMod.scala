package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typings.officeUiFabricReact.keytipDataTypesMod.KeytipDataOptions
import typings.react.mod.FunctionComponent
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.uifabricUtilities.irendercomponentMod.IRenderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipDataMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipData", "KeytipData")
  @js.native
  val KeytipData: FunctionComponent[IKeytipDataProps & IRenderComponent[js.Object]] = js.native
  
  @scala.inline
  def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeytipRef")(options.asInstanceOf[js.Any]).asInstanceOf[Ref[TElement]]
}

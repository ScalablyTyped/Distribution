package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsKeytipDataKeytipDataDottypesMod.IKeytipDataProps
import typings.officeUiFabricReact.libComponentsKeytipDataKeytipDataDottypesMod.KeytipDataOptions
import typings.react.mod.FunctionComponent
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.uifabricUtilities.libIrendercomponentMod.IRenderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeytipDataMod {
  
  @JSImport("office-ui-fabric-react/lib/KeytipData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/KeytipData", "KeytipData")
  @js.native
  val KeytipData: FunctionComponent[IKeytipDataProps & IRenderComponent[js.Object]] = js.native
  
  inline def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeytipRef")(options.asInstanceOf[js.Any]).asInstanceOf[Ref[TElement]]
}

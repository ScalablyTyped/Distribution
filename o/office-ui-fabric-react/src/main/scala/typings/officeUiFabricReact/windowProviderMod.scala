package typings.officeUiFabricReact

import typings.fluentuiReactWindowProvider.windowProviderMod.WindowProviderProps
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowProviderMod {
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "WindowContext")
  @js.native
  val WindowContext: Context[WindowProviderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "WindowProvider")
  @js.native
  val WindowProvider: FunctionComponent[WindowProviderProps] = js.native
  
  @scala.inline
  def useDocument(): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDocument")().asInstanceOf[js.UndefOr[Document]]
  
  @scala.inline
  def useWindow(): js.UndefOr[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindow")().asInstanceOf[js.UndefOr[Window]]
}

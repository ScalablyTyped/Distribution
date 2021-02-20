package typings.officeUiFabricReact

import typings.fluentuiReactWindowProvider.windowProviderMod.WindowProviderProps
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.std.Document
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowProviderMod {
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "WindowContext")
  @js.native
  val WindowContext: Context[WindowProviderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "WindowProvider")
  @js.native
  val WindowProvider: FunctionComponent[WindowProviderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "useDocument")
  @js.native
  def useDocument(): js.UndefOr[Document] = js.native
  
  @JSImport("office-ui-fabric-react/lib/WindowProvider", "useWindow")
  @js.native
  def useWindow(): js.UndefOr[Window] = js.native
}

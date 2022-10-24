package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ClearToolbarProps
import typings.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ToolbarContextType
import typings.orbitUiReactComponents.distToolbarSrcToolbarContextMod.UseToolbarPropsReturn
import typings.orbitUiReactComponents.distToolbarSrcToolbarMod.InnerToolbarProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarMod {
  
  @JSImport("@orbit-ui/react-components/dist/toolbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearToolbar(param0: ClearToolbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearToolbar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToolbar(param0: InnerToolbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToolbar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/toolbar", "Toolbar")
  @js.native
  val Toolbar: OrbitComponent[HTMLElement, InnerToolbarProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/toolbar", "ToolbarContext")
  @js.native
  val ToolbarContext: Context[ToolbarContextType] = js.native
  
  inline def useToolbarContext(): js.Tuple2[ToolbarContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarContext")().asInstanceOf[js.Tuple2[ToolbarContextType, Boolean]]
  
  inline def useToolbarProps(): js.Tuple2[UseToolbarPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarProps")().asInstanceOf[js.Tuple2[UseToolbarPropsReturn, Boolean]]
}

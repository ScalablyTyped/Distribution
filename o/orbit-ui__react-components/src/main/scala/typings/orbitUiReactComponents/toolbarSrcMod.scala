package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcToolbarMod.InnerToolbarProps
import typings.orbitUiReactComponents.toolbarContextMod.ClearToolbarProps
import typings.orbitUiReactComponents.toolbarContextMod.ToolbarContextType
import typings.orbitUiReactComponents.toolbarContextMod.UseToolbarPropsReturn
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearToolbar(hasChildren: ClearToolbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearToolbar")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToolbar(
    hasAutoFocusOrientationAlignVerticalAlignGapWrapDisabledAsChildrenForwardedRefRest: InnerToolbarProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToolbar")(hasAutoFocusOrientationAlignVerticalAlignGapWrapDisabledAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src", "Toolbar")
  @js.native
  val Toolbar: OrbitComponent[HTMLElement, InnerToolbarProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/toolbar/src", "ToolbarContext")
  @js.native
  val ToolbarContext: Context[ToolbarContextType] = js.native
  
  inline def useToolbarContext(): js.Tuple2[ToolbarContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarContext")().asInstanceOf[js.Tuple2[ToolbarContextType, Boolean]]
  
  inline def useToolbarProps(): js.Tuple2[UseToolbarPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarProps")().asInstanceOf[js.Tuple2[UseToolbarPropsReturn, Boolean]]
}

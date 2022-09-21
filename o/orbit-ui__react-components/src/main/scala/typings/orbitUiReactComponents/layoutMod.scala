package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.adaptersMod.Alignment
import typings.orbitUiReactComponents.adaptersMod.Orientation
import typings.orbitUiReactComponents.anon.AlignItems
import typings.orbitUiReactComponents.anon.Direction
import typings.orbitUiReactComponents.flexMod.InnerFlexProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.inlineMod.InnerInlineProps
import typings.orbitUiReactComponents.stackMod.InnerStackProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  @JSImport("@orbit-ui/react-components/dist/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/layout", "Flex")
  @js.native
  val Flex: OrbitComponent[HTMLElement, InnerFlexProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/layout", "Inline")
  @js.native
  val Inline: OrbitComponent[HTMLElement, InnerInlineProps] = js.native
  
  inline def InnerFlex(
    hasDirectionInlineReverseAlignContentAlignItemsJustifyContentGapWrapFluidHasWidthHeightStyleChildrenForwardedRefRest: InnerFlexProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFlex")(hasDirectionInlineReverseAlignContentAlignItemsJustifyContentGapWrapFluidHasWidthHeightStyleChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerInline(hasAlignVerticalAlignChildrenGapWrapForwardedRefRest: InnerInlineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerInline")(hasAlignVerticalAlignChildrenGapWrapForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerStack(hasAlignVerticalAlignGapWrapChildrenForwardedRefRest: InnerStackProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerStack")(hasAlignVerticalAlignGapWrapChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/layout", "Stack")
  @js.native
  val Stack: OrbitComponent[HTMLElement, InnerStackProps] = js.native
  
  inline def useFlexAlignment(orientation: Orientation, align: Alignment, verticalAlign: Alignment): AlignItems = (^.asInstanceOf[js.Dynamic].applyDynamic("useFlexAlignment")(orientation.asInstanceOf[js.Any], align.asInstanceOf[js.Any], verticalAlign.asInstanceOf[js.Any])).asInstanceOf[AlignItems]
  
  inline def useFlexDirection(orientation: Orientation): Direction = ^.asInstanceOf[js.Dynamic].applyDynamic("useFlexDirection")(orientation.asInstanceOf[js.Any]).asInstanceOf[Direction]
}

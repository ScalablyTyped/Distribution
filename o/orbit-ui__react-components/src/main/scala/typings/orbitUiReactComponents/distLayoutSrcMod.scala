package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.AlignItems
import typings.orbitUiReactComponents.anon.Direction
import typings.orbitUiReactComponents.distLayoutSrcAdaptersMod.Alignment
import typings.orbitUiReactComponents.distLayoutSrcAdaptersMod.Orientation
import typings.orbitUiReactComponents.distLayoutSrcFlexMod.InnerFlexProps
import typings.orbitUiReactComponents.distLayoutSrcInlineMod.InnerInlineProps
import typings.orbitUiReactComponents.distLayoutSrcStackMod.InnerStackProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayoutSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/layout/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/layout/src", "Flex")
  @js.native
  val Flex: OrbitComponent[HTMLElement, InnerFlexProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/layout/src", "Inline")
  @js.native
  val Inline: OrbitComponent[HTMLElement, InnerInlineProps] = js.native
  
  inline def InnerFlex(param0: InnerFlexProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFlex")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerInline(param0: InnerInlineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerInline")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerStack(param0: InnerStackProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerStack")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/layout/src", "Stack")
  @js.native
  val Stack: OrbitComponent[HTMLElement, InnerStackProps] = js.native
  
  inline def useFlexAlignment(orientation: Orientation, align: Alignment, verticalAlign: Alignment): AlignItems = (^.asInstanceOf[js.Dynamic].applyDynamic("useFlexAlignment")(orientation.asInstanceOf[js.Any], align.asInstanceOf[js.Any], verticalAlign.asInstanceOf[js.Any])).asInstanceOf[AlignItems]
  
  inline def useFlexDirection(orientation: Orientation): Direction = ^.asInstanceOf[js.Dynamic].applyDynamic("useFlexDirection")(orientation.asInstanceOf[js.Any]).asInstanceOf[Direction]
}

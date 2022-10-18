package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distMenuSrcMenuContextMod.MenuContextType
import typings.orbitUiReactComponents.distMenuSrcMenuItemMod.InnerMenuItemProps
import typings.orbitUiReactComponents.distMenuSrcMenuMod.InnerMenuProps
import typings.orbitUiReactComponents.distMenuSrcMenuSectionMod.InnerMenuSectionProps
import typings.orbitUiReactComponents.distMenuSrcMenuTriggerContextMod.MenuTriggerContextType
import typings.orbitUiReactComponents.distMenuSrcMenuTriggerMod.InnerMenuTriggerProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMenuMod {
  
  @JSImport("@orbit-ui/react-components/dist/menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMenu(
    hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerMenuProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenu")(hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMenuItem(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest: InnerMenuItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenuItem")(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMenuSection(hasIdTitleAsChildrenForwardedRefRest: InnerMenuSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenuSection")(hasIdTitleAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMenuTrigger(props: InnerMenuTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenuTrigger")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/menu", "ItemKeyProp")
  @js.native
  val ItemKeyProp: /* "data-o-ui-key" */ String = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu", "Menu")
  @js.native
  val Menu: OrbitComponent[HTMLElement, InnerMenuProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu", "MenuContext")
  @js.native
  val MenuContext: Context[MenuContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu", "MenuItem")
  @js.native
  val MenuItem: OrbitComponent[HTMLElement, InnerMenuItemProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu", "MenuSection")
  @js.native
  val MenuSection: OrbitComponent[HTMLElement, InnerMenuSectionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu", "MenuTrigger")
  @js.native
  val MenuTrigger: OrbitComponent[HTMLElement, InnerMenuTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu", "MenuTriggerContext")
  @js.native
  val MenuTriggerContext: Context[MenuTriggerContextType] = js.native
  
  inline def useMenuContext(): MenuContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuContext")().asInstanceOf[MenuContextType]
  
  inline def useMenuTriggerContext(): MenuTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuTriggerContext")().asInstanceOf[MenuTriggerContextType]
}

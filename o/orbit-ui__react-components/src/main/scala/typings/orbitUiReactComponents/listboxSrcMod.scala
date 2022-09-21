package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.listboxContextMod.ListboxContextType
import typings.orbitUiReactComponents.listboxOptionMod.InnerListboxOptionProps
import typings.orbitUiReactComponents.listboxSectionMod.InnerListboxSectionProps
import typings.orbitUiReactComponents.srcListboxMod.InnerListboxProps
import typings.orbitUiReactComponents.srcListboxMod.ListboxElement
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listboxSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerListbox(
    hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeOnFocusChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFocusOnHoverUseVirtualFocusTabbableFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerListboxProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListbox")(hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeOnFocusChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFocusOnHoverUseVirtualFocusTabbableFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListboxOption(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest: InnerListboxOptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxOption")(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListboxSection(hasIdTitleAsChildrenForwardedRefRest: InnerListboxSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxSection")(hasIdTitleAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "Listbox")
  @js.native
  val Listbox: OrbitComponent[ListboxElement, InnerListboxProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "ListboxContext")
  @js.native
  val ListboxContext: Context[ListboxContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "ListboxOption")
  @js.native
  val ListboxOption: OrbitComponent[HTMLElement, InnerListboxOptionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "ListboxSection")
  @js.native
  val ListboxSection: OrbitComponent[HTMLElement, InnerListboxSectionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src", "OptionKeyProp")
  @js.native
  val OptionKeyProp: /* "data-o-ui-key" */ String = js.native
  
  inline def useListboxContext(): ListboxContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useListboxContext")().asInstanceOf[ListboxContextType]
}

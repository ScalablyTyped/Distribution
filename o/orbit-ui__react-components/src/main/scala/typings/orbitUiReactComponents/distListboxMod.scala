package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distListboxSrcListboxContextMod.ListboxContextType
import typings.orbitUiReactComponents.distListboxSrcListboxMod.InnerListboxProps
import typings.orbitUiReactComponents.distListboxSrcListboxMod.ListboxElement
import typings.orbitUiReactComponents.distListboxSrcListboxOptionMod.InnerListboxOptionProps
import typings.orbitUiReactComponents.distListboxSrcListboxSectionMod.InnerListboxSectionProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListboxMod {
  
  @JSImport("@orbit-ui/react-components/dist/listbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerListbox(param0: InnerListboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListbox")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListboxOption(param0: InnerListboxOptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxOption")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListboxSection(param0: InnerListboxSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxSection")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/listbox", "Listbox")
  @js.native
  val Listbox: OrbitComponent[ListboxElement, InnerListboxProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox", "ListboxContext")
  @js.native
  val ListboxContext: Context[ListboxContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox", "ListboxOption")
  @js.native
  val ListboxOption: OrbitComponent[HTMLElement, InnerListboxOptionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox", "ListboxSection")
  @js.native
  val ListboxSection: OrbitComponent[HTMLElement, InnerListboxSectionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox", "OptionKeyProp")
  @js.native
  val OptionKeyProp: /* "data-o-ui-key" */ String = js.native
  
  inline def useListboxContext(): ListboxContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useListboxContext")().asInstanceOf[ListboxContextType]
}

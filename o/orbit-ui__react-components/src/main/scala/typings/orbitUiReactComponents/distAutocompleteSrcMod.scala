package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distAutocompleteSrcAutocompleteMod.InnerAutocompleteProps
import typings.orbitUiReactComponents.distAutocompleteSrcHiddenAutocompleteMod.HiddenAutocompleteProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAutocompleteSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/autocomplete/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/autocomplete/src", "Autocomplete")
  @js.native
  val Autocomplete: OrbitComponent[input, InnerAutocompleteProps] = js.native
  
  object HiddenAutocomplete {
    
    inline def apply(param0: HiddenAutocompleteProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/autocomplete/src", "HiddenAutocomplete")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/autocomplete/src", "HiddenAutocomplete.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def InnerAutocomplete(props: InnerAutocompleteProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
